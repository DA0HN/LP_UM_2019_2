package com.programiz.reflection.app;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionDemo3 {

	public static void main(String[] args) {
		try {
			
			Dog d1 = new Dog();
			
			// create an object of the Class
			Class<? extends Dog> obj = d1.getClass();
			
			// manipulating the public field type of Dog
			Field field = obj.getField("type");
			
			// set the value of field
			field.set(d1, "labrador");
			
			// get the value of field by converting in String
			String typeValue = (String)field.get(d1);
			System.out.println("type: " + typeValue);
			
			// get the access modifier of type
			int mod1 = field.getModifiers();
			String modifier = Modifier.toString(mod1);
			System.out.println("Modifier: " + modifier);
			System.out.println(" ");
		}
		catch( Exception e) {
			e.printStackTrace();
		}
	}
	
}
