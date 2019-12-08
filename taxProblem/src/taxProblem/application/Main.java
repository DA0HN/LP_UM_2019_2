package taxProblem.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import taxProblem.entities.Contribuinte;
import taxProblem.entities.PessoaFisica;
import taxProblem.entities.PessoaJuridica;
import teclado.Teclado;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Contribuinte> list = new ArrayList<>();
		
		int n = Teclado.leInt("Insira o número de contribuintes: ");
		
		for( int i=0; i < n; i++ ) {
			System.out.println("Dados do contribuinte #" + (i+1) + " : ");
			char ch = Teclado.leString("Pessoa física ou juridica (f/j): ").charAt(0);
			if( ch == 'f' ) {
				list.add( new PessoaFisica(
							Teclado.leString("Nome: "),
							Teclado.leDouble("Renda anual: "),
							Teclado.leDouble("Gasto com saúde: ")
						));
			}
			else {
				list.add( new PessoaJuridica(
							Teclado.leString("Nome: "),
							Teclado.leDouble("Renda anual: "),
							Teclado.leInt("Número de funcionarios: ")
						));
			}
		}
		
		double total = 0;
		
		System.out.println("Pagamento de impostos: ");
		
		for(Contribuinte c : list ) {
			System.out.println(c.getNome() + ": $" + String.format("%.2f", c.imposto()));
			total += c.imposto();
		}
		
		System.out.println("Total de impostos arrecadados: $" + String.format("%.2f", total));
		
	}
}
