package pais;

public class PaisBackup {
	private String iso;
	private String nomeDoPais;
	private double populacao;
	private double dimensao;
	private PaisBackup[] fronteira = new PaisBackup[40];
	//private ArrayList<Pais2> fronteira1 = new ArrayList<Pais2>(40);
	
	
	PaisBackup(){}

	public PaisBackup(String iso, String nomeDoPais, double populacao, double dimensao, PaisBackup[] fronteira) {
		this.iso = iso;
		this.nomeDoPais = nomeDoPais;
		this.populacao = populacao;
		this.dimensao = dimensao;
		this.fronteira = fronteira;
	}
	public PaisBackup(String iso, String nomeDoPais, double populacao, double dimensao) {
		this.iso = iso;
		this.nomeDoPais = nomeDoPais;
		this.populacao = populacao;
		this.dimensao = dimensao;
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

	public PaisBackup[] getFronteira() {
		return fronteira;
	}

	public void setFronteira(PaisBackup[] fronteira) {
		this.fronteira = fronteira;
	}

	public double densidadePopulacional() {
		return (this.dimensao / this.populacao );
	}
	
	public boolean equals(PaisBackup pais) {
		return this.iso.equals(pais.iso);
	}
	
	public PaisBackup[] vizinhosEmComum(PaisBackup paisEstrangeiro) {
		if( paisEstrangeiro == null ) {
			System.out.println("Erro: País nulo");
			return null;
		}
		PaisBackup[] listaDaFronteiraNacional = this.getFronteira();
		PaisBackup[] listaDaFronteiraEstrangeira = paisEstrangeiro.getFronteira();
		PaisBackup[] listaDeVizinhos = new PaisBackup[40];
		
		for(int i=0; i < listaDaFronteiraEstrangeira.length; i++) {
			if( listaDaFronteiraEstrangeira[i] != null && !listaDaFronteiraEstrangeira[i].equals( this )) {
				for(int j=0; j < listaDaFronteiraNacional.length; j++ ) {
					if( listaDaFronteiraNacional[j] != null && listaDaFronteiraNacional[j].equals(listaDaFronteiraEstrangeira[i]) ) {
						if( listaDeVizinhos[j] == null ) {
							inserePaisLimitrofe(listaDaFronteiraNacional[j], listaDeVizinhos);
						}
					}
				}
			}
		}
		
		return listaDeVizinhos;
	}
	
	private boolean jaInseridoNaListaDeFronteira(PaisBackup pais, PaisBackup[] lista) {
		for(int i=0; i < lista.length; i++ ) {
			if( lista[i] != null && lista[i].equals(pais) ) {
				return true;
			}
		}
		return false;
	}
	
	private void inserePaisLimitrofe(PaisBackup pais, PaisBackup[] lista) {
		
		if( !jaInseridoNaListaDeFronteira(pais, lista) ) {
			for(int i=0; i < lista.length; i++ ) {
				if( lista[i] == null) {
					lista[i] = pais;
					//System.out.println("Pais " + pais.getNomeDoPais() +" inserido na lista de fronteiras com sucesso.");
					return;
				}
			}
			System.out.println("Não foi possivel inserir pais"+ pais.getNomeDoPais() +"na lista de fronteiras.");
			return;
		}
		else {
			System.out.println("Esse paiss ja foi inserido!");
		}
	}
	
	public String listaDeFronteira() {
		StringBuilder str = new StringBuilder();
		PaisBackup[] lista= this.getFronteira();
		str.append("\n---------Lista de Paises Limitrofes---------\n");
		for(int i=0; i < lista.length; i++) {
			if( lista[i] != null ) {
				str.append("\t\t-->"+ lista[i].toString(true) +"\n");
			}
		}
		return str.toString();
	}
	
	@Override public String toString() {
		return 
				"[ Nome:" +this.nomeDoPais +
				", ISO:"+ this.iso +
				", População: " + this.populacao +
				", Dimensão: " + this.dimensao + " ]" +
				listaDeFronteira();
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
				listaDeFronteira();
		
	}
	
	
	
}
