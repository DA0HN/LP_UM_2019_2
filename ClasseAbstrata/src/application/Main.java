package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Conta;
import model.entities.ContaPeba;
import model.entities.ContaPlus;
import teclado.Teclado;

public class Main {

	private static List<Conta> contas = new ArrayList<Conta>();
	
	public static void main(String[] args) {
		menuDeContas();
	}

	private static void menuDeContas() {
		
		System.out.println("***Sistema Bancário***");
		
		System.out.println("1 - criar nova conta\n"
				+ "2 - consultar conta\n"
				+ "3 - Apresentar todas as contas\n"
				+ "4 - sair");
		
		switch( Teclado.leInt("O que deseja fazer?") ) {
			case 1:
				criarConta();
				menuDeContas();
			case 2:
				procurarContas();
				menuDeContas();
			case 3:
				apresentarContas();
				menuDeContas();
			case 4:
				return;
			default:
				System.out.println("Opção inválida.");
		}
		
	}

	private static void apresentarContas() {
		contas.forEach(System.out::println);
	}

	private static void procurarContas() {
		String nome = Teclado.leString("Insira o o seu nome: ");
		
		contas.forEach( c -> {
			if( c.getNome().equals(nome) ) {
				menuDoUsuario(c);
				return;
			}
		});
	}

	private static void menuDoUsuario(Conta c) {
		
		System.out.println("1 - Sacar\n"
				+ "2 - Depositar\n"
				+ "3 - Ver saldo\n"
				+ "4 - Sair");
		
		var op = Teclado.leInt("O que deseja fazer?");
		
		switch( op ) {
		case 1:
			sacar(c);					
			menuDoUsuario(c);
		case 2:				
			depositar(c);
			menuDoUsuario(c);
		case 3:
			consulta(c);
			menuDoUsuario(c);
		case 4:
			return;
		default:
			System.out.println("Opção inválida.");
			menuDoUsuario(c);	
		}
	}

	private static void consulta(Conta c) {
		System.out.println( c.getNome() + " seu saldo é: " + c.verSaldo() );
	}

	private static void depositar(Conta c) {
		c.depositar(Teclado.leDouble("Qual o valor que deseja depositar?"));
	}

	private static void sacar(Conta c) {
		c.sacar(Teclado.leDouble("Qual o valor que deseja sacar?"));
	}

	private static Conta criarConta() {
		System.out.println("1 - Peba\n2 - Plus");
		var op = Teclado.leInt("Qual conta deseja criar?");
		Conta c;
		if( op == 1 ) {
			c = new ContaPeba(Teclado.leString("Insira seu nome: "));
			contas.add(c);
			return c;
		}
		else if( op == 2){
			c = new ContaPlus(Teclado.leString("Insira seu nome: "));
			contas.add(c);
			return c;
		}
		else {
			System.out.println("Opção inválida.");
			return criarConta();
		}
	}
}
