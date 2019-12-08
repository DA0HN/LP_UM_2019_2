package application;

import entities.Cadastro;
import util.Teclado;

public class Program {
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		boolean flag = false;
		while( flag != true) {
			tabelaDeOpcoes();
			int resp = Teclado.leInt("");
			switch( resp ) {
			case 1:
				cadastro.cadastrarPessoa();
				break;
			case 2:
				cadastro.alterar();
				break;
			case 3:
				cadastro.excluir();
				break;
			case 4:
				cadastro.consulta();
				break;
			case 5:
				flag = true;
				break;
			default:
				System.out.println("ERRO: algo inesperado ocorreu!");
			}
		}
	}
	public static void tabelaDeOpcoes() {
		System.out.println("1 - cadastrar");
		System.out.println("2 - alterar");
		System.out.println("3 - excluir");
		System.out.println("4 - consulta");
		System.out.println("5 - sair");
		System.out.print("Opcao: ");
	}
}