package thread.synchronizedBlock;

public class MinhaThreadSoma implements Runnable {

	
	private String nome;
	private int[] array;
	private static Calculadora calculadora = new Calculadora();
	
	public MinhaThreadSoma(String nome, int[] array) {
		this.nome = nome;
		this.array = array;
		new Thread(this, nome).start();
	}
	
	@Override public void run() {
		System.out.println(this.nome + " iniciada.");
		int soma = calculadora.somaArray(this.array);
		System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);
		System.out.println(this.nome + " terminada.");
	}

}
