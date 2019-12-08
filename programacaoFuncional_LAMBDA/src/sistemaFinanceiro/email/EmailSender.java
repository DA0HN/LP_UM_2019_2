package sistemaFinanceiro.email;

public class EmailSender {
	
	public void send(String to, String text ) {
		System.out.printf("Enviando email para: %s. O texto: %s%n", to, text);
	}
	
}
