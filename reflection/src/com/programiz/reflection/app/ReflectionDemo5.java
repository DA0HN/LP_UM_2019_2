package com.programiz.reflection.app;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class DemoDog {
   public void display() {
      System.out.println("I am a dog.");
   }
   protected void eat() {
      System.out.println("I eat dog food.");
   }
   protected void makeSound() {
      System.out.println("Bark Bark");
   }
}


public class ReflectionDemo5 {
	
	public static void main(String[] args) {
		try {
			DemoDog d1 = new DemoDog();
			// create an object of Class
			Class<? extends DemoDog> obj = d1.getClass();
			// get all the methods using the getDeclaredMethod()
			Method[] methods = obj.getDeclaredMethods();
			// get the name of methods
			for(Method m : methods) {
				System.out.println("Method name: " + m.getName());
				// get the access modifier of methods
				int modifier = m.getModifiers();
				System.out.println("Modifier: " + Modifier.toString(modifier));
				// get the return types of method
				System.out.println("Return types: " + m.getReturnType());
				System.out.println(" ");
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
