package productApplication;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.Product;

public class productProgram {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			
			Product product = new Product();
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = in.nextLine();
			
			System.out.print("Price: ");
			product.price = in.nextDouble();
			
			System.out.print("Quantity in stock: ");
			product.quantity = in.nextInt();
			
			System.out.println();
			System.out.printf("product data: %s%n", product);
			
			System.out.print("Enter the number of products to be added in stock: ");
			int quantity = in.nextInt();
			product.addProducts(quantity);
			
			System.out.println();
			System.out.printf("updated data: %s%n", product);
			
			in.close();
		}
}

