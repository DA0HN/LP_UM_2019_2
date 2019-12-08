package pais;

public class Fronteira {
	Pais[] fronteira = new Pais[40];
	
	public Pais[] getLista() {
		return fronteira;
	}

	public void setLista(Pais[] fronteira) {
		this.fronteira = fronteira;
	}
	
	public boolean isLimitrofe(Pais pais) {
		Pais[] lista = this.getLista();
		for(int i=0; i < lista.length; i++ ) {
			if( lista[i] != null && lista[i].equals(pais) ) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override public String toString() {
		StringBuilder str = new StringBuilder();
		Pais[] lista= this.getLista();
		str.append("\n---------Lista de Paises Limitrofes---------\n");
		for(int i=0; i < lista.length; i++) {
			if( lista[i] != null ) {
				str.append("\t-->"+ lista[i].toString(true) +"\n");
			}
		}
		return str.toString();
	}
	
	
	public void atualizaFronteira(Pais pais) {
		for( int i=0; i < this.getLista().length; i++ ) {
			if( this.isLimitrofe(pais) && this.getLista()[i] != null ) {
				this.getLista()[i] = pais;
			}
		}
	}
	
	public Pais[] getVizinhos(Pais[] listaDaFronteiraEstrangeira) {
		if( listaDaFronteiraEstrangeira == null ) {
			System.out.println("Erro: País nulo");
			return null;
		}
		Pais[] listaDeVizinhos = new Pais[40];
		
		for(int i=0; i < listaDaFronteiraEstrangeira.length; i++) {
			if( listaDaFronteiraEstrangeira[i] != null && !listaDaFronteiraEstrangeira[i].equals( this )) {
				percorreListaDaFronteiraNacional(listaDaFronteiraEstrangeira[i], listaDeVizinhos);
			}
		}
		
		return listaDeVizinhos;
	}
	/*-----------------------------------------------------------*/
	/* Métodos auxiliares para o método vizinhosEmComum() */
	private void percorreListaDaFronteiraNacional(Pais paisEstrangeiro, Pais[] listaDeVizinhos) {
		Pais[] listaDaFronteiraNacional = this.getLista();
		for(int j=0; j < listaDaFronteiraNacional.length; j++ ) {
			if( listaDaFronteiraNacional[j] != null && listaDaFronteiraNacional[j].equals(paisEstrangeiro) ) {
				if( listaDeVizinhos[j] == null ) {
					inserePaisLimitrofe( this.getLista()[j], listaDeVizinhos);
					return;
				}
			}
		}
		return;
	}
	
	private boolean jaInseridoNaListaDeFronteira(Pais pais, Pais[] lista) {
		for(int i=0; i < lista.length; i++ ) {
			if( lista[i] != null && lista[i].equals(pais) ) {
				return true;
			}
		}
		return false;
	}
	
	private void inserePaisLimitrofe(Pais pais, Pais[] lista) {
		
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
			System.out.println("Esse país ja foi inserido!");
		}
	}
	/*-----------------------------------------------------------*/
	
	
	
}
