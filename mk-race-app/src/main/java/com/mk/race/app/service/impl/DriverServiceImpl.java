/**
 * 
 */
package com.mk.race.app.service.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mk.race.app.entity.Driver;
import com.mk.race.app.repository.DriverRepository;
import com.mk.race.app.service.DriverService;



/**
 */
@RestController
@RequestMapping("/v1/driver")
@Api(value = "Driver Management services")
public class DriverServiceImpl implements DriverService {
	
	@Autowired
	DriverRepository driverRepository;	

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value="/", method = RequestMethod.GET)
	@ApiOperation(value = "Get list of drivers from DB", notes = "Get list of drivers from DB")
	public List<Driver> getDrivers() {
		return (List<Driver>) driverRepository.findAll();
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value ="/firstName/{firstName}", method = RequestMethod.GET)
	@ApiOperation(value = "Get driver by first name", notes = "Get driver by first name")
	public List<Driver> getDriverByFirstName(@PathVariable String firstName) {
		List<Driver> result = driverRepository.findByFirstNameQuery(firstName);
		return result;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value ="/firstName/{firstName}/lastName/{lastName}", method = RequestMethod.GET)
	@ApiOperation(value = "Get driver by first name and last name", notes = "Get driver by first name and last name")
	public List<Driver> getDriverByFirstName(@PathVariable String firstName, @PathVariable String lastName) {
		List<Driver> result = driverRepository.findByFirstNameAndLastName(firstName, lastName);
		return result;
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value ="/lastName/{lastName}", method = RequestMethod.GET)
	@ApiOperation(value = "Get driver by last name", notes = "Get driver by last name")
	public List<Driver> getDriverByLastName(@PathVariable String lastName) {
		List<Driver> result = driverRepository.findByLastName(lastName);
		return result;
	}
	
}
