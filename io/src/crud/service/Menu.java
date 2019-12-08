package crud.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import crud.database.Database;
import crud.database.DatabaseFactory;
import crud.model.Pessoa;
import crud.util.Color;
import keyboard.util.Keyboard;

public class Menu {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	private static Database database;
	
	private static void configDatabase() throws IOException {
		System.out.println("------------------------------------");
		System.out.println(Color.RED);
		System.out.println("Bem vindo ao gerenciador de pessoas");
		System.out.println(Color.RESET);
		System.out.println("------------------------------------");
		System.out.println("Configurações de uso: ");
		System.out.println("0 - resetar dados");
		System.out.println("1 - manter dados");
		System.out.println("------------------------------------");
		
		Integer flag = Keyboard.readInteger("Insira sua opção: ");
		
		if( flag == 0 ) {
			database = DatabaseFactory.createConection(true);
		}
		else if( flag == 1) { 
			database = DatabaseFactory.createConection(false);
		}
		
		loadData();
	}
	
	public static void init() {
		try {
			
			configDatabase();
			
			opcoes();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void menuDeOpcoes() {
		System.out.println("=======================================");
		System.out.println("--> Gerenciador de Pessoas <--");
		System.out.println("1 - Inserir ");
		System.out.println("2 - Alterar ");
		System.out.println("3 - Deletar ");
		System.out.println("4 - Mostrar Todos ");
		System.out.println("5 - Sair ");
		System.out.println("=======================================");
	}
	
	private static void opcoes() throws IOException {
		menuDeOpcoes();
		
		switch( Keyboard.readInteger("Insira sua opcao: ") ) {
		case 1:
			inserir();
			break;
		case 2:
			alterar();
			break;
		case 3:
			deletar();
			break;
		case 4:
			mostrarTodos();
			break;
		case 5:
			System.out.println("Execução Terminada.");
			return;
		default:
			System.out.println("Opção inválida.");
		}
		clearScreen();
		opcoes();
	}

	public static void clearScreen() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	}
	
	private static void mostrarTodos() throws IOException {
		System.out.println("Dados do arquivo: ");
		pessoas.forEach(System.out::println);
		loadData();
	}

	private static void deletar() {
		try {
			String nome = Keyboard.readString("Insira o nome da pessoa: ");
			pessoas.removeIf( p -> p.getNome().equalsIgnoreCase(nome) );
			updateData();
			loadData();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void alterar() {
		try {
			String nome = Keyboard.readString("Insira o nome da pessoa: ");
			for( Pessoa p : pessoas ) {
				if( p.getNome().equalsIgnoreCase(nome) ) {
					p.setNome( Keyboard.readString("Insira o novo nome: "));
					p.setIdade( Keyboard.readInteger("Insira a nova idade: "));
					p.setCpf( Keyboard.readString("Insira o novo cpf: "));
				}
			}
			updateData();
			loadData();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void inserir() {
		try {
			System.out.println("Insira os dados da pessoa: ");
			
			Pessoa p = new Pessoa(
				Keyboard.readString("Insira o nome: "),
				Keyboard.readInteger("Insira a idade: "),
				Keyboard.readString("Insira o cpf")
			);
			
			database.inserirDados(p);
			loadData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void updateData() throws IOException {
		database.updateArchive(pessoas);
	}
	
	private static void loadData() throws IOException {
		Menu.pessoas = database.recuperarDados();
	}
}
