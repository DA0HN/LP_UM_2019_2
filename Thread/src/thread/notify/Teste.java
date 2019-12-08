package thread.notify;

public class Teste {
	
	public static void main(String[] args) {
		TiqueTaque tt = new TiqueTaque();
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		try {
			tique.thread.join();
			taque.thread.join();
		}
		catch( InterruptedException e) {
			e.printStackTrace();
		}
	}

}
