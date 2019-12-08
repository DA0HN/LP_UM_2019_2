package provaDois.agendaDeContatos.model.entities;

public class ContatoPessoal extends Contato {
	
	protected String dataDeAniversario;
	
	public ContatoPessoal(String nome, String email, String telefone, String dataDeAniversario) {
		super(nome, email, telefone);
		this.dataDeAniversario = dataDeAniversario;
	}

	@Override public Contato clonar() {
		Contato contato = new ContatoPessoal(this.nome, this.email, this.telefone, this.dataDeAniversario);
		return contato;
	}

	@Override public String verInformacoes() {
		

		return super.verInformacoes() + 
				"Data de anivesario: " + this.dataDeAniversario;
	}

	public String getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(String dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}
	
}
