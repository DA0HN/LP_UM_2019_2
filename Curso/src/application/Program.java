package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();
		
		System.out.printf("Perimeter test: %.4f%n", x.perimeter());
		
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		in.close();

	}

}
