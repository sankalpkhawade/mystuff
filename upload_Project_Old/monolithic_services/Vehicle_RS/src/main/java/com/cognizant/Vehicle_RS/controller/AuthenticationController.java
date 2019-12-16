package com.cognizant.Vehicle_RS.controller;


import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Vehicle_RS.model.User;
import com.cognizant.Vehicle_RS.repository.UserRepository;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
		LOGGER.info("start");
		LOGGER.info(authHeader);
		Map<String, String> authmap = new HashMap<String, String>();
	
	
		String username = getUser(authHeader);
		
		User user = userRepository.findByUsername(username);
		if(user.getStatus().equalsIgnoreCase("A")){
			authmap.put("token", generateJwt(getUser(authHeader)));
			authmap.put("username", username);
			String role = user.getRoles().get(0).getName();
			String firstname = user.getFirstname();
			String lastname =user.getLastname();
			String age =Integer.toString(user.getAge());
			String gender = user.getGender();
			String contact = Long.toString(user.getContact());
			String email = user.getEmail();
			String branch = user.getBranch();
			String status=user.getStatus();
			authmap.put("role", role);
			authmap.put("firstname", firstname);
			authmap.put("lastname", lastname);
			authmap.put("age",age);
			authmap.put("gender",gender);
			authmap.put("contact", contact);
			authmap.put("email", email);
			authmap.put("branch", branch);
			authmap.put("status", status);
			LOGGER.info("END OF AUTH FUNCTION");
		}
		else{
			authmap.put("token", null);
		}
	
		return authmap;

	}

	private String getUser(String authHeader) {
		String encodedCredentials = authHeader.split(" ", 2)[1];
		String decoded = new String(Base64.getDecoder().decode(encodedCredentials));
		String user = decoded.substring(0, decoded.indexOf(':'));
		return user;
	}

	private String getPassword(String authHeader) {
		String encodedCredentials = authHeader.split(" ", 2)[1];
		String decoded = new String(Base64.getDecoder().decode(encodedCredentials));
		String pwd = decoded.substring(decoded.indexOf(':') + 1);
		return pwd;
	}

	private String generateJwt(String user) {
		JwtBuilder builder = Jwts.builder();
		builder.setSubject(user);

		// Set the token issue time as current time
		builder.setIssuedAt(new Date());

		// Set the token expiry as 20 minutes from now
		builder.setExpiration(new Date((new Date()).getTime() + 1200000));
		builder.signWith(SignatureAlgorithm.HS256, "secretkey");

		String token = builder.compact();

		return token;
	}

}
