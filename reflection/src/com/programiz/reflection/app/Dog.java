package com.programiz.reflection.app;

class Dog implements Animal {
	
	public String type;
	private String color;
	
	@Override public void display() {
		System.out.println("Bark bark");
	}
}
