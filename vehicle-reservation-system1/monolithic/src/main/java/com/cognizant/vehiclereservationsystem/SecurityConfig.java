package com.cognizant.vehiclereservationsystem;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.cognizant.vehiclereservationsystem.security.AppUserDetailsService;
import com.cognizant.vehiclereservationsystem.security.JwtAuthorizationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(VehicleReservationSystemApplication.class);

	@Autowired
	AppUserDetailsService appUserDetailsService;

	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// auth.userDetailsService(inMemoryUserDetailsManager());
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		LOGGER.info("Start");
		return new BCryptPasswordEncoder();
	}

	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		LOGGER.info("Start");
		List<UserDetails> userDetailsList = new ArrayList<>();

		userDetailsList.add(User.withUsername("user").password(passwordEncoder().encode("pwd")).roles("USER").build());

		userDetailsList
				.add(User.withUsername("admin").password(passwordEncoder().encode("pwd")).roles("ADMIN").build());
		userDetailsList.add(
				User.withUsername("masteradmin").password(passwordEncoder().encode("pwd")).roles("DEFAULT").build());

		LOGGER.info("End");
		return new InMemoryUserDetailsManager(userDetailsList);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.cors();
		httpSecurity.csrf().disable().httpBasic().and().authorizeRequests().antMatchers("/users").permitAll()
				.antMatchers("/vehicle").permitAll().antMatchers("/authenticate").hasAnyRole("USER", "ADMIN", "DEFAULT")
				.anyRequest().authenticated().and().addFilter(new JwtAuthorizationFilter(authenticationManager()));

		httpSecurity.csrf().disable().httpBasic().and().addFilter(new JwtAuthorizationFilter(authenticationManager()));
	}
}
