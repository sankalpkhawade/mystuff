package com.cognizant.Vehicle_RS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.Vehicle_RS.model.Vehicle;
import com.cognizant.Vehicle_RS.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	public List<Vehicle> getAllVehicle() {
		List<Vehicle> vehicle = new ArrayList<Vehicle>();
		vehicleRepository.findAll().forEach(vehicle::add);
		return vehicle;

	}

	public Optional<Vehicle> getVehicleByID(int id) {

		return vehicleRepository.findById(id);
	}

	public Vehicle newVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	public List<Vehicle> deleteVehicle(int id) {
		Optional<Vehicle> veh = vehicleRepository.findById(id);
		Vehicle vehicle = veh.get();
		vehicleRepository.delete(vehicle);
		return (List<Vehicle>) vehicleRepository.findAll();

	}

	

	public void modifyVehicle(Vehicle vehicle) {
			vehicleRepository.save(vehicle);
		
	}

}
