package com.cognizant.vehiclereservationsystem.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.vehiclereservationsystem.model.Booking;
import com.cognizant.vehiclereservationsystem.model.User;
import com.cognizant.vehiclereservationsystem.model.Vehicle;
import com.cognizant.vehiclereservationsystem.repositories.BookingRepository;
import com.cognizant.vehiclereservationsystem.repositories.UserRepository;
import com.cognizant.vehiclereservationsystem.repositories.VehicleRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VehicleRepository vehicleRepository;

	@Transactional
	public void insertBooking(String uName, String vehicalNo, Date sDate, Date eDate) {
		User user = userRepository.findById(uName).get();
		Vehicle vehicle = vehicleRepository.findById(vehicalNo).get();

		Booking booking = new Booking();
		booking.setBookedDate(sDate);
		booking.setEndDate(eDate);
		booking.setVehicle(vehicle);
		booking.setUser(user);

		bookingRepository.save(booking);

	}
}
