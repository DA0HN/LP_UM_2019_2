package model.entities;

public class ContaPlus extends Conta{
	
	public ContaPlus(String nome) {
		super(nome);
	}

	@Override public Double sacar(Double value) {
		if( saldo - value <= -2000 ) {
			System.out.println("N�o foi possivel realizar o saque, voc� ultrapassou o limite.");
			return 0.0;
		}
		return saldo -= value;
	}
	
}
