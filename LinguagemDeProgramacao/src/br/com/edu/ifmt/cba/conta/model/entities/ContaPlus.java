package br.com.edu.ifmt.cba.conta.model.entities;

public class ContaPlus extends Conta{
	
	public ContaPlus(String nome) {
		super(nome);
	}

	@Override public Double sacar(Double value) {
		if( saldo - value <= -2000 ) {
			System.out.println("Não foi possivel realizar o saque, você ultrapassou o limite.");
			return 0.0;
		}
		this.saldo -= value;
		log("Ocorreu um saque de: " + value);
		return this.saldo;
	}
}
