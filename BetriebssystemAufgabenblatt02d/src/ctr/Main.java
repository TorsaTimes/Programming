package ctr;

public class Main {
	private static A a0;
	private static A a1;

	public static void main(String[] args) {
		a0 = new A(1);
		a1 = new A(0);
		new WertTausch(a0, a1).start(); // Thread X
		System.out.println("X " + a0.getWert() + " " + a1.getWert());
		new WertTausch(a1, a0).start(); // Thread Y
		System.out.println("Y " + a0.getWert() + " " + a1.getWert());
	}
}