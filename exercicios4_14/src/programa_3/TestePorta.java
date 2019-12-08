package programa_3;

public class TestePorta {

	public static void main(String[] args) {
		Casa casa = new Casa();
		
		casa.print();
		casa.pinta("preto");
		
		casa.getPorta1().abre().print();
		
		casa.getPorta2().fecha().abre().fecha().pinta("vermelho");
		casa.getPorta1().pinta("azul");
		casa.getPorta3().
					fecha().
					fecha().
					abre().
					fecha().
					abre().
					fecha().
					print();
		casa.print();
		
	}

}
