package javaLangString.main;

import keyboard.util.Keyboard;

public class StringPalindromo {
	
	public static void main(String[] args) {
		String entrada = Keyboard.readString("Insira um palindromo: ");
		char[] temp = entrada.toCharArray();
		char[] compare = new char[temp.length];
		for(int i=temp.length-1, j=0; i>=0; i--, j++) {
			compare[j] = temp[i];
		}
		String palindromo = new String(compare);
		if( palindromo.equalsIgnoreCase(entrada)) {
			System.out.println("entrada: " + entrada);
			System.out.println("temp: " + palindromo);
			System.out.println("É palindromo");
		}
		else {
			System.out.println("entrada: " + entrada);
			System.out.println("palindromo: " + palindromo);
			System.out.println("Não é palindromo");
		}
	}
}
