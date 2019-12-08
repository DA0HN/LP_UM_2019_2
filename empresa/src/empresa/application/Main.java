package empresa.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empresa.entities.Employee;
import empresa.entities.OutsourcedEmployee;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int numberEmployee = in.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for( int i=0; i < numberEmployee; i++ ) {
			
			System.out.printf("Employee #"+ (i+1) +" data:%n");
			
			System.out.print("Outsourced (y/n)?");
			char ch = in.next().charAt(0);
			
			in.nextLine();
			System.out.print("Name: ");
			String name = in.nextLine();
			
			System.out.print("Hours: ");
			int hour = in.nextInt();
		
			System.out.print("Value per hour: ");
			double valuePerHour = in.nextDouble();
			
			if( ch == 'y' ) {
				
				System.out.print("Additional charge: ");
				double additionalCharge = in.nextDouble();
				
				list.add( new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge)); 
			}
			else if( ch == 'n' ) {				
				list.add( new Employee(name, hour, valuePerHour));
			}
			
		}
		System.out.println("PAYMENTS: ");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		in.close();
	}
}
