package com.spring.dev.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.dev.model.Traveller;
import com.spring.dev.modelinterface.Journey;


public class App {
	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
	     context.scan("com.spring.dev"); 
	     context.refresh();
	     Journey j = (Journey)context.getBean(Traveller.class);
	     j.startJourney();
	     context.close();

	}
}
