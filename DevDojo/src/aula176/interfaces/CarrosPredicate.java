package aula176.interfaces;

import aula176.model.Carro;

@FunctionalInterface
public interface CarrosPredicate {
	boolean test(Carro carro);
	// (parametro) -> <expressao>
}
