package javaLangString.main;

import keyboard.util.Keyboard;

public class StringMain {
	
	public static void main(String[] args) {
		String entrada = Keyboard.readString("Insira uma string:");
		StringBuilder sb = new StringBuilder();
		if( entrada.length() >= 15 ) {
			entrada = entrada.substring(0, 14);
			sb.append(entrada);
			sb.append("...");
			String newEntrada = sb.toString();
			System.out.println(newEntrada);
		}else {
			System.out.println(entrada);
		}
		
	}
}
