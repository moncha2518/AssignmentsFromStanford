package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String[] args) {
		// Instantiate an account holder with a checking balance of $100 and a saving
		// balance of $1000
		AccountHolder John_account = new AccountHolder("John", "James", "Doe", "202010051", 100.0, 1000.0);

		// Display the account holder's toString() output
		System.out.println(John_account.toString());

		// Deposit $500 into the checking account
		John_account.getCheckingAccount().deposit(500);

		// Withdraw $800 from the savings account
		John_account.getSavingsAccount().withdraw(800);

		// Display the checking account toString() output
		System.out.println(John_account.getCheckingAccount().toString());

		// Display the saving account toString() output
		System.out.println(John_account.getSavingsAccount().toString());

		System.out.println();
		// Instantiate an account holder with a checking balance of $200 and a saving
		// balance of $500
		AccountHolder Sarah_account = new AccountHolder("Sarah", "Jane", "Jane", "202010052", 200.00, 500.00);

		// Display the account holder's toString() output
		System.out.println(Sarah_account.toString());

		// Deposit -$500 into the checking account
		Sarah_account.getCheckingAccount().deposit(-500);

		// Withdraw $600 from the savings account
		Sarah_account.getSavingsAccount().withdraw(600);

		// Display the checking account toString() output
		System.out.println(Sarah_account.getCheckingAccount().toString());

		// Display the second account holder's toString() output
		System.out.println(Sarah_account.getSavingsAccount().toString());

	}

}
