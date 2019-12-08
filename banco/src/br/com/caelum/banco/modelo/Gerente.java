package br.com.caelum.banco.modelo;

public class Gerente extends Funcionario {
	
	private Integer senha;
	private Integer numeroDeFuncionariosGerenciados;
	
	public Boolean autentica(int senha) {
		if( this.senha == senha ) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	
	public Integer getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public Integer getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
	
	public void setNumeroDeFuncionariosGerenciados(Integer numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	@Override public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
	
}
