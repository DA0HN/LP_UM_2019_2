package provaTres.model.entities;

public class PessoaFisica extends Pessoa{

	private String cpf;
	private String nome;
			
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String endereco, String cpf, String nome) {
		super(endereco);
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String print() {
		return getEndereco() + ","
				+ getNome() + ","
				+ getCpf() + ","
				+ getTipo();
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", getTipo()=" + getTipo() + ", getEndereco()="
				+ getEndereco() + "]";
	}
	@Override
	public Integer getTipo() {
		return 1;
	}

}
