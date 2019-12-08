package com.programiz.reflection.app;

import java.lang.reflect.Modifier;

public class ReflectionDemo2 {

	public static void main(String[] args) {
		// create an object of Dog class
		Dog d1 = new Dog();
		
		// create an object of Class using getClass();
		Class obj = d1.getClass();
		
		// get the access modifier of Dog in integer form
		int mod1 = obj.getModifiers();
		String modifier = Modifier.toString(mod1);
		System.out.println("Modifier: " + modifier);
		
		// find the superclass of Dog
		Class<?> superClass = obj.getSuperclass();
		System.out.println("Superclass: " + superClass.getName());
		
		
	}
	
}
