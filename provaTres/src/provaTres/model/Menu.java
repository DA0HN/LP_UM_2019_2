package provaTres.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import provaTres.model.database.Database;
import provaTres.model.entities.Pessoa;
import provaTres.model.entities.PessoaFisica;
import provaTres.model.entities.PessoaJuridica;
import util.Teclado;

public class Menu {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	private static Database database;
	
	public static void init() {
		try {
			database = new Database();
			updateList();
			mostrarMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void opcoesMenu() {
		
		System.out.println("------------------------");
		System.out.println("Opções: ");
		System.out.println("1 - Create");
		System.out.println("2 - Read");
		System.out.println("3 - Update");
		System.out.println("4 - Delete");
		System.out.println("5 - Sair");
		System.out.println("------------------------");
	}
	
	private static void mostrarMenu() throws IOException {
		
		opcoesMenu();
		
		switch( Teclado.leInt("Insira sua opção: ") ) {
		
		case 1:
			create();
			break;
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			System.out.println("Execução terminada.");
			return;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		updateList();
		mostrarMenu();
	}

	private static void create() {
		
		Pessoa p = null;
		
		System.out.println("0 - Pessoa juridica");
		System.out.println("1 - Pessoa Fisica");
		
		int tipo = Teclado.leInt("Insira o tipo de pessoa para cadastro: ");
		if( tipo == 0 ) {
			p = new PessoaJuridica(
				Teclado.leString("Insira o endereço: "),
				Teclado.leString("Insira o cnpj: "),
				Teclado.leString("Insira a razão social: ")
			);
		}
		else if ( tipo == 1){
			p = new PessoaFisica(
				Teclado.leString("Insira o endereço: "),
				Teclado.leString("Insira o cpf"),
				Teclado.leString("Insira o nome: ")
			);
		}
		else {
			System.out.println("Opção inválida");
			return;
		}
		pessoas.add(p);
		database.enviarDados(p, true);
	}

	private static void read() {
		updateList();
		Collections.sort(pessoas, new ComparadorDePessoa());
		System.out.println("------------------------");
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		System.out.println("------------------------");
	}
	
	private static void delete() throws IOException {
		int tipo = Teclado.leInt("Qual o tipo de pessoa que deseja excluir: ");
		String foo = tipo == 0 ? "cnpj" : "cpf";
		String nome = Teclado.leString("Insira o " + foo + " que deseja excluir: ");
		
		for(Pessoa p : pessoas ) {
			if( p.getTipo() == tipo && p.getNome().equalsIgnoreCase(nome) ) {
				pessoas.remove(p);
				database.sendAll(pessoas);
				return;
			}
		}
		
	}

	private static void update() throws IOException {
		updateList();
		String endereco = Teclado.leString("Insira o endereco da pessoa fisica/juridica que deseja alterar: ");
		for( Pessoa p : pessoas ) {
			if(p.getEndereco().equalsIgnoreCase(endereco)) {
				p.setEndereco(Teclado.leString("Insira o novo endereco: "));
				if( p instanceof PessoaFisica ) {
					((PessoaFisica) p).setCpf(Teclado.leString("Insira o novo cpf: "));
					((PessoaFisica) p).setNome(Teclado.leString("Insira o novo nome: "));
				}
				else {
					((PessoaJuridica) p).setCnpj(Teclado.leString("Insira o novo cnpj: "));
					((PessoaJuridica) p).setRazaoSocial(Teclado.leString("Insira o novo nome: "));
				}
				database.sendAll(pessoas);
				return;
			}
		}
	}
	
	private static void updateList() {
		pessoas = database.receberDados();
	}
	
}
