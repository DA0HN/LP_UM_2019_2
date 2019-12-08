package pais;

public class Pais {
	private String iso;
	private String nomeDoPais;
	private double populacao;
	private double dimensao;
	private Fronteira fronteira = new Fronteira();
	//private ArrayList<Pais> fronteira1 = new ArrayList<Pais>(40);
	
	Pais(){}

	public Pais(String iso, String nomeDoPais, double populacao, double dimensao, Fronteira fronteira) {
		this.iso = iso;
		this.nomeDoPais = nomeDoPais;
		this.populacao = populacao;
		this.dimensao = dimensao;
		this.fronteira = fronteira;
	}
	public Pais(String iso, String nomeDoPais, double populacao, double dimensao) {
		this.iso = iso;
		this.nomeDoPais = nomeDoPais;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}
	public void setFronteira(Pais[] fronteira) {
		this.fronteira.setLista(fronteira);
	}

	public Fronteira getFronteira() {
		return this.fronteira;
	}
	
	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getNomeDoPais() {
		return nomeDoPais;
	}

	public void setNomeDoPais(String nomeDoPais) {
		this.nomeDoPais = nomeDoPais;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	
	public double getDensidadePopulacional() {
		return ( this.populacao/ this.dimensao);
	}
	
	public boolean equals(Pais pais) {
		return this.iso.equals(pais.iso);
	}
	
	
	
	@Override public String toString() {
		return 
				"[ Nome:" +this.nomeDoPais +
				", ISO:"+ this.iso +
				", População: " + this.populacao +
				", Dimensão: " + 
				this.dimensao + " ]";
	}
	public String toString(boolean b) {
		if( b ) {
			return 
					"[ Nome:" +this.nomeDoPais +
					", ISO:"+ this.iso +
					", População: " + this.populacao +
					", Dimensão: " + this.dimensao + " ]";
		}
		return 
				"[ Nome:" +this.nomeDoPais +
				", ISO:"+ this.iso +
				", População: " + this.populacao +
				", Dimensão: " + this.dimensao + " ]" +
				fronteira.toString();
		
	}
	
	
	
}
