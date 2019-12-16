package com.cognizant.vehiclereservationsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.vehiclereservationsystem.model.User;
import com.cognizant.vehiclereservationsystem.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional
	public List<User> getMemberRequestList(String uName) {
		String branchName = userRepository.getBranchByUserName(uName);
		return userRepository.getMemberRequestList(branchName);
	}

	@Transactional
	public void updateStatus(String uName, String status) {
		userRepository.updateStatus(uName, status);
	}

	@Transactional
	public User getUser(String uName) {
		return userRepository.findById(uName).get();
	}

}
