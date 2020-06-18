import java.math.BigDecimal;
import java.math.BigInteger;

public class ZugriffsZeiten {

	public static void main(String[] args) {
		
		long ms1 = 0;
		long ms2 = 0;
		long zufallszahlBerechnungsZeit = 0;
		long zufallszahlBerechnungsZeit2 = 0;
		long zufallszahlBerechnungsZeitErg = 0;
		int ergMs = 0;
		int b = 20000000;
		
		double[] zahlenFeld = new double[b];
		System.out.println(zahlenFeld.length);

		while(b != 0) {
			ms1 = System.currentTimeMillis();
			for(int i = 0; i < zahlenFeld.length;i++) {
				zufallszahlBerechnungsZeit = System.currentTimeMillis();
				zahlenFeld[i] = Math.random();
				zufallszahlBerechnungsZeit2 = System.currentTimeMillis();
				zufallszahlBerechnungsZeitErg = ((zufallszahlBerechnungsZeit+zufallszahlBerechnungsZeit2)/2);
			}
			ms2 = System.currentTimeMillis();
			System.out.println("mittlereZugriffszeit = " + (((ms1+ms2)+(zufallszahlBerechnungsZeitErg))/2));
		}
		
		

	}

}
