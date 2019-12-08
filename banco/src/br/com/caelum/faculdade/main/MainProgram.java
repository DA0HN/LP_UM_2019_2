package br.com.caelum.faculdade.main;

import br.com.caelum.faculdade.modelo.EmpregadoDaFaculdade;

public class MainProgram {

	public static void main(String[] args) {
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
	
		empregado.setNome("Marcos");
		empregado.setSalario(1500d);
		
		System.out.println(empregado.getInfo());
		System.out.println(empregado.getGastos());
		
		
	}

}
