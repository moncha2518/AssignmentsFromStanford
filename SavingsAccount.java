package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class SavingsAccount {

	private double currBalance = 0.0;
	private double currBalanceFuture = 0.0;
	private final double INTEREST_RATE = 0.01;

	public SavingsAccount(double openingBalance) {
		currBalance = openingBalance;
	}

	public double getBalance() {
		return this.currBalance;
	}

	public double getInterestRate() {
		return INTEREST_RATE;
	}

	public boolean withdraw(double amount) {

		if (amount >= 0 && amount <= currBalance) {
			currBalance -= amount;
			return true;
		} else {

			return false;
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
		DecimalFormat df = new DecimalFormat("##0.00");
		DecimalFormat dfBalanceFuture = new DecimalFormat("##0.00");
		String interestrate_str = df.format(INTEREST_RATE);

		return "Saving Account Balance: $" + currBalance + "\n" + "Saving Account Interest Rate: " + interestrate_str

				+ "\n" + "Saving Account Balance in 3 years: " + dfBalanceFuture.format(futureValue(3));

	}
}
