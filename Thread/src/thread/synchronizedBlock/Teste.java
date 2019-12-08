package thread.synchronizedBlock;

public class Teste {
		
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
		new MinhaThreadSoma("#1", array);
		new MinhaThreadSoma("#2", array);
		
	}
	
}
