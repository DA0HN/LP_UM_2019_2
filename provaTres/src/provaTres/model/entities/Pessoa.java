package provaTres.model.entities;

public abstract class Pessoa {

	private String endereco;
	
	public Pessoa() {}
	
	public Pessoa(String endereco) {
		this.endereco = endereco;
	}
	
	public abstract String getNome();
	public abstract String print();
	public abstract Integer getTipo();
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [endereco=" + endereco + "]";
	}
}
