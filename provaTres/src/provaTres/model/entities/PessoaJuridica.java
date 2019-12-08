package provaTres.model.entities;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String endereco, String cnpj, String razaoSocial) {
		super(endereco);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNome() {
		return razaoSocial;
	}
	
	@Override
	public String print() {
		return getEndereco() + ","
				+ getNome() + ","
				+ getCnpj() + ","
				+ getTipo();
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", getTipo()=" + getTipo()
				+ ", getEndereco()=" + getEndereco() + "]";
	}

	@Override
	public Integer getTipo() {
		return 0;
	}

	
	
}
