package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class TestUpcastAndDowncast {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Gabriel", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Gaby", 0.0, 500.0);
		
//		UpCasting
		Account acc1 = bacc;
		acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Mo", 0.0, 200d);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
//		DownCasting
		BusinessAccount acc4 = (BusinessAccount) acc2;	// forçar a conversão da super classe para a sub classe
		acc4.loan(100);
		
//		BusinessAccount acc5 = (BusinessAccount) acc3;	// acc3 é uma SavingsAccount logo, não pode ser convertida pra uma BusinessAccount
		
		if( acc3 instanceof BusinessAccount ) {
			BusinessAccount acc5 = (BusinessAccount) acc3;	// acc3 é uma SavingsAccount logo, não pode ser convertida pra uma BusinessAccount
			acc5.loan(200d);
			System.out.println("Loan!");	// loan -> empréstimo
		}
		
		if( acc3 instanceof SavingsAccount ) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
