package com.spring.dev.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.dev.modelinterface.Journey;
import com.spring.dev.modelinterface.Vehicle;

@Component("tr")
public class Traveller implements Journey {

	// Setter Injection by Object or Bean
	@Autowired
	@Qualifier("car")
	private Vehicle vehicle;

	
	public Vehicle getVehicle() {
		return vehicle;
	}



	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney() {
		vehicle.move();
	}



	

}
