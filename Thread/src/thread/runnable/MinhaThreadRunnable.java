package thread.runnable;

public class MinhaThreadRunnable implements Runnable {
	/*
	 * Quando implementamos Runnable, tamb�m precisamos implementar
	 * o m�todo run()
	 * Com a classe Runnable, podemos extender qualquer outra classe
	 * Se n�o for sobrepor qualquer outro m�todo da class Thread,
	 * pode ser melhor implementar a interface Runanble 
	 * */
	private String nome;
	private Integer tempo;
	
	public MinhaThreadRunnable(String nome, Integer tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();
	}
	
	
	
	@Override public void run() {
		try {
			for( int i=0; i<6; i++) {
				Thread.sleep(this.tempo);
				System.out.println(this.nome + " contador " + i);
				
			}
			System.out.println("Fim da execu��o da thread " + this.nome);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
