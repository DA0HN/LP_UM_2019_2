package thread.synchronizedBlock;

public class Calculadora {
	
	private int soma;
	
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		try {
			for(int i=0; i<array.length; i++) {
				soma += array[i];
				System.out.println("Executando soma " + Thread.currentThread().getName() 
						+ " somando valor " + array[i] + " com total de " + soma);
				Thread.sleep(3200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return soma;
	}
	
}
