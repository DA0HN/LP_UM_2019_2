package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public abstract class Conta {
	
	protected int numeroDaConta;
	protected double limite;
	protected double saldo;
	protected String titular;
	protected String agencia;
	protected static int totalDeContas;	// variavel compartilhada por todos os objetos dessa classe
	
	public Conta(String titular) {
		this();
	}
	
	public Conta(int numeroDaConta, double limite,double saldo, String titular, String agencia){
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
		this.agencia = agencia;
		Conta.totalDeContas++;
	}
	public Conta(){}
	
	public String getTipo() {
		return "Conta";
	}
	
	public static int getTotalDeContas() {
		return( Conta.totalDeContas );
	}
	
	public void saca(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if(this.saldo < valor && this.saldo <= this.limite) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= valor;
	}
	
	double calculaRendimento() {
		return this.saldo*0.1;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		try {
			this.saca(valor);
			//System.out.printf("Transferencia de %.2f feita com sucesso de %s para %s%n", valor ,this.titular, destino.getTitular());
			destino.deposita(valor);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
	}
	
	
	
	@Override public String toString() {
		return "Conta [titular=" + titular + "]".toUpperCase();
	}

	public String mostrarDados() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", limite=" + limite + ", saldo=" + String.format("%.2f", this.saldo) + ", titular="
				+ titular + ", agencia=" + agencia + "]";
	}

	public void setLimite(double limite) { this.limite = limite; }
	public void setNumero(int numero) {	this.numeroDaConta = numero;}
	public void setTitular(String titular) { this.titular = titular; }
	public void setAgencia(String agencia) { this.agencia = agencia; }
	public double getLimite() { return limite; }
	public int getNumero() { return numeroDaConta; }
	public String getTitular() { return this.titular; }
	public String getAgencia() { return this.agencia; }
	public double getSaldo() { return saldo; }
	
}
