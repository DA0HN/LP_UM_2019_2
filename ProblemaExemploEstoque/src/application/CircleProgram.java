package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class CircleProgram {
	
	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner in = new Scanner(System.in);
			
			//Calculator calculator = new Calculator();
			
			System.out.print("Enter radius: ");
			double radius = in.nextDouble();
			
			//double c = circumference(radius);
			//double v = volume(radius);
			
			System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
			System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
			
			in.close();
	}

}
