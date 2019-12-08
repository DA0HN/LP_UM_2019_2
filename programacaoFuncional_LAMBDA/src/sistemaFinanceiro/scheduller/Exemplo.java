package sistemaFinanceiro.scheduller;

import java.util.List;

import sistemaFinanceiro.dao.FaturaDAO;
import sistemaFinanceiro.email.EmailSender;
import sistemaFinanceiro.modelo.Fatura;

public class Exemplo {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		EmailSender email = new EmailSender();
		
		faturasVencidas.forEach( f -> {
			email.send(f.getEmailDevedor(), f.resumo());
		});
		
		
	}
	
	
}
