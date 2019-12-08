package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class SobreposicaoDeMetodo {
	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Gabriel", 1000d);
		acc1.withdraw(200d);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Gaby", 1000d, 0.01);
		acc2.withdraw(200d);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "honda", 1000d, 500d);
		
	}
}
