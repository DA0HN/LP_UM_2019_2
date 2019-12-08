package sistemaFinanceiro.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import sistemaFinanceiro.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas(){
		Fatura f1 = new Fatura("joao@joao.com", 350.0, LocalDate.now().minusDays(3));
		Fatura f2 = new Fatura("maria@maria.com", 350.0, LocalDate.now().minusMonths(1).minusDays(5));
		Fatura f3 = new Fatura("gaby@gaby.com", 350.0, LocalDate.now().minusDays(7));
	
		return Arrays.asList(f1, f2, f3);
		
	}
	
	
}
