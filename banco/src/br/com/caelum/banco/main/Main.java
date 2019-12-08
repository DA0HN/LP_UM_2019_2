package br.com.caelum.banco.main;

import br.com.caelum.banco.modelo.ControleDeBonificacoes;
import br.com.caelum.banco.modelo.Funcionario;
import br.com.caelum.banco.modelo.Gerente;

public class Main {

	public static void main(String[] args) {
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Funcionario gerente = new Gerente();
		
		gerente.setSalario(1000d);
		
		controle.registra(gerente);
		
		
	}

}
