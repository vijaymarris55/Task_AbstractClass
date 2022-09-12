package org.day3;

// Fully Child
public class Q8College implements Q8University {

	@Override
	public void ug(String bba, int strength) {
		System.out.println("A " + bba + " Strength is :" + " " + strength);
	}

	@Override
	public void pg(String mba, int strength) {
		System.out.println("A " + mba + " Strength is :" + " " + strength);
	}

	public static void main(String[] args) {
		Q8College q = new Q8College();
		q.ug("BBA Boys", 45);
		q.pg("MBA Boys", 60);

	}
}
