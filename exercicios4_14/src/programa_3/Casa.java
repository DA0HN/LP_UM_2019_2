package programa_3;

import programa_2.Porta;

public class Casa {
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	public Casa(){
		this.cor = "indefinida";
		this.porta1 = new Porta();
		this.porta2 = new Porta();
		this.porta3 = new Porta();
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public String getCor() {
			return this.cor;
	}
	public Porta getPorta1() {
		return porta1;
	}
	public Porta getPorta2() {
		return porta2;
	}
	public Porta getPorta3() {
		return porta3;
	}
	public int quantasPortasEstaoAbertas() {
		return( getPorta1().getContador() + this.getPorta2().getContador() + this.getPorta3().getContador() );
	}
	public void print() {
		String umaPorta = quantasPortasEstaoAbertas() == 1 ? "porta aberta" : "portas abertas"; 
		System.out.printf("A casa de cor %s possui %d %s %n",getCor(),  quantasPortasEstaoAbertas(), umaPorta );
	}
}
