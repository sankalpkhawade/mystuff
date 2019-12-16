package com.cognizant.Vehicle_RS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cognizant.Vehicle_RS.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
	

}
