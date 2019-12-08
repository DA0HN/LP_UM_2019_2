package aula176.predicate;

import aula176.interfaces.CarrosPredicate;
import aula176.model.Carro;

public class CarroCorVerdePredicate implements CarrosPredicate{

	@Override public boolean test(Carro carro) {
		return carro.getCor().equals("verde");
	}
	
}
