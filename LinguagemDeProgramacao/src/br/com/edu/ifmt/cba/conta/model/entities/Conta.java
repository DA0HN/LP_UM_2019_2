package br.com.edu.ifmt.cba.conta.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.edu.ifmt.cba.conta.model.interfaces.Audit;

public abstract class Conta implements Audit {
	
	protected Double saldo;
	protected String nome;
	protected StringBuilder mensagemLog;
	
	protected Conta(String nome) {
		this.nome = nome;
		this.saldo = 0.0;
		this.mensagemLog = new StringBuilder();
	}
	
	public Double sacar(Double value) {
		this.saldo -= value;
		log("Ocorreu um saque de: " + value);
		return this.saldo;
	}
	
	public void depositar(Double value) {
		this.saldo += value;
		log("Ocorreu um deposito de: " + value);
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

	public String getMensagemLog() {
		return this.mensagemLog.toString();
	}
	
	@Override public void log(String msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		mensagemLog.append("\n"+ sdf.format( new Date() ) + " "+ msg);
		mensagemLog.append("\nSaldo atual de: " + this.saldo);
	}
	
	@Override public String toString() {
		return "Conta [saldo=" + saldo + ", nome=" + nome + "]";
	}
}
