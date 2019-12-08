package br.com.caelum.banco.main;

import br.com.caelum.banco.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

// exercicios do capitulo 14

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Batman");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(100000);
		banco.adiciona(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular("Coringa");
		c2.setNumero(2);
		c2.setAgencia("1000");
		c2.deposita(890000);
		banco.adiciona(c2);
		
		for (int i = 0; i < 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setNumero(i);
			conta.setAgencia("1000");
			conta.deposita(Math.random() * (100 - i) + 1.0);
			banco.adiciona(conta);
		}
		
		banco.mostraContas();
		
	}
	
}
