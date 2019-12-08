package aula176.predicate;

import java.util.Calendar;

import aula176.interfaces.CarrosPredicate;
import aula176.model.Carro;

public class CarrosDezAnosRecentePredicate implements CarrosPredicate{

	@Override public boolean test(Carro carro) {
		return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
	}

}
