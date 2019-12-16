package com.cognizant.springlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {
		LOGGER.info("Inside getAllCountries");
		return countryRepository.findAll();

	}

	// @Transactional
	// public List<Country> getCountry(String code) throws
	// CountryNotFoundException {
	//
	// return countryRepository.findAll();
	// }

	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);
		if (!result.isPresent()) {
			throw new CountryNotFoundException();
		}
		Country country = result.get();
		return country;
	}

	@Transactional
	public Country addCountry(Country country) {
		return countryRepository.save(country);
	}

	@Transactional
	public Country updateCountry(String countryCode, String countryName) {
		Optional<Country> result = countryRepository.findById(countryCode);
		Country country = result.get();
		country.setName(countryName);
		return countryRepository.save(country);
	}

	@Transactional
	public void deleteCountry(String countryCode) {
		countryRepository.deleteById(countryCode);

	}

	@Transactional
	public List<Country> searchByCode(String countryName) {
		return countryRepository.findBynameContaining(countryName);

	}
}
