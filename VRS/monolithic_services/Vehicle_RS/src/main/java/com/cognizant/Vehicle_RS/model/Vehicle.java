package com.cognizant.Vehicle_RS.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vh_id")
	private int id;

	@Column(name = "vh_name")
	private String name;

	@Column(name = "vh_image")
	private String image;

	@Column(name = "vh_vehicle_no")
	private String vehicle_no;

	@Column(name = "vh_seater")
	private String seater;

	@Column(name = "vh_type")
	private String type;

	@Column(name = "vh_price")
	private double price;

	@Column(name = "vh_active")
	private boolean active;

	@Column(name = "vh_branch")
	private String branch;

	@Column(name = "vh_insurance_exp_date")
	private Date insurance_exp_date;

	@Column(name = "vh_last_service_date")
	private Date last_service_date;

	@Column(name = "vh_service_due_date")
	private Date service_due_date;
	@Column(name="vh_status")
	private boolean status;
	
	@OneToOne(mappedBy="vehicle")
	private Booking booking;

	
	
//	public Booking getBooking() {
//		return booking;
//	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getSeater() {
		return seater;
	}

	public void setSeater(String seater) {
		this.seater = seater;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getInsurance_exp_date() {
		return insurance_exp_date;
	}

	public void setInsurance_exp_date(Date insurance_exp_date) {
		this.insurance_exp_date = insurance_exp_date;
	}

	public Date getLast_service_date() {
		return last_service_date;
	}

	public void setLast_service_date(Date last_service_date) {
		this.last_service_date = last_service_date;
	}

	public Date getService_due_date() {
		return service_due_date;
	}

	public void setService_due_date(Date service_due_date) {
		this.service_due_date = service_due_date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", image=" + image + ", vehicle_no=" + vehicle_no + ", seater="
				+ seater + ", type=" + type + ", price=" + price + ", active=" + active + ", branch=" + branch
				+ ", insurance_exp_date=" + insurance_exp_date + ", last_service_date=" + last_service_date
				+ ", service_due_date=" + service_due_date + "]";
	}

	public Vehicle() {
	}

}
