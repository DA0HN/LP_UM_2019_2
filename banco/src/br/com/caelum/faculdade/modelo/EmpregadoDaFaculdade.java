package br.com.caelum.faculdade.modelo;

public class EmpregadoDaFaculdade {
	
	private String nome;
	private Double salario;
	
	public Double getGastos() {
		return this.salario;
	}
	
	public String getInfo() {
		return "Nome: " + this.nome + " com salário " + this.salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
}
