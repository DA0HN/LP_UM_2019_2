package thread.implement;

public class Application {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		long elapsed;
		
		Thread main = Thread.currentThread();
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		main.setPriority(10);
		t1.thread.setPriority(1);
		t2.thread.setPriority(1);
		
		try {
			Thread.currentThread().sleep(7000);
			t1.suspend();
			System.out.println("Thread " + t1.nome + " foi suspendida.");
			
			Thread.currentThread().sleep(7000);
			
			t2.suspend();
			System.out.println("Thread " + t2.nome + " foi suspendida.");
			
			t1.resume();
			System.out.println("Thread " + t1.nome + " foi resumida.");
			
			elapsed = System.currentTimeMillis();
			System.out.println("Tempo de execução: " + (double)(elapsed - start)/1000 + " segundos");
			
			t2.resume();
			System.out.println("Thread " + t2.nome + " foi resumida.");
			
			t1.thread.join();
			t2.thread.join();
			
			elapsed = System.currentTimeMillis();
			System.out.println("Tempo de execução: " + (double)(elapsed - start)/1000 + " segundos");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
