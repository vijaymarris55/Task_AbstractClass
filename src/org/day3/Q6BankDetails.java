package org.day3;

// Partial - Parent Class
public abstract class Q6BankDetails {

	public void savings(int amt) {
		System.out.println("Savings Amount is :" + " Rs" + amt);
	}

	public void fixed(int amt) {
		System.out.println("Fixed Amount is :" + " Rs" + amt);
	}

	public abstract void deposit(int amt);
}
