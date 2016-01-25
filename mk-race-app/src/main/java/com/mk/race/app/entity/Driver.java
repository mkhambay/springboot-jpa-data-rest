/**
 * 
 */
package com.mk.race.app.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 */
@Entity
@Table(name = "Driver")
public class Driver {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DRIVER_SEQ")
	@SequenceGenerator(name="DRIVER_SEQ",sequenceName="DRIVER_SEQ",allocationSize=1)
	@Column(name ="id")
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
