package APP.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import APP.model.Dog;
import APP.model.DogCompare;
import keyboard.util.Keyboard;

public class Main {

	private static Set<Dog> cachorros = new TreeSet<Dog>();
	
	public static void main(String[] args) {
		popularLista();
		menu();
	}
	
	private static void popularLista() {
		cachorros.add(new Dog("Alicate", "Labrador", 'M'));
		cachorros.add(new Dog("Xiquita","Pintcher", 'F'));
		cachorros.add(new Dog("Luna", "Pitbull", 'M'));
		cachorros.add(new Dog("Jos�", "Ra�a A", 'F'));
		cachorros.add(new Dog("Nina", "Labrador", 'M'));
	}

	private static void opcoesDoMenu() {
		System.out.println("Bem vindo ao controle de cachorros!");
		System.out.println("------------------------------------");
		System.out.println("1 - inserir");
		System.out.println("2 - consultar por nome");
		System.out.println("3 - consultar por ra�a");
		System.out.println("4 - sair");
		System.out.println("------------------------------------");
	}
	
	private static void menu() {
		opcoesDoMenu();
		switch ( Keyboard.readInteger("Insira sua op��o: ")) {
		case 1:
			inserir();
			break;
		case 2:
			consultaPorNome();
			break;
		case 3:
			consultaPorRaca();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		menu();
	}
	
	private static void inserir() {
		System.out.println("Insira os dados do novo cachorro: ");
		Dog d = new Dog();
		d.setNome( Keyboard.readString("Insira o nome: ") );
		d.setRaca( Keyboard.readString("Insira a ra�a: ") );
		d.setSexo( Keyboard.readCharacter("Insira o sexo do cachorro[M/F]: ") );
		cachorros.add(d);
	}
	
	private static void consultaPorNome() {
		List<Dog> l = new ArrayList<Dog>();
		l.addAll(cachorros);
		Collections.sort(l);
		l.forEach(d -> {
			System.out.println("Nome: " + d.getNome());
		});
	}
	
	private static void consultaPorRaca() {
		List<Dog> l = new ArrayList<Dog>();
		l.addAll(cachorros);
		Collections.sort(l, new DogCompare());
		l.forEach(d -> {
			System.out.println("Ra�a: " + d.getRaca() + " | " + " Nome: " + d.getNome());
		});
		
	}
	
}
