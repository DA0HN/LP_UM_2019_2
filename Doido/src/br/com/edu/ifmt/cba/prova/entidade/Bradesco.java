package br.com.edu.ifmt.cba.prova.entidade;

import keyboard.util.Keyboard;

public class Bradesco extends Banco{
	static int contContas;
	public Bradesco(String nome) {
		super(nome);
	}

	@Override
	public void menuCriaConta() {
		String nome;
		int cpf;
		System.out.println("Escolha o tipo de conta");
		int tConta =Keyboard.readInteger("1-Conta Gold\n2-Conta Gold Plus\n3-Conta Black");
		switch (tConta) {
		case 1:
			nome = Keyboard.readString("Informe seu nome: ");
			cpf = Keyboard.readInteger("Informe seu CPF: ");
			for (int i = 0; i < contas.length; i++) {
				if(contas[i] == null) {
					contas[contContas] = new ContaGold(nome,cpf);
					break;
				}
			}		
			break;
		case 2:
			nome = Keyboard.readString("Informe seu nome: ");
			cpf = Keyboard.readInteger("Informe seu CPF: ");
			for (int i = 0; i < contas.length; i++) {
				if(contas[i] == null) {
					contas[contContas] = new ContaGoldPlus(nome,cpf);
					break;
				}
			}		
			break;
		case 3:
			nome = Keyboard.readString("Informe seu nome: ");
			cpf = Keyboard.readInteger("Informe seu CPF: ");
			for (int i = 0; i < contas.length; i++) {
				if(contas[i] == null) {
					contas[contContas] = new ContaBlack(nome,cpf);
					break;
				}
			}			
			break;

		default:
			break;
		}
	}
	
	@Override
	public void menuOperacoes() {
		switch (S) {
		case value:
			
			break;

		default:
			break;
		}
	}
}
