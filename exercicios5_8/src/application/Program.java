package application;

import entities.Cliente;
import entities.Conta;
//import entities.Data;

public class Program {

	public static void main(String[] args) {
		Cliente c = new Cliente("Gabrielly", "Ferreira");
		Cliente c2 = new Cliente("Amanda", "Carvalho");
		Cliente c3 = new Cliente("João", "Vitor");
		
		Conta minhaContaUm = new Conta();
		Conta minhaContaDois = new Conta(c);
		Conta minhaContaTres = new Conta(c2);
		Conta minhaContaQuatro = new Conta(c3);
		
		minhaContaUm.saca(300);
		minhaContaUm.deposita(500);
		
		System.out.printf("Alterando cpf de %s %s%n", minhaContaQuatro.getTitular().getNome(), minhaContaQuatro.getTitular().getSobrenome());
		minhaContaUm.getTitular().setCpf("001.012.a02");
		System.out.println("---------------------------------------");
		
		minhaContaTres.transfere(minhaContaDois, 500);
		minhaContaDois.transfere(minhaContaUm, 1500);
		minhaContaQuatro.transfere(minhaContaDois, 999);
			
		System.out.println("---------------------------------------");
		System.out.printf("Total de contas abertas: %s%n", Conta.getTotalDeContas());
		System.out.println("---------------------------------------");
		
		System.out.println(minhaContaUm.recuperaDadosParaImpressao());
		System.out.println("---------------------------------------");
		System.out.println(minhaContaDois.recuperaDadosParaImpressao());
		System.out.println("---------------------------------------");
		System.out.println(minhaContaTres.recuperaDadosParaImpressao());
		System.out.println("---------------------------------------");
		System.out.println(minhaContaQuatro.recuperaDadosParaImpressao());		
		System.out.println("---------------------------------------");
	}	
}
