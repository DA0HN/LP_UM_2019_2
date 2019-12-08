package thread.isAliveAndJoin;

public class Teste2 {
	
	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 1700);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1900);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 2900);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		try {
			t1.start();
			t2.start();
			t3.start();
			t1.join();
			t2.join();
			t3.join();
			System.out.println("Programa finalizado.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
