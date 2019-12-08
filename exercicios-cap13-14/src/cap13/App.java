package cap13;

import util.Teclado;

public class App {
	
	public static void main(String[] args) {
		String str = Teclado.leString("Insira um numero: ");
		char[] numero = str.toCharArray();
		
		System.out.println(createNumber(numero));
		
	}
	private static Integer createNumber(char[] numero) {
		int i=0;
		for(int j=0, exp=numero.length-1; j<numero.length; j++, exp--) {
			if( forDigit(numero[j]) != null ) {
				i += (int)forDigit(numero[j]) * Math.pow(10, exp);
			}
		}
		return i;
	}
	private static Integer forDigit(char ch) {
		switch (ch) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		default:
			System.out.println("é uma letra: " + ch);
			return null;
		}
	}
	
}
