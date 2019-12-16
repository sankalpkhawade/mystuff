package com.cts.registration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.registration.service.model.User;
import com.cts.registration.service.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void register(User user) {
		userRepository.save(user);
	}

}
