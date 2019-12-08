package com.medium.buider_pattern.app;

import com.medium.buider_pattern.model.Person;

public class App {

	public static void main(String[] args) {
		
		Person p = Person.builder
				.setAge(15)
				.setFirstName("Gabriel")
				.setMiddleName("José")
				.setLastName("Honda")
				.build();
		
		System.out.println("Pessoa 1: " + p);
		
	}
	
}
