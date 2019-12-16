package com.cognizant.Vehicle_RS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bk_id")
	private int id;
		
	@Column(name="bk_booking_start")
	private Date bookingStart;
	
	@Column(name="bk_booking_end")
	private Date bookingEnd;
	
	@Column(name="bk_price")
	private float price;
	
	@OneToOne
	@JoinColumn(name="bk_us_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="bk_vh_id")
	private Vehicle vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBookingStart() {
		return bookingStart;
	}

	public void setBookingStart(Date bookingStart) {
		this.bookingStart = bookingStart;
	}

	public Date getBookingEnd() {
		return bookingEnd;
	}

	public void setBookingEnd(Date bookingEnd) {
		this.bookingEnd = bookingEnd;
	}

//	public User getUser() {
//		return user;
//	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingStart=" + bookingStart + ", bookingEnd=" + bookingEnd + ", price="
				+ price + "]";
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int id, Date bookingStart, Date bookingEnd, float price, Vehicle vehicle) {
		super();
		this.id = id;
		this.bookingStart = bookingStart;
		this.bookingEnd = bookingEnd;
		this.price = price;
		this.vehicle = vehicle;
	}
	




}
