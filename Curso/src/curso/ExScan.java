package curso;

import java.util.Locale;
import java.util.Scanner;

public class ExScan {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		String name;
		String lastName;
		int age;
		int numberOfBedrooms;
		double price;
		double height;
		System.out.println("Enter your full name: ");
		name = in.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		numberOfBedrooms = in.nextInt();
		System.out.println("Enter product price: ");
		price = in.nextDouble();
		System.out.println("Enter your last name, age and height (same line): ");
		lastName = in.next();
		age = in.nextInt();
		height = in.nextDouble();
		System.out.println("------------------------------------------");
		System.out.printf("%s,%n%dbedrooms,%n%.2f,%n%s,%n%d,%n%.2f ",
				name,
				numberOfBedrooms,
				price,
				lastName,
				age,
				height);
		in.close();
	}

}
