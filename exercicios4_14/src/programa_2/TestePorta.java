package programa_2;

public class TestePorta {

	public static void main(String[] args) {
		Porta porta = new Porta();
		
		porta.setDimensaoX(2.00);
		porta.setDimensaoY(7.00);
		porta.setDimensaoZ(0.055);
		
		porta.pinta("azul");
		porta.abre();
		porta.print();
		
		
		porta.pinta("verde");
		porta.fecha();
		porta.print();
		
		porta.pinta("marrom");
		
		porta.abre().fecha();
		
		porta.print();
	}

}
