package Aula;

import java.util.Random;

public class Aula {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		Random rdm = new Random();
		
		for(int i=0; i<vetor.length; i++) {
			//vetor[i] = i*2;
			vetor[i] = rdm.nextInt(10);
		}
		for(int i=0; i<vetor.length; i++) System.out.println(vetor[i]);
	}

}
