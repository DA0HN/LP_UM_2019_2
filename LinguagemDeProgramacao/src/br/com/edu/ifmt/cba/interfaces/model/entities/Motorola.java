package br.com.edu.ifmt.cba.interfaces.model.entities;

import br.com.edu.ifmt.cba.interfaces.model.interfaces.Telefone;

public class Motorola implements Telefone {

	@Override public void chamar() {
		System.out.println("Motorola está te ligando...");
	}

}
