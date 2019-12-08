package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pilha {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		String nome1 = "gabriel";
		String nome3 = "gabrielly";
		String nome2 = "laura";
		String nome5 = "carlos";
		String nome4 = "thiago";
		String nome6 = "kiko";
		
		lista.add(nome1);
		lista.add(nome2);
		lista.add(nome3);
		lista.add(nome4);
		lista.add(nome5);
		lista.add(nome6);
		
		Iterator it = lista.iterator();
		
		System.out.println("sdag");
		
//		while( it.hasNext() ) {
//			System.out.println(it.next());
//		}
		
		while( it.hasNext() ) {
			String nome = (String)it.next();
		
			if( nome.equals("kiko")) {
				it.remove();
			}
		}
		
		it = lista.iterator();
		
		while( it.hasNext() ) {
			System.out.println(it.next());
		}
	}
}
