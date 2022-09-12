package org.day3;

// Fully Child
public class Q7Arts implements Q7Education {

	private void bSc() {
		System.out.println("Bachulor of Science");
	}

	private void bEd() {
		System.out.println("Bachulor of Education");
	}

	private void bA() {
		System.out.println("Bachulor of Arts");
	}

	private void bBA() {
		System.out.println("Bachulor of Business Administration");
	}

	@Override
	public void ug() {
		System.out.println("Under Gratuate :");
		bSc();
		bEd();
		bA();
		bBA();
	}

	@Override
	public void pg() {
		System.out.println("--  No One in Post Gratuate --");
	}

	public static void main(String[] args) {
		Q7Arts arts = new Q7Arts();
		arts.ug();
		arts.pg();
	}
}
