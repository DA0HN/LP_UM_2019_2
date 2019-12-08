package programa_1;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public void fazAniversario() {
		System.out.printf("%s fez aniversário!%n", this.nome);
		this.setIdade(this.getIdade() + 1);
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void estadoAtual() {
		System.out.printf("%s possui %d anos%n", this.nome, this.idade);
	}
}
