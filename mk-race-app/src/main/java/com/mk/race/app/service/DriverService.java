/**
 * 
 */
package com.mk.race.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mk.race.app.entity.Driver;

/**
 *
 */

public interface DriverService {

	public List<Driver> getDrivers();	
	public List<Driver> getDriverByFirstName(String firstName);
	public List<Driver> getDriverByFirstName(String firstName, String lastName);
	public List<Driver> getDriverByLastName(String lastName);
}
