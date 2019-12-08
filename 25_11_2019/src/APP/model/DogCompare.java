package APP.model;

import java.util.Comparator;

public class DogCompare implements Comparator<Dog>{

	@Override public int compare(Dog o1, Dog o2) {
		int retorno = o1.getRaca().compareTo(o2.getRaca());
		if( retorno == 0 ) {
			retorno = o1.getNome().compareTo(o2.getNome());
		}
		return retorno;
	}

}
