package com.cognizant.Vehicle_RS.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Vehicle_RS.model.Vehicle;
import com.cognizant.Vehicle_RS.service.AppUserDetailsService;
import com.cognizant.Vehicle_RS.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@GetMapping
	public List<Vehicle> getAllVehicle(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String user = authentication.getName();
		if(user.equalsIgnoreCase("anonymousUser")){
			return vehicleService.getAllVehicle();
		}
		else{
			UserDetails userDetails = appUserDetailsService.loadUserByUsername(user);
			String role = userDetails.getAuthorities().toArray()[0].toString();
			if(role.equals("USER")){
				return vehicleService.getAllVehicle();
			}
			else{
				return vehicleService.getAllVehicle();
			}

		}
	}
	
	@GetMapping("/{id}")
	public Optional<Vehicle> getVehicleByID(@PathVariable int id){
		return vehicleService.getVehicleByID(id);
	}
	
	@PostMapping
	public Vehicle newVehicle(@RequestBody Vehicle vehicle){
		
		return vehicleService.newVehicle(vehicle);
	}
	
	@DeleteMapping("/{id}")
	public List<Vehicle> deleteVehicle( @PathVariable int id)
	{
		return vehicleService.deleteVehicle(id);
	}
	@PutMapping
	public void modifyVehicle(@RequestBody Vehicle vehicle){
		vehicleService.modifyVehicle(vehicle);
	}


}
