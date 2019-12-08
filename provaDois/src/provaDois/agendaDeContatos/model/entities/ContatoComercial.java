package provaDois.agendaDeContatos.model.entities;

public class ContatoComercial extends Contato {

	protected String nomeDaEmpresa;
	protected String telefoneComercial;
	
	public ContatoComercial(String nome, String email, String telefone, String nomeDaEmpresa, String telefoneComercial) {
		super(nome, email, telefone);
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.telefoneComercial = telefoneComercial;
	}

	@Override public Contato clonar() {
		Contato contato = new ContatoComercial(this.nome, this.email, this.telefone, this.nomeDaEmpresa, this.telefoneComercial);
		return contato;
	}

	@Override public String verInformacoes() {
		return super.verInformacoes()
				+ "Nome da empresa: " + this.nomeDaEmpresa + "\n"
				+ "Telefone Comercial: " + this.telefoneComercial;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	
}
