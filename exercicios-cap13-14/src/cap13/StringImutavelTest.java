package cap13;

public class StringImutavelTest {

	public static void main(String[] args) {
		stringImutavel();
		stringMutavel();
	}
	
	public static void stringImutavel() {
		String s = "fj11";
		System.out.println("Executando replaceAll('1','2')");
		s.replaceAll("1", "2");
		System.out.println("Valor inalterado: " + s);
	}
	
	public static void stringMutavel() {
		String s = "fj11";
		System.out.println("Executando replaceAll('1','2')");
		s = s.replaceAll("1", "2");
		System.out.println("Valor alterado: " + s);
	}
	
	
}
