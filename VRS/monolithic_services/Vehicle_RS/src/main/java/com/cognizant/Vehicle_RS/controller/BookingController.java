package com.cognizant.Vehicle_RS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Vehicle_RS.exception.BookingEmptyException;
import com.cognizant.Vehicle_RS.model.Booking;
import com.cognizant.Vehicle_RS.model.User;
import com.cognizant.Vehicle_RS.model.Vehicle;
import com.cognizant.Vehicle_RS.repository.UserRepository;
import com.cognizant.Vehicle_RS.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/{username}/{vehicleID}")
	public Booking addVehicleToBooking(@PathVariable String username, @PathVariable int vehicleID, @RequestBody Booking booking){
		
		
		return bookingService.addVehicleToBooking(username,vehicleID,booking);
	}
	@GetMapping("/{username}")
	public Booking viewBooking(@PathVariable String username) throws BookingEmptyException{
		
		User user= userRepository.findByUsername(username);
		if(user.getBooking()!=null){
			Booking booking= user.getBooking();
			Vehicle vehicle = booking.getVehicle();
			return booking;
		}
		
//		Booking booking = new Booking(getbooking.getId(),getbooking.getBookingStart(),getbooking.getBookingEnd(),getbooking.getPrice(),vehicle);
		return null;
	}
	
	@DeleteMapping("/{username}/{vehicleID}")
	public void CancelBooking(@PathVariable String username, @PathVariable int vehicleID){
		bookingService.CancelBooking(username,vehicleID);
	}
}
