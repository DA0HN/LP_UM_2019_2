package entities;

import java.util.ArrayList;
import java.util.List;

import util.Teclado;

public class Cadastro {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public Cadastro(){
		System.out.println("Bem vindo ao sistema de cadastro");
	}
	
	public void tabelaDeOpcoes() {
		System.out.println("1 - cadastrar");
		System.out.println("2 - alterar");
		System.out.println("3 - excluir");
		System.out.println("4 - mostrar pessoas cadastradas");
		System.out.print("Opcao: ");
	}
	
	public void cadastrarPessoa() {
		System.out.println("----------------------------");
		System.out.println("Cadastrar");
		String nome = Teclado.leString("Insira o nome: ");
		String cpf = Teclado.leString("Insira o cpf: ");
		pessoas.add(new Pessoa(
				nome,
				cpf));
	}
	
	public void alterar() {
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
	
	public void consulta() {
		System.out.println("----------------------------");
		System.out.println("Consultar");
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
	}
	public void excluir() {
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
