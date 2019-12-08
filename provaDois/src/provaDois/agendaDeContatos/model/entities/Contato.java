package provaDois.agendaDeContatos.model.entities;

import provaDois.agendaDeContatos.model.interfaces.Duplicata;

public abstract class Contato implements Duplicata {
	
	private static Integer contador = 0;
	protected Integer codigo;
	protected String nome;
	protected String email;
	protected String telefone;
	
	public Contato(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		
		Contato.contador++;
		this.codigo = contador;
	}
	
	public Contato(Integer codigo, String nome, String email, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	protected void incrementar() {
		contador++;
		this.codigo = contador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String verInformacoes() {
		return "Codigo: " + this.codigo + "\n"
				+ "Nome: " + this.nome + "\n"
				+ "Email: " + this.email + "\n"
				+ "Telefone: " + this.telefone + "\n";
	}
	
}
