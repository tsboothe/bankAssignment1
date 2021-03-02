package com.meritamerica.assignment1;

public class AccountHolder {
		
	private String firstName;
	private String lastName;
	private String middleName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	AccountHolder(
		
	String firstName,
	String middleName,
	String lastName,
	String ssn,
	double checkingAccountOpeningBalance,
	double savingsAccountOpeningBalance
	){
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.ssn = ssn;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}
	
	
	public static void accountHolder() {}
		
	public String getFirstName() {
		return firstName;
	}
	
	void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public void CheckingAccount(getCheckingAccount) {
		return this.checkingAccount;
	}
	
	public SavingsAccount(double getSavingsAccount) {
		return this.savingsAccount;
	}
	
	String toString() 
	{
		return "\nName:" + getFirstName() + " " +getMiddleName() + " " + getLastName() + " " +
				"\nSSN:" + getSSN() + "\n" + getCheckingAccount() +"\n" + getSavingsAccount();
		
		}

	
	}
