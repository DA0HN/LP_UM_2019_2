package programa_2;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	private int contador;
	
	public Porta(){
		this.contador = 0;
		this.cor = "indefinida";
		this.aberta = false;
		this.dimensaoX = 2.50;
		this.dimensaoY = 3.00;
		this.dimensaoZ = 1.00;
	}
	public int getContador() {
		return contador;
	}
	public String getCor() {
		return cor;
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	public boolean estaAberta() {
		return this.aberta;
	}
	public Porta abre() {
		this.aberta = true;
		this.contador = 1;
		return this;
	}
	public Porta fecha() {
		this.aberta = false;
		this.contador = 0;
		return this;
	}
	public void print() {
		System.out.printf("A porta de cor %s está aberta? %b%n", getCor(),estaAberta() );
	}
	
}
