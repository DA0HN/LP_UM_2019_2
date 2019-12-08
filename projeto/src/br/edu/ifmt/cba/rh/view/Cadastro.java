package br.edu.ifmt.cba.rh.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifmt.cba.rh.entities.Pessoa;
import br.edu.ifmt.cba.rh.util.Teclado;

public class Cadastro {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public Cadastro(){
		System.out.println("Bem vindo ao sistema de cadastro");
	}

	public static void tabelaDeOpcoes() {
		System.out.println("1 - cadastrar");
		System.out.println("2 - alterar");
		System.out.println("3 - excluir");
		System.out.println("4 - consultar");
		System.out.println("5 - sair");
		System.out.print("Opcao: ");
	}
	
	public static void menu() {
		tabelaDeOpcoes();
		switch( Teclado.leInt("") ) {
		case 1:
			cadastrar();
			menu();
			break;
		case 2:
			alterar();
			menu();
			break;
		case 3:
			excluir();
			menu();
			break;
		case 4:
			consultar();
			menu();
			break;
		case 5:
			break;
		default:
			System.out.println("ERRO: algo inesperado ocorreu!");
			menu();
		}
	}
	
	public static void cadastrar() {
		System.out.println("----------------------------");
		System.out.println("Cadastrar");
		String nome = Teclado.leString("Insira o nome: ");
		String cpf = Teclado.leString("Insira o cpf: ");
		pessoas.add(new Pessoa(
				nome,
				cpf));
	}
	
	public static void alterar() {
		System.out.println("----------------------------");
		System.out.println("Alterar");
		String alterar = Teclado.leString("Insira o nome da pessoa que deseja alterar");

		for(Pessoa p : pessoas) {
			if(alterar.equals(p.getNome())) {
				p.setNome(Teclado.leString("Insira o novo nome: "));
				p.setCpf(Teclado.leString("Insira o novo cpf: "));
				System.out.println("Dados alterados");
			}
		}
	}
	
	public static void consultar() {
		System.out.println("----------------------------");
		System.out.println("Consultar");
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
	}
	public static void excluir() {
		System.out.println("----------------------------");
		System.out.println("Excluir");
		String alterar = Teclado.leString("Insira o nome da pessoa que deseja remover: ");
		for(Pessoa p : pessoas) {
			if(alterar.equals(p.getNome())) {
				System.out.println("removido: \n"+ p);
				pessoas.remove(p);
				return;
			}
			else {
				continue;
			}
		}
		
	}
}
