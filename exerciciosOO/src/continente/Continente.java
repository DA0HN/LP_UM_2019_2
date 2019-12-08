package continente;

import pais.Pais;

public class Continente {
	String nomeDoContinente;
	Pais[] paisesContinentais = new Pais[30];
	
	public Continente() {}
	
	public Continente(String nomeDoContinente) {
		super();
		this.nomeDoContinente = nomeDoContinente;
	}

	public Continente(String nomeDoContinente, Pais[] paises) {
		this.nomeDoContinente = nomeDoContinente;
		this.setPaises(paises);
	}
	
	public String getNomeDoContinente() {
		return nomeDoContinente;
	}
	
	public void setNomeDoContinente(String nomeDoContinente) {
		this.nomeDoContinente = nomeDoContinente;
	}
	
	public Pais[] getPaises() {
		return paisesContinentais;
	}
	
	public void setPaises(Pais[] paises) {
		for(int i=0; i < paises.length; i++ ) {
			if( paisesContinentais[i] == null ) {
				paisesContinentais[i] = paises[i];
			}
			else {
				paisesContinentais[i] = null;
			}
		}
	}
	
	public void print() {
		for( int i=0; i < paisesContinentais.length; i++) {
			if( paisesContinentais[i] != null ) {
				System.out.println(paisesContinentais[i].toString());
			}
		}
	}
	
	public boolean isPaisNoContinente(Pais pais) {
		for( int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null && pais != null && pais.equals(paisesContinentais[i]) ) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Pais novoPais) {
		if( novoPais == null ) return;
		if( !isPaisNoContinente(novoPais) ) {
			for( int i=0; i < paisesContinentais.length; i++ ) {
				if( paisesContinentais[i] == null ) {
					paisesContinentais[i] = novoPais;
					return;
				}
			}
		}
	}
	
	public double dimensaoTotal() {
		double dimensao = 0;
		
		for( int i=0; i < paisesContinentais.length; i++ ) {
			dimensao += paisesContinentais[i].getDimensao();
		}
		return dimensao;
	}
	
	public double populacaoTotal() {
		double populacao = 0;
		for( int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null ) {
				populacao += paisesContinentais[i].getPopulacao();				
			}
		}
		return populacao;
	}
	
	public double densidadePopulacionalTotal() {
		double densidade = 0;
		for( int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null ) {
				densidade += paisesContinentais[i].getDensidadePopulacional();
			}
		}
		return densidade;
	}
	
	public Pais paisComMaiorPopulacao() {
		double maior = 0;
		Pais pais = null;
		for(int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null ) {
				if( i == 0) {
					maior = paisesContinentais[i].getPopulacao();
				}
				if( maior < paisesContinentais[i].getPopulacao() ) {
					pais = paisesContinentais[i];
					maior = paisesContinentais[i].getPopulacao();
				}				
			}
		}
		return pais;
	}
	
	public Pais paisComMenorPopulacao() {
		double menor = 0;
		Pais pais = null;
		for( int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null ) {
				if( i == 0) {
					menor = paisesContinentais[i].getPopulacao();
				}
				if( menor > paisesContinentais[i].getPopulacao() ) {
					pais = paisesContinentais[i];
					menor = paisesContinentais[i].getPopulacao();
				}
				
			}
		}
		return pais;
	}
	
	public Pais paisComMaiorDimensao() {
		double maior = 0;
		Pais pais = null;
		for( int i=0; i < paisesContinentais.length; i++) {
			if( paisesContinentais[i] != null ) {
				if( i == 0 ) {
					maior = paisesContinentais[i].getDimensao();
				}
				if( maior < paisesContinentais[i].getDimensao() ) {
					pais = paisesContinentais[i];
					maior = paisesContinentais[i].getDimensao();
				}				
			}
		}
		return pais;
	}
	
	public Pais paisComMenorDimensao() {
		double menor = 0;
		Pais pais = null;
		for( int i=0; i < paisesContinentais.length; i++ ) {
			if( paisesContinentais[i] != null ) {
				if( i == 0 ) {
					pais = paisesContinentais[i];
				}
				if( menor > paisesContinentais[i].getDimensao() ) {
					pais = paisesContinentais[i];
					menor = paisesContinentais[i].getDimensao();
				}
			}
		}
		return pais;
	}
	
	public double razaoTerritorial() {
		return paisComMaiorDimensao().getDimensao() / paisComMenorDimensao().getDimensao();
	}
	
}
