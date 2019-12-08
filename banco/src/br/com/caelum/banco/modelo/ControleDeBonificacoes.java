package br.com.caelum.banco.modelo;

public class ControleDeBonificacoes {
	
	private Double totalDeBonificacoes = 0.0;
	
	public void registra(Funcionario funcionario ) {
		System.out.println("Adicionando bonificação do funcionario: " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public Double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
