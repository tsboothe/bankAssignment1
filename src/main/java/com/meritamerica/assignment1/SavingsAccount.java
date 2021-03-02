package com.meritamerica.assignment1;

public class SavingsAccount {
	
		
		private static final String OpeningBalance = null;
		private SavingsAccount openingBalance;
		private double getBalance;
		private double getInterestRate;
		private boolean withdraw;
		private boolean deposit;
		private double futureValue;
		
		public double OpeningBalance() {
			return futureValue;}
		
		SavingsAccount(
				
				double openingBalance,
				double getBalance, 
				double getInterestRate,
				boolean withdraw,
				boolean deposit,
				double futureValue
				
				) {
			this.getBalance = getBalance;
			this.getInterestRate = getInterestRate;
			this.withdraw =withdraw;
			this.deposit = deposit;
			this.futureValue = futureValue;
			openingBalance = new openingBalance(OpeningBalance);

		}

		
		public double getBalance() {
			return getBalance;
		}
		
		public void deposit(double amount) {
			
			if (amount<=0) {
				System.out.println("Amount entered is invalid");
			}
			else
			{
				getBalance = getBalance + amount;
				openingBalance.deposit(amount) ;
				return;
			}
		}
		
		public void withdraw(double amount) {
			
			if (amount<=0) {
				System.out.println("Amount entered is invalid");
			}
			else 
			{
				if (getBalance < amount) {
					System.out.println("Insufficient funds");
				}
					else {
						getBalance = getBalance - amount;
					}
			}
			openingBalance.withdraw(amount);
			return;
			}
		
	public void futureValue(int years, int presentValue) {
			
			if (years != 1) {
				return (presentValue * ((presentValue * 0.01), years - 1));
			}
			else {
			return presentValue;
		}
		
	}	}
