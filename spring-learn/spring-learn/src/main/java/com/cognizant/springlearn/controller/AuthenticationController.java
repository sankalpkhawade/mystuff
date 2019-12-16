package com.cognizant.springlearn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@GetMapping(value = "/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
		LOGGER.info("START");
		Map<String, String> map = new HashMap<>();
		map.put("token", "");
		LOGGER.debug(authHeader);
		LOGGER.info("END");
		String user = getUser(authHeader);
		LOGGER.info(user);
		String token = generateJwt(user);
		LOGGER.info(token);
		map.put("token", token);
		return map;
	}

	private String getUser(String authHeader) {
		String encoded = authHeader.substring(6).toString();
		Base64.Decoder decoder = Base64.getDecoder();
		String decoded = new String(decoder.decode(encoded.getBytes()));
		return decoded;
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
