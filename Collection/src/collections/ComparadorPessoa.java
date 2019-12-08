package collections;

import java.util.Comparator;

import model.Pessoa;

public class ComparadorPessoa implements Comparator<Pessoa> {

	@Override public int compare(Pessoa o1, Pessoa o2) {
		int retorno = 0;
		if(Integer.getInteger(o1.getCpf()) > Integer.getInteger(o2.getCpf())) {
			retorno = 1;
		}
		else if(Integer.getInteger(o1.getCpf()) < Integer.getInteger(o2.getCpf()) ) {
			retorno = -1;
		}
		return retorno;
	}

}
