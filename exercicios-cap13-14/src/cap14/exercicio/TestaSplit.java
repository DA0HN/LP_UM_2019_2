package cap14.exercicio;

public class TestaSplit {
	public static void main(String[] args) {
		String frase = "Socorram-me, subi no ônibus em Marrocos";
		String[] palavras = frase.split(" ");
		String fraseInvertida = "";
		
		for(int i=palavras.length-1; i>=0; i--) {
			fraseInvertida += palavras[i] + " ";
		}
		System.out.println(fraseInvertida);
	}
}
