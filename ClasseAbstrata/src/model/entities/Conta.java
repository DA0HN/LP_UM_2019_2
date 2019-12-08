package model.entities;

public abstract class Conta {
	
	protected Double saldo;
	protected String nome;
	
	public Conta(String nome) {
		this.nome = nome;
		this.saldo = 0.0;
	}
	
	public Double sacar(Double value) {
		return this.saldo -= value;
	}
	
	public void depositar(Double value) {
		this.saldo += value;
	}
	
	public Double verSaldo() {
		return this.saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override public String toString() {
		return "Conta [saldo=" + saldo + ", nome=" + nome + "]";
	}
}
