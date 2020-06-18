package ctr;

public class A {
	private int wert;

	public int getWert() {
		return wert;
	}

	public A(int startWert) {
		wert = startWert;
	}

	public void tausche(A a) {
		System.out.println(" wert: " + wert + "|" + " a.wert: " + a.wert + "|" +  " h: " + 0);
		int h = wert;
		System.out.println("1 " + " wert: " + wert + "|" + " a.wert: " + a.wert + "|" +  " h: " + h);
		wert = a.wert;
		System.out.println("2 " + " wert: " + wert + "|" + " a.wert: " + a.wert + "|" +  " h: " + h);
		a.wert = h;
		System.out.println("3 " + " wert: " + wert + "|" + " a.wert: " + a.wert + "|" +  " h: " + h);
	}
}
