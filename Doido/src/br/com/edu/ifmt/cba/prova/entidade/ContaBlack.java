package br.com.edu.ifmt.cba.prova.entidade;

public class ContaBlack extends Conta{

	public ContaBlack(String nome, int cpf) {
		super(nome, cpf);
	}
	
	@Override
	public double sacar(double valor) {
		if(valor <= getSaldo() && valor > 0) {
				setSaldo(getSaldo()- valor);
				return valor + valor*0.10;
		}else {
			return 0;
		}
		
	}

	@Override
	public double deposito(double valor) {
		if(valor > 0){
			setSaldo(getSaldo()+valor + valor*0.10);
			return valor + valor*0.10;
		}else {
			return valor;
		}
	}
	
	
}
