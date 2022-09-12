package org.day3;

// Partial Child Class
public class Q6AxisBank extends Q6BankDetails {

	@Override
	public void deposit(int amt) {
		System.out.println("Deposit Amount is :" + " " + amt + "Rs");
		savings(5000);
		fixed(10000);
	}

	public static void main(String[] args) {
		Q6AxisBank axis = new Q6AxisBank();
		// axis.savings(5000);
		// axis.fixed(10000);
		axis.deposit(2000);
	}
}
