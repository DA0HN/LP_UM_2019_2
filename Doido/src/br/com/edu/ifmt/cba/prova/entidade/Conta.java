package br.com.edu.ifmt.cba.prova.entidade;

public abstract class Conta {
	private String nome;
	private int cpf;
	private double saldo;
	
	
	public Conta(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(double valor) {
		if(valor <= getSaldo()) {
			setSaldo(getSaldo()- valor);
			return valor;
		}else {
			return 0;	
		}
	}
	
	public double deposito(double valor) {
		if(valor > 0){
			setSaldo(getSaldo()+valor);
			return valor;
		}else {
			return 0;
		}
		
	}
	
	
}
