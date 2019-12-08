package br.com.edu.ifmt.cba.interfaces.model.entities;

import br.com.edu.ifmt.cba.interfaces.model.interfaces.Impressora;

public class Matricial implements Impressora {

	@Override public void imprimir() {
		System.out.println("Imprimindo............");
	}

}
