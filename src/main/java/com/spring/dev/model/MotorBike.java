package com.spring.dev.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.dev.modelinterface.Vehicle;


@Component
@Qualifier("motor")
public class MotorBike implements Vehicle{
	
	@Value("40")
	private int maxSpeed;
	
		
	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public void move() {
		System.out.println("Fuel Type is Diesel");
		System.out.println("Max Speed "+maxSpeed);
		System.out.println("Motor Bike is started. Happy Journey!");
	}

}
