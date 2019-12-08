package classe_anonima.main;

public class Externa2 {
	
	public void fooMethod() {
		
		class ClasseLocal{
			
			private String texto = "texto classe local";
			
			public void imprimeTexto() {
				System.out.println(texto);
			}
		}
		
		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();
		
	}
	
	public static void main(String[] args) {
		
		Externa2 foo = new Externa2();
		
		foo.fooMethod();
	}
	
	
}
