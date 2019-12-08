package aula177.lambdas;

import aula177.interfaces.CarrosPredicate;
import aula177.model.Carro;

public class LambdaTest {
	// anonima
	// function
	// concisa
	
	// (Carro carro) -> carro.getCor().equals("verde");
	// (String str) -> str.length();
	
	public static void main(String[] args) {
		
		CarrosPredicate carroPredicate = new CarrosPredicate() {
			@Override public boolean test(Carro carro) {
				return carro.getCor().equals("verde");
			}
		};
		
		CarrosPredicate carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
		
		System.out.println(carroPredicate.test(new Carro("verde", 2011)));
		System.out.println(carroPredicate2.test(new Carro("verde", 2016)));
	}
}
