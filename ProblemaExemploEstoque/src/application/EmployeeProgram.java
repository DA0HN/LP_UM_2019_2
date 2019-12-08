package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("How many people will be registred?");
		int numberOfEmployee = in.nextInt();
		
		for( int i=0; i < numberOfEmployee; i++) {
			System.out.println("Employee #" + (i+1) + " :");
			
			System.out.println("Id: ");
			int id = in.nextInt();
			
			in.nextLine();
			
			System.out.println("Name: ");
			String name = in.nextLine();
			
			System.out.println("Salary: ");
			double grossSalary = in.nextDouble();
			
			list.add(new Employee(id, name, grossSalary) );
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = in.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if( emp == null ) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the porcentage: ");
			double percent = in.nextDouble();
			emp.increaseSalary(percent);
		}
		
		for( Employee e : list ) {
			System.out.println(e.toString());
		}
		
		in.close();
	}

}
