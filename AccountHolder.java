package com.meritamerica.assignment1;

public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;

	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;

		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return this.ssn;
	}

	public void setSSN(String ssn) {
		this.ssn = ssn;

	}

	public CheckingAccount getCheckingAccount() {
		return this.checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return this.savingsAccount;
	}

	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName + " " + "\n" + "SSN: " + ssn;
	}

}
