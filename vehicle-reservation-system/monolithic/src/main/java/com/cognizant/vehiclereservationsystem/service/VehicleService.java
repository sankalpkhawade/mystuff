package com.cognizant.vehiclereservationsystem.service;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.vehiclereservationsystem.model.Vehicle;
import com.cognizant.vehiclereservationsystem.repositories.UserRepository;
import com.cognizant.vehiclereservationsystem.repositories.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public List<Vehicle> getVehicleList(String userName) {
		String role = userRepository.getRoleByUserName(userName);
		String branchName = userRepository.getBranchByUserName(userName);
		if (role.equals("ROLE_USER"))
			return vehicleRepository.getVehicleCustomerList(branchName);
		else
			return vehicleRepository.getVehicleAdminList(branchName);
	}

	@Transactional
	public Vehicle findVehicle(String number) {
		return vehicleRepository.findById(number).get();
	}

	@Transactional
	public void insertVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	@Transactional
	public void updateVehicle(Vehicle vehicle, String number) {
		vehicleRepository.save(vehicle);
	}

	@Transactional
	public void deleteVehicle(String number) {
		Vehicle vehicle = findVehicle(number);
		vehicleRepository.delete(vehicle);
	}

	@Transactional
	public BigDecimal vehiclePrice(String number) {
		return vehicleRepository.getPrice(number);
	}
}
