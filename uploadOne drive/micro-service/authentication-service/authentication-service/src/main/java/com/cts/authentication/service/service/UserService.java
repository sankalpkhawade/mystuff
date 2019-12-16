package com.cts.authentication.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.authentication.service.model.User;
import com.cts.authentication.service.repositry.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void register(User user) {
		userRepository.save(user);
	}

}
