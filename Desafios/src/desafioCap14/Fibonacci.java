package desafioCap14;

import java.util.InputMismatchException;
import br.edu.ifmt.cba.util.Teclado;

public class Fibonacci {
	
	public static void main(String[] args) {
		try {
			int a = Teclado.leInt("Informe onde a sequencia deve parar:");
			try {
				int[] array = fibot(a);
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
	
	public static int [] fibot(int n){
		int f[] = new int[n];
		if(n == 1){
			f[0] = 1;
			return f;	
		}else {
			f[0] = f[1] = 1;
			for (int i = 2; i < n; i++) {
				f[i] = f[i-1] + f[i-2];	
			}
			return f;
		}
		
	}
}
