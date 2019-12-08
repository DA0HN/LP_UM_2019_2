package provaTres.model;

import java.util.Comparator;

import provaTres.model.entities.Pessoa;

public class ComparadorDePessoa implements Comparator<Pessoa> {

	// 1 - Pessoa Fisica
	// 0 - Pessoa Juridica
	
	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		if( o1.getTipo() > o2.getTipo() ) {
			return -1;
		}
		else if( o1.getTipo() < o2.getTipo()) {
			return 1;
		}
		return o1.getNome().compareToIgnoreCase(o2.getNome());
	}

}
