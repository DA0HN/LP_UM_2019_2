package programa_1;

import java.util.Scanner;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		System.out.println("Insira o nome: ");
		p.setNome(in.nextLine()); 
		
		System.out.println("Insira a idade: ");
		p.setIdade(in.nextInt());
		
		p.estadoAtual();
		p.fazAniversario();
		p.fazAniversario();
		p.estadoAtual();
		in.close();
	}

}
