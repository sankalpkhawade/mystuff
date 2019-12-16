package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	// static Map<String, Object> cou = new HashMap<>();

	@Autowired
	CountryService countryService;

	@GetMapping("countries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}

	// @SuppressWarnings("resource")
	// @RequestMapping(value = "/country", method = RequestMethod.GET)
	// public String getCountryIndia() throws CountryNotFoundException {
	//
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("country.xml");
	// Country country = (Country) context.getBean("country", Country.class);
	//
	// // return countryservice.findCountryByCode("IN");
	//
	// return country.toString();
	// }
	//
	// @SuppressWarnings({ "resource", "unchecked" })
	// @GetMapping("/countries")
	// public List<Country> getCountries() {
	//// ArrayList<Country> anotherCountry = null;
	//// ApplicationContext context = new
	// ClassPathXmlApplicationContext("country.xml");
	//// Object object = context.getBean("countryList");
	//// anotherCountry = (ArrayList<Country>) object;
	//// LOGGER.debug("Country : {}", anotherCountry);
	//// return anotherCountry;
	// return countryService.getAllCountries();
	// }
	//
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable("code") String code)
			throws CountryNotFoundException, ClassNotFoundException {

		return countryService.findCountryByCode(code);
	}

	@RequestMapping(value = "countries", method = RequestMethod.POST)
	public Country addCountries(@RequestBody Country country) {
		return countryService.addCountry(country);
	}

	@RequestMapping(value = "countries", method = RequestMethod.PUT)
	public Country updateCountries(@RequestBody Country country) {
		return countryService.updateCountry(country.getCode(), country.getName());
	}

	@RequestMapping(value = "/countries/{code}", method = RequestMethod.DELETE)
	public void removeCountries(@PathVariable("code") String code, @RequestBody Country country) {
		countryService.deleteCountry(code);

	}

	// @SuppressWarnings({ "resource", "unchecked" })
	// @RequestMapping(value = "/countries/{code}", method = RequestMethod.PUT)
	// public ArrayList<Country> postCountries(@PathVariable("code") String
	// code, @RequestBody Country country) {
	// ArrayList<Country> anotherCountry = null;
	// cou.remove(code);
	// country.setCode("IND");
	// cou.put(country.getCode(), country);
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("country.xml");
	// Object object = context.getBean("countryList");
	// anotherCountry = (ArrayList<Country>) object;
	// LOGGER.debug("Country : {}", anotherCountry);
	// return anotherCountry;
	// }

	@RequestMapping("/countri")
	@ResponseBody
	public List<Country> searchByKey(@RequestParam(defaultValue = "ell") String key) {
		return countryService.searchByCode(key);

	}
}
