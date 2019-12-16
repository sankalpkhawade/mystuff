package com.cognizant.vehiclereservationsystem.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

	@Id
	@Column(name = "vehicle_number")
	private String number;

	@Column(name = "vehicle_type")
	private String type;

	@Column(name = "vehicle_insurance_expiry_date")
	private Date insuranceExpiryDate;

	@Column(name = "vehicle_last_serviced_date")
	private Date lastServicedDate;

	@Column(name = "vehicle_service_due_date")
	private Date serviceDueDate;

	@Column(name = "vehicle_image")
	private String image;

	@Column(name = "vehicle_price")
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(name = "vehicle_branch_id")
	private Branch branch;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String number, String type, Date insuranceExpiryDate, Date lastServicedDate, Date serviceDueDate,
			String image, BigDecimal price) {
		super();
		this.number = number;
		this.type = type;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.lastServicedDate = lastServicedDate;
		this.serviceDueDate = serviceDueDate;
		this.image = image;
		this.price = price;
	}

	public Vehicle(String number, String type, Date insuranceExpiryDate, Date lastServicedDate, Date serviceDueDate,
			String image, BigDecimal price, Branch branch) {
		super();
		this.number = number;
		this.type = type;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.lastServicedDate = lastServicedDate;
		this.serviceDueDate = serviceDueDate;
		this.image = image;
		this.price = price;
		this.branch = branch;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getInsuranceExpiryDate() {
		return insuranceExpiryDate;
	}

	public void setInsuranceExpiryDate(Date insuranceExpiryDate) {
		this.insuranceExpiryDate = insuranceExpiryDate;
	}

	public Date getLastServicedDate() {
		return lastServicedDate;
	}

	public void setLastServicedDate(Date lastServicedDate) {
		this.lastServicedDate = lastServicedDate;
	}

	public Date getServiceDueDate() {
		return serviceDueDate;
	}

	public void setServiceDueDate(Date serviceDueDate) {
		this.serviceDueDate = serviceDueDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", type=" + type + ", insuranceExpiryDate=" + insuranceExpiryDate
				+ ", lastServicedDate=" + lastServicedDate + ", serviceDueDate=" + serviceDueDate + ", image=" + image
				+ ", price=" + price + ", branch=" + branch + "]";
	}

}
