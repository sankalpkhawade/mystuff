package com.cognizant.vehiclereservationsystem.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id")
		private int id;
	
	@Column(name="role_name")
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy="userroleList")
	private Set<User> userlist;

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

	public Set<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(Set<User> userlist) {
		this.userlist = userlist;
	}
	
}
