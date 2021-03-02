package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
		
		AccountHolder accountHolder = new AccountHolder("John", "James", "Doe", "123-45-66789", 100, 1000);
		accountHolder.toString();
		accountHolder.getCheckingAccount().deposit(500);
		accountHolder.getSavingsAccount().withdraw(800);
		accountHolder.getCheckingAccount().toString();
		accountHolder.getSavingsAccount().toString();
		AccountHolder accountHolder2 = new AccountHolder("Mary", "Rose", "Smith", "333-22-6767", 200, 500);
		accountHolder2.getCheckingAccount().deposit(-500);
		accountHolder2.getSavingsAccount().withdraw(600);
		accountHolder2.toString();

		
		//System.out.println(accountHolder.toString());
		
	}
	
};
