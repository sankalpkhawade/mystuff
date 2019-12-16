package com.cognizant.vehiclereservationsystem.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.vehiclereservationsystem.model.Vehicle;
import com.cognizant.vehiclereservationsystem.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	@GetMapping("/{userName}")
	public List<Vehicle> getMemberList(@PathVariable String userName) {
		return vehicleService.getVehicleList(userName);
	}

	@GetMapping("/veh/{number}")
	public Vehicle findVehicle(@PathVariable String number) {
		return vehicleService.findVehicle(number);
	}

	@PostMapping("")
	public void insertVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.insertVehicle(vehicle);
	}

	@PutMapping("/{number}")
	public void updateVehicle(@RequestBody Vehicle vehicle, @PathVariable String number) {
		vehicleService.updateVehicle(vehicle, number);
	}

	@DeleteMapping("/{number}")
	public void deleteVehicle(@PathVariable String number) {
		vehicleService.deleteVehicle(number);
	}

	@GetMapping("/price/{number}")
	public BigDecimal vehiclePrice(@PathVariable String number) {
		return vehicleService.vehiclePrice(number);
	}

}
