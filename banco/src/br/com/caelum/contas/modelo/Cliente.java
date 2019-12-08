package br.com.caelum.contas.modelo;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	public Cliente(String nome, String sobrenome, String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	public Cliente(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = "110.010.101";
	}
	public Cliente(){
		this.nome = "Desconhecido";
		this.sobrenome = "Da Silva";
		this.cpf = "110.010.101";
	}
	private boolean validaCpf(String cpf) {
		String array[] = new String[3];
		array = cpf.split(".");
		int strToInt;
		for(int i=0; i < array.length; i++) {
			try {
				strToInt = Integer.parseInt(array[i]);
				System.out.println(array[i]);
				System.out.println(strToInt);
				if( strToInt >= 1000 && strToInt < 0) {
					return false;				
				}
				else {
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("Número inválido");
				return false;
			} 
		}
		return true;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if( validaCpf(cpf) ) {
			System.out.println("CPF inválido");
			this.cpf = null;
		}
		else {
			this.cpf = cpf;			
		}
	}
}
