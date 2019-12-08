package br.com.edu.ifmt.cba.prova.entidade;

public class ContaGoldPlus extends ContaGold{
	
	public ContaGoldPlus(String nome, int cpf) {
		super(nome, cpf);
	}

	@Override
	public double sacar(double valor) {
		if(valor <= getSaldo()) {
			if(valor >= 500) {
				setSaldo(getSaldo()- valor);
				return valor + valor*0.25;
			}else {
				setSaldo(getSaldo()- valor);
				return valor;
			}
		}else {
			return 0;	
		}
	}
}
