package apostila;

public class StringTeste {
	public static void main(String[] args) {
		String x = "a";
		String y = new String("a");
		String w = "a";
		w += "b";
		System.out.println(x);
		System.out.println(w);
		System.out.println(x==w);
	}
}
