package br.com.edu.ifmt.cba.interfaces.model.entities;

import br.com.edu.ifmt.cba.interfaces.model.interfaces.Impressora;
import br.com.edu.ifmt.cba.interfaces.model.interfaces.Telefone;

public class Multifuncional implements Impressora, Telefone {

	@Override public void chamar() {
		System.out.println("Multifuncional está chamando...");
	}

	@Override public void imprimir() {
		System.out.println("Multifuncional está imprimindo...");
	}
	
}
