package com.cognizant.vehiclereservationsystem.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cognizant.vehiclereservationsystem.VehicleReservationSystemApplication;
import com.cognizant.vehiclereservationsystem.model.User;

public class AppUser implements UserDetails {
	private User user; // entity reference
	private Collection<? extends GrantedAuthority> authorities; // to store role
	private static final Logger LOGGER = LoggerFactory.getLogger(VehicleReservationSystemApplication.class); // details

	public AppUser(User user) {
		// TODO Auto-generated constructor stub
		LOGGER.info("reger" + user.getPassword());
		this.authorities = user.getUserroleList().stream().map(role -> new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toList());
		LOGGER.info("Hello");
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}

	@Override
	public String getPassword() {

		return user.getPassword();
	}

	@Override
	public String getUsername() {

		return user.getId();
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
