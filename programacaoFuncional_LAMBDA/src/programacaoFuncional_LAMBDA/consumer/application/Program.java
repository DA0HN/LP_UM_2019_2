package programacaoFuncional_LAMBDA.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import programacaoFuncional_LAMBDA.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		double factor = 1.1;
		
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * factor );
		};
		
		// list.forEach( new PriceUpdate());
		// list.forEach( Product::nonStaticProductUpdate );
		// list.forEach( Product::staticProductUpdate );
		// list.forEach( cons );
		
		list.forEach( p -> p.setPrice( p.getPrice() * 1.1) );
		
		list.forEach(System.out::println);
		
	}

}
