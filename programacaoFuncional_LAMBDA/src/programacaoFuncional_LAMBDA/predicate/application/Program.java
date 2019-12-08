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
		
		list.removeIf( Product::nonStaticProductPredicate );	// Implementa��o por m�todo n�o est�tico
		list.removeIf( Product::staticProductPredicate ); // Implementa��o por m�todo est�tico
		list.removeIf( pred );	// Implementacao por Express�o Lambda Declarada
		list.removeIf( new ProductPredicate() );	// Implementacao por interface
		
		list.removeIf( p -> p.getPrice() >= 100.0 );	// Implementa��o por Express�o Lambda Inline
		
		for( Product p : list ) {
			System.out.println(p);
		}
		
	}
	
}
