package br.com.edu.ifmt.cba.prova.entidade;

public abstract class Banco implements CaixaEletronico{
	private String nome;
	protected Conta contas[] = new Conta[10];
	
	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	
	
}
