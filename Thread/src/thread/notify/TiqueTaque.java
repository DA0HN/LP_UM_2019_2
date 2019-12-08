package thread.notify;

public class TiqueTaque {
	
	private boolean tique;
	
	public synchronized void tique(boolean isRunning) {
		if( !isRunning ) {
			this.tique = true;
			notify();
			return;
		}
		
		System.out.print("Tique ");
		tique = true;
		notify();
		
		try {
			while( tique ) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public synchronized void taque(boolean isRunning) {
		if( !isRunning ) {
			this.tique = true;
			notify();
			return;
		}
		
		System.out.println("Taque ");
		tique = false;
		notify();
		
		try {
			while( !tique ) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
