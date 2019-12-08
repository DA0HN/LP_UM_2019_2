package classe_anonima.main;

public class Anonima {

	public void imprimeTexto() {
		System.out.println("Qualquer texto");
	}
	
	public static void main(String[] args) {
		
		Anonima anonima = new Anonima() {
			@Override public void imprimeTexto() {
				System.out.println("Qualquer texto que foi sobrescrito.");
			}
		};
		
		anonima.imprimeTexto();
		
		// Usando interface
		Texto texto = new Texto() {
			@Override public void imprimeTexto(){
				System.out.println("Texto sobrescrito da interface");
			}
		};
		
		texto.imprimeTexto();
		
	}
	
}
