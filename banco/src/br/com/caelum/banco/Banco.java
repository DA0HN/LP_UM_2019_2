package br.com.caelum.banco;

import br.com.caelum.contas.modelo.Conta;

// exercicio opcional do capitulo 14

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[20];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	public void adiciona(Conta c) {
		for(int i=0; i < this.contas.length; i++) {
			if( this.contas[i] == null) {
				this.contas[i] = c;
				return;
			}
		}
	}
	public void mostraContas() {
		System.out.println("Banco " + this.nome + ": ");
		for (int i = 0; i < this.contas.length; i++) {
			if(this.contas[i] != null ) {
				System.out.println("Conta na posição " + i 
						+ " "
						+ this.contas[i].mostrarDados());
			}
		}
	}
}
