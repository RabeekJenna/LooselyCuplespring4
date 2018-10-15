package com.spring.dev.model;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.dev.modelinterface.Vehicle;

@Component
@Qualifier("car")
public class Car implements Vehicle{
	
	@Value("Petrol")
	private String fuelType;
	
	@Value("100")
	private int maxSpeed;
	
		
	public String getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public void move() {
		System.out.println("Fuel Type is "+fuelType);
		System.out.println("Max Speed "+maxSpeed);
		System.out.println("Car is started. Happy Journey!");
	}
	
	@Override
    public String toString() {
        return "Car [fuelType=" + fuelType + "]";
    }

}
