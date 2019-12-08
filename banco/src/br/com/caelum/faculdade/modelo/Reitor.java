package br.com.caelum.faculdade.modelo;

public class Reitor extends EmpregadoDaFaculdade {
	
	
	@Override public String getInfo() {
		return super.getInfo() + " e ele é o reitor";
	}
}
