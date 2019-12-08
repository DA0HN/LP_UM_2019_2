package Aula;

import teclado.Teclado;

public class exercicio {

	public static void main(String[] args) {
		int[][] mat = new int[3][3];
		int sum = 0;
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat.length; j++) {
				mat[i][j] = Teclado.leInt("Insira o valor da posicao "+ (i+1)+" "+(j+1) +" :");  				
				if( i == j) sum += mat[i][j];
			}
		}
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat.length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Somatorio da diagonal principal: "+sum);
		
	}

}
