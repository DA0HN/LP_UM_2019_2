package br.com.edu.ifmt.cba.prova.entidade;

public class ContaGold extends Conta{
	public ContaGold(String nome, int cpf) {
		super(nome, cpf);
	}

	static int cont =0;
	static int acomular =0;
	
	@Override
	public double deposito(double valor) {
		if(valor > 0){
			setSaldo(getSaldo()+valor);
			cont++;
			acomular += valor;
		}
		if(cont ==5) {
			setSaldo(acomular*0.10);
			cont = 0;
			acomular = 0;
			return valor + acomular*0.10;
		}else {
			return valor;
		}
	}
}
