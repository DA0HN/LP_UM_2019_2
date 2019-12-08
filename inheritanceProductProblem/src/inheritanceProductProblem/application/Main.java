package inheritanceProductProblem.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import inheritanceProductProblem.entities.ImportedProduct;
import inheritanceProductProblem.entities.Product;
import inheritanceProductProblem.entities.UsedProduct;
import teclado.Teclado;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		int n = Teclado.leInt("Enter the number of products: ");
		
		for(int i=0; i < n; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Product #" + (i+1) + " data: ");
			char ch = Teclado.leString("Common, used or imported (c/u/i): ").charAt(0);
			if( ch == 'c' ) {
				list.add( new Product(
						Teclado.leString("Name: "),
						Teclado.leDouble("Price: ")
						));
			}
			else if( ch == 'u') {
				
				try {
					list.add( new UsedProduct(
							Teclado.leString("Name: "),
							Teclado.leDouble("Price: "),
							sdf.parse(Teclado.leString("Manufacture date (DD/MM/YYYY): "))
							));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			else {
				list.add(new ImportedProduct(
						Teclado.leString("Name: "),
						Teclado.leDouble("Price: "),
						Teclado.leDouble("Customs fee: ")
						));
			}
		}
		
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
	}

}
