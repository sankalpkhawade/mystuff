package com.cts.authentication.service.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.authentication.service.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByName(String name);
	
	User findByEmail(String email);
}
