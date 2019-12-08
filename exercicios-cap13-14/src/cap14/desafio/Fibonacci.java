package cap14.desafio;

import java.util.InputMismatchException;

import util.Teclado;

public class Fibonacci {
	
	public static void main(String[] args) {
		try { 
			int numeroDeTermos = Teclado.leInt("Informe o número de termos da sequencia:");
			try {
				int[] array = fibonacciGenerator(numeroDeTermos);
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + ", ");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Informe números maiores que 0!");
				main(null);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Informe apenas números!");
			main(null);
		}
	}
	
	public static int [] fibonacciGenerator(int numero){
		int[] foo = new int[numero];
		if(numero == 1){
			foo[0] = 1;
			return foo;	
		}else {
			foo[0] = foo[1] = 1;
			for (int i = 2; i < numero; i++) {
				foo[i] = foo[i-1] + foo[i-2];	
			}
			return foo;
		}
		
	}
}
