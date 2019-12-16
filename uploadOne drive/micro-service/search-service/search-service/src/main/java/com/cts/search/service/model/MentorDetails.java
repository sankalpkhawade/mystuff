package com.cts.search.service.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "mentor_details")
public class MentorDetails {

	@Id
	@NotNull
	@Column(name = "md_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotEmpty(message = "please provide mentor username")
	@Size(max = 20)
	@Column(name = "md_username")
	private String userName;

	@NotEmpty(message = "please provide mentor firstname")
	@Size(max = 50)
	@Column(name = "md_firstname")
	private String firstName;

	@NotEmpty(message = "please provide mentor lastname")
	@Size(max = 50)
	@Column(name = "md_lastname")
	private String lastName;

	@NotEmpty(message = "please provide mentor email")
	@Email
	@Column(name = "md_email")
	private String email;

	@NotEmpty(message = "please provide mentor password")
	@Column(name = "md_password")
	private String password;

	@NotEmpty(message = "please provide mentor contact")
	@Column(name = "md_contact")
	private String contact;

	@NotEmpty(message = "please provide mentor linkedIn url")
	@Column(name = "md_linked_in_url")
	private String linkedInUrl;

	@NotNull(message = "please provide mentor experience")
	@Column(name = "md_exp")
	private float experience;

	@NotEmpty(message = "please provide status")
	@Column(name = "md_active")
	private String active;

	@JsonIgnore
	@OneToMany(mappedBy = "mentorDetails")
	private Set<MentorSkills> mentorSkills;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Set<MentorSkills> getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(Set<MentorSkills> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	@Override
	public String toString() {
		return "MentorDetails [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", contact=" + contact + ", linkedInUrl="
				+ linkedInUrl + ", experience=" + experience + ", active=" + active + "]";
	}

}
