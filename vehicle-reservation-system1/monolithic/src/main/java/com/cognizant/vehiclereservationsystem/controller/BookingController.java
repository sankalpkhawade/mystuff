package com.cognizant.vehiclereservationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.vehiclereservationsystem.model.Booking;
import com.cognizant.vehiclereservationsystem.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/{uName}/{vehicalNo}")
	public void insertBooking(@PathVariable String uName, @PathVariable String vehicalNo,
			@RequestBody Booking booking) {
		bookingService.insertBooking(uName, vehicalNo, booking.getBookedDate(), booking.getEndDate());

	}
}