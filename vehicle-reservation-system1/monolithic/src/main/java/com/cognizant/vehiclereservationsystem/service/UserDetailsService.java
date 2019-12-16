package com.cognizant.vehiclereservationsystem.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.vehiclereservationsystem.model.Role;
import com.cognizant.vehiclereservationsystem.model.User;
import com.cognizant.vehiclereservationsystem.repositories.RoleRepository;
import com.cognizant.vehiclereservationsystem.repositories.UserRepository;

@Service
public class UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Transactional
	public boolean signUp(User user){
		User dataBaseUser=userRepository.findByUserId(user.getId());
		if(dataBaseUser==null){
		Role role=roleRepository.findById(1);
	//	user.getUserroleList().add(role);
		Set<Role> roleList = new HashSet<>();
		roleList.add(role);
			user.setUserroleList(roleList);
			userRepository.save(user);
			return true;
		}else{
			return false;
		}
	}
}
