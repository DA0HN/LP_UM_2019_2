package br.com.edu.ifmt.cba.interfaces.main;

import br.com.edu.ifmt.cba.interfaces.model.entities.Matricial;
import br.com.edu.ifmt.cba.interfaces.model.entities.Motorola;
import br.com.edu.ifmt.cba.interfaces.model.entities.Multifuncional;
import br.com.edu.ifmt.cba.interfaces.model.entities.Nokia;
import br.com.edu.ifmt.cba.interfaces.model.interfaces.Impressora;
import br.com.edu.ifmt.cba.interfaces.model.interfaces.Telefone;

public class Main {
	public static void main(String[] args) {
		
		Main m = new Main();
		
		Nokia nokia = new Nokia();
		Matricial matricial = new Matricial();
		Motorola moto = new Motorola();
		Multifuncional multi = new Multifuncional();
		
		m.realizarImpressao(multi);
		m.realizarLigacao(multi);
	}
	
	public void realizarLigacao(Telefone telefone) {
		telefone.chamar();
	}
	
	public void realizarImpressao(Impressora impressora) {
		impressora.imprimir();
	}
	
}
