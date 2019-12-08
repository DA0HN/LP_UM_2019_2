package programacaoFuncional_LAMBDA.parametersFunction.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import programacaoFuncional_LAMBDA.entities.Product;
import programacaoFuncional_LAMBDA.parametersFunction.model.service.ProductService;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		ProductService pService = new ProductService();
		
		Predicate<Product> sumWhenCharEqualsT = p -> p.getName().charAt(0) == 'T';
		Predicate<Product> sumWhenLessThan100 = p -> p.getPrice() <= 100;
		
		double sum = pService.filteredSum(list, sumWhenLessThan100);
		sum = pService.filteredSum(list, sumWhenCharEqualsT);
		
		System.out.println("Sum: " + String.format("%.2f", sum));
		
	}
}
