package com.programiz.reflection.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class DemoDog2 {
   public DemoDog2() {
      
   }
   public DemoDog2(int age) {
      
   }
   private DemoDog2(String sound, String type) {
      
   }
}

public class ReflectionDemo6 {

	public static void main(String[] args) {
		
		try {
			DemoDog2 d = new DemoDog2();
			Class<? extends DemoDog2> obj = d.getClass();
			
			// get all the constructors in a class using getDeclaredConstructor()
			Constructor[] constructors = obj.getDeclaredConstructors();
			
			for(Constructor<?> c : constructors) {
				// get names of constructors
				System.out.println("Constructor Name: " + c.getName());
				
				// get access modifier of constructors
				int modifier = c.getModifiers();
				System.out.println("Modifier: " + Modifier.toString(modifier));
				
				// get the number of parameters in constructors
				System.out.println("Parameters: " + c.getParameterCount());
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
