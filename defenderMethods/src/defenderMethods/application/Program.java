package defenderMethods.application;

import java.security.InvalidParameterException;
import java.util.Locale;

import defenderMethods.interfaces.InterestService;
import defenderMethods.services.UsaInterestService;
import teclado.Teclado;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double amount = Teclado.leDouble("Amount: ");
		int months = Teclado.leInt("Months: ");
		
		try {
//			BrazilInterestService brIs = new BrazilInterestService(2.0);
			InterestService is = new UsaInterestService(1.0);
			double payment = is.payment(amount, months);
			
			System.out.println("Payment after: " + months + " months:");
			System.out.println(String.format("%.2f", payment) );
		}
		catch(InvalidParameterException e) {
			System.out.println("Error " + e);
		}
	}
}
