package com.programiz.reflection.app;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionDemo4 {

	public static void main(String[] args) {
		try {
			Dog d1 = new Dog();
			
			// create an object of the class Class
			Class<? extends Dog> obj = d1.getClass();
			// accessing the private field
			Field field = obj.getDeclaredField("color");
			// making the private field accessible
			field.setAccessible(true);
			// set the value of color
			field.set(d1, "brown");
			// get the value of type converting in string
			String colorValue = (String)field.get(d1);
			System.out.println("Color: " + colorValue );
			// get the access modifier of color
			int mod = field.getModifiers();
			String modifier = Modifier.toString(mod);
			System.out.println("Modifier: " + modifier);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
