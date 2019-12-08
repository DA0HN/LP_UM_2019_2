package programacaoFuncional_LAMBDA.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import programacaoFuncional_LAMBDA.entities.Product;
import programacaoFuncional_LAMBDA.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		Predicate<Product> pred = p -> p.getPrice() >= 100.0; 
		
		list.removeIf( Product::nonStaticProductPredicate );	// Implementação por método não estático
		list.removeIf( Product::staticProductPredicate ); // Implementação por método estático
		list.removeIf( pred );	// Implementacao por Expressão Lambda Declarada
		list.removeIf( new ProductPredicate() );	// Implementacao por interface
		
		list.removeIf( p -> p.getPrice() >= 100.0 );	// Implementação por Expressão Lambda Inline
		
		for( Product p : list ) {
			System.out.println(p);
		}
		
	}
	
}
