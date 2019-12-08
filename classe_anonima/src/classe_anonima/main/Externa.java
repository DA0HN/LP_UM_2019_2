package classe_anonima.main;

public class Externa {
	
	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			System.out.println(texto);
			
			// consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//new Externa().new Interna().imprimeTexto();
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
		
	}
	
}
