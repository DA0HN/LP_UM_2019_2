package pessoa;

public class Pessoa {
	
	private String name;
	private Pessoa mom;
	private Pessoa dad;
	
	public Pessoa() {}
	public Pessoa(String name) {
		this(name, null, null);
	}
	
	public Pessoa(String name, Pessoa mom, Pessoa dad) {
		this.mom = mom;
		this.dad = dad;
		this.name = name;
	}
	
	public boolean equals(Pessoa pessoa) {
		return this.name.equals(pessoa.getName());
	}
	
	public boolean isIrmao(Pessoa pessoa) {
		return pessoa.getDad().equals(this.getDad()) && pessoa.getMom().equals(this.getMom());
	}
	
	public boolean isAscendente(Pessoa pessoa) {
		if( this.getDad().getDad().equals(pessoa) || this.getMom().getMom().equals(pessoa) ) {
			return true;
		}
		if( pessoa.getDad().equals(this.getDad().getDad()) || pessoa.getMom().equals(this.getMom().getMom()) ) {
			return true;
		}
		return false;
	}
	
	public Pessoa getMom() {
		return mom;
	}
	
	public void setMom(Pessoa mom) {
		this.mom = mom;
	}
	
	public Pessoa getDad() {
		return dad;
	}
	
	public void setDad(Pessoa dad) {
		this.dad = dad;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", mom=" + mom + ", dad=" + dad + "]";
	}
	
	
	
}
