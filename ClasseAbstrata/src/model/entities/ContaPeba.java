package model.entities;

public class ContaPeba extends Conta {
	
	private int counter;
	
	public ContaPeba(String nome) {
		super(nome);
	}
	
	@Override public Double verSaldo() {
		if( counter >= 3 ) {
			counter++;
			return this.saldo -= 0.5;
		}
		else {
			return this.saldo;
		}
	}
	
}
