package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = in.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = in.nextDouble();
		System.out.print("Tax: ");
		employee.tax = in.nextDouble();
		
		System.out.println("Employee: "+employee);
		
		System.out.print("Which percentage to increase salary: ");
		double porcentage = in.nextDouble();
		employee.increaseSalary(porcentage);
		
		System.out.println("Updated data: "+ employee);
		in.close();
	}	
}