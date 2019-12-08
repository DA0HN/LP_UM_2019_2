package aula177.model;

public class Carro {

	private String nome = "Gol";
	private String cor;
	private Integer ano;
	
	public Carro(String cor, Integer ano) {
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	@Override public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + ", ano=" + ano + "]";
	}
}
