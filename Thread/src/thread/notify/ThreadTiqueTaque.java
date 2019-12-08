package thread.notify;

public class ThreadTiqueTaque implements Runnable{

	private TiqueTaque tt;
	protected Thread thread;
	
	private final int NUM = 5;
	
	public ThreadTiqueTaque( String nome, TiqueTaque tt) {
		this.tt = tt;
		thread = new Thread(this, nome);
		thread.start();
	}

	@Override public void run() {
		
		if( thread.getName().equalsIgnoreCase("Tique")) {
			for(int i=0; i < NUM; i++) {
				tt.tique(true);
			}
			tt.tique(false);
		} 
		else {
			for(int i=0; i < NUM; i++) {
				tt.taque(true);
			}
			tt.taque(false);
			
		}
		
	}
}
