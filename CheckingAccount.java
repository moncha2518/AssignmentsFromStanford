package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount {
	private double currBalance = 0.0;
	private double currBalanceFuture = 0.0;

	private final double INTEREST_RATE = 0.0001;

	public CheckingAccount(double openingBalance) {
		currBalance = openingBalance;
	}

	public double getBalance() {
		return this.currBalance;
	}

	public double getInterestRate() {
		return INTEREST_RATE;
	}

	public boolean withdraw(double amount) {

		if (amount < 0 || amount > currBalance) {
			return false;
		} else {
			currBalance -= amount;
			return true;
		}
	}

	public boolean deposit(double amount) {

		if (amount >= 0) {
			currBalance += amount;
			return true;
		} else {

			return false;
		}
	}

	public double futureValue(int years) {
		currBalanceFuture = currBalance * Math.pow(1 + INTEREST_RATE, years);
		return currBalanceFuture;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##0.0000");
		DecimalFormat dfBalanceFuture = new DecimalFormat("###.00");
		String interestrate_str = df.format(INTEREST_RATE);

		return "Checking Account Balance: $" + currBalance + "\n" + "Checking Account Interest Rate: "
				+ interestrate_str + "\n" + "Checking Account Balance in 3 years: "
				+ dfBalanceFuture.format(futureValue(3));

	}

}
