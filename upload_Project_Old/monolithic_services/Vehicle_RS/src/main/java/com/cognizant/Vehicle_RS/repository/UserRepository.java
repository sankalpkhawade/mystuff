package com.cognizant.Vehicle_RS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cognizant.Vehicle_RS.model.User;
import com.cognizant.Vehicle_RS.model.Vehicle;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);

	List<User> findAllByStatus(String string);

}
