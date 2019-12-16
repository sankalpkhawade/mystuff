package com.cognizant.vehiclereservationsystem.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_first_name")
	private String firstName;

	@Column(name = "user_last_name")
	private String lastName;

	@Column(name = "user_age")
	private int age;

	@Column(name = "user_gender")
	private String gender;

	@Column(name = "user_contact_number")
	private String contactNumber;

	@Column(name = "user_email_id")
	private String emailId;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_role")
	private String role;

	@ManyToOne
	@JoinColumn(name = "user_branch_id")
	private Branch branch;

	@ManyToOne
	@JoinColumn(name = "user_status_id")
	private UserStatus userStatus;

	@ManyToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	private Set<Role> userroleList;

	public User() {
		super();
	}

	public User(String id, String firstName, String lastName, int age, String gender, String contactNumber,
			String emailId, String password, String role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}

	public User(String id, String firstName, String lastName, int age, String gender, String contactNumber,
			String emailId, String password, String role, Branch branch, UserStatus userStatus) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
		this.branch = branch;
		this.userStatus = userStatus;
	}

	public String getId() {
		return userId;
	}

	public void setId(String id) {
		this.userId = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}

	public Set<Role> getUserroleList() {
		return userroleList;
	}

	public void setUserroleList(Set<Role> userroleList) {
		this.userroleList = userroleList;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", password=" + password
				+ ", role=" + role + ", branch=" + branch + ", userStatus=" + userStatus + "]";
	}

}
