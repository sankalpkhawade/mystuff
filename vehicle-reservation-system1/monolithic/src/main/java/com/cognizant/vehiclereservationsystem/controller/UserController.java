package com.cognizant.vehiclereservationsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.vehiclereservationsystem.exception.UserAlreadyExistsException;
import com.cognizant.vehiclereservationsystem.model.User;
import com.cognizant.vehiclereservationsystem.service.UserService;

import com.cognizant.vehiclereservationsystem.service.UserDetailsService;;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	private UserDetailsService userDetailService;

	@Autowired
	private InMemoryUserDetailsManager inUserDetails;

	@PostMapping
	public boolean signUp(@RequestBody @Valid User user) throws UserAlreadyExistsException {

		User user1 = new User();
		user1.setId(user.getId());
		String password = passwordEncoder().encode(user.getPassword());
		user1.setPassword(password);

		return userDetailService.signUp(user1);
		// if(inUserDetails.userExists(user.getUsername())){
		// return false;
		// }else{
		// System.out.println("Create User");
		// inUserDetails.createUser(org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
		// .password(passwordEncoder()
		// .encode(user.getPassword()))
		// .roles("USER").build());
		// return true;
		// }
	}

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
