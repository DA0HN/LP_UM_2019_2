package pessoa;

public class App {

	public static void main(String[] args) {
		
		Pessoa raul = new Pessoa("Raul");
		Pessoa gaby = new Pessoa("Gaby");
		Pessoa joao = new Pessoa("Joao");
		
		Pessoa gabriel = new Pessoa("Gabriel");
		Pessoa amanda = new Pessoa("Amanda");
		
		Pessoa jose = new Pessoa("jose");
		Pessoa lia = new Pessoa("Lia");

		
		
		raul.setDad(joao);
		raul.setMom(gaby);
		
		gaby.setMom(lia);	// mãe da gaby
		gaby.setDad(jose);	// pai da gaby
		
		// raul é neto de leite e lia
	
		jose.setDad(gabriel);
		jose.setMom(amanda);
		
		System.out.println(raul.isAscendente(gabriel));
		
	}
	
}
