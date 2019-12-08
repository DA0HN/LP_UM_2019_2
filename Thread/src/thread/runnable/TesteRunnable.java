package thread.runnable;

public class TesteRunnable {
	public static void main(String[] args) {
		
		/* Maneiras de startar a thread */
		// Thread t = new Thread(new MinhaThreadRunnable("#1", 1300));
		// t.start();
		// Ou fazer isso no construtor da classe desejada
		
		new MinhaThreadRunnable("#1", 1300);
		new MinhaThreadRunnable("#2", 2500);
		new MinhaThreadRunnable("#3", 3200);
	
	}
}
