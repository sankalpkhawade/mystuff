package com.cognizant.vehiclereservationsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.vehiclereservationsystem.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}