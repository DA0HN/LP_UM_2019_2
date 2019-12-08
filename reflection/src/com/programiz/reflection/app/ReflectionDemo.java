package com.programiz.reflection.app;

public class ReflectionDemo {
	
	public static void main(String[] args) {
		try {
			// create an object of Dog Class
			Dog d1 = new Dog();
			
			// create an object of Class using getClass()
			Class<? extends Dog> obj = d1.getClass();
			
			// find the interfaces implemented by Dog
			Class<?>[] objInterface = obj.getInterfaces();
			
			for( Class<?> c : objInterface ) {
				// print the name of interfaces
				System.out.println("Interface name: " + c.getName());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
