package com.cts.search.service.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.search.service.SearchServiceApplication;
import com.cts.search.service.model.User;
import com.cts.search.service.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchServiceApplication.class);

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User nameUser = userRepository.findByName(name);
		User emailUser = userRepository.findByEmail(name);
		LOGGER.info("User Name/Email: " + name);
		LOGGER.info("Name User: {}"+nameUser);
		LOGGER.info("Email User: {}"+emailUser);
		if (nameUser == null && emailUser == null) {
			LOGGER.info("arey babaai pani cheiiii : {}"+emailUser);
			throw new UsernameNotFoundException(name);
		} else {
			if (nameUser != null) {
				LOGGER.info("Pani Cheiyaku pls : {}"+nameUser);
				AppUser appUser = new AppUser(nameUser);
				return appUser;
			} else {
				LOGGER.info("Pani Chei pls : {}"+emailUser);
				AppUser appUser = new AppUser(emailUser);
				return appUser;
			}
		}
	}
}
