package thread.implement;

public class MinhaThread implements Runnable {
	
	private boolean isSuspended;
	private boolean isTerminated;
	protected String nome;
	protected Thread thread;
	protected long tempoDeExecucao;
	
	public MinhaThread(String nome) {
		this.nome = nome;
		this.isSuspended = false;
		this.isTerminated = false;
		this.thread = new Thread(this, nome);
		thread.start();
	}
	
	@Override public void run() {
		
		long temp = System.currentTimeMillis();
		
		try {
			System.out.println("Executando " + this.nome+ ".");
			for(int i=0; i<10; i++) {
				System.out.println("Thread " + this.nome + ", " + i);
				Thread.sleep(1427);
				synchronized( this ) {
					while( isSuspended ) {
						wait();
					}
					if( this.isTerminated ) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.tempoDeExecucao = (System.currentTimeMillis() - temp)/1000;
		System.out.println("Thread " + this.nome + " terminada.");
		System.out.println("Tempo de execucao da thread " + this.nome + " : " + (double)this.tempoDeExecucao +" segundos.");
	}
	
	void suspend() {
		this.isSuspended = true;
	}
	
	synchronized void resume() {
		this.isSuspended = false;
		notify();
	}
	
	synchronized void stop() {
		this.isTerminated = true;
		notify();
	}
	
}
