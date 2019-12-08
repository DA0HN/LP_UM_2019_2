package crud.model;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private Integer idade;
	private String cpf;

	public Pessoa() {
	}

	public Pessoa(String nome, Integer idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return nome + ", "
				+ idade + ", "
				+ cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nCpf: " + cpf;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.getNome());
	}
}
