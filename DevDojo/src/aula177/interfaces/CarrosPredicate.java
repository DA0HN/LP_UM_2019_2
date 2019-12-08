package aula177.interfaces;

import aula177.model.Carro;

@FunctionalInterface
public interface CarrosPredicate {
	boolean test(Carro carro);
	// (parametro) -> <expressao>
}
