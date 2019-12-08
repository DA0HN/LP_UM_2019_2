package programacaoFuncional_LAMBDA.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import programacaoFuncional_LAMBDA.entities.Product;
import programacaoFuncional_LAMBDA.function.util.UpperCaseName;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		/*
		 * A função "map" ( não confunda com a estrutura de dados Map ) é uma
		 * função que aplica uma função a todos os elementos de uma stream
		 * */
		
		Function<Product, String> funcao = p -> {
			return p.getName().toUpperCase();
		};
		
		List<String> names = list.stream().	// converte a lista para stream()
				map( new UpperCaseName() ).	// aplica a funcao para todo o stream
				collect( Collectors.toList() );	// converte o stream para lista
		
		names = list.stream().map( Product::nonStaticUpperCaseName ).collect( Collectors.toList() );
		names = list.stream().map( Product::staticUpperCaseName ).collect( Collectors.toList() );
		names = list.stream().map( p -> p.getName().toUpperCase() ).collect( Collectors.toList() );
		names = list.stream().map( funcao ).collect( Collectors.toList() );
		
		names.forEach(System.out::println);
		
	}
	
}
