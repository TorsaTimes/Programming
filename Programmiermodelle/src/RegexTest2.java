import java.util.regex.Pattern;

public class RegexTest2 {

	
	public static void main(String[] args) {
//		//Aufgabe 1 
//		
		String[] bin�rspeicher = new String[1000];
		for(int i = 0;i<1000;i++) {
		String speicher = Integer.toBinaryString(i);
			bin�rspeicher[i] = speicher;
			//System.out.println(speicher + " " + i);
		}
//		 
//		String bin�r = "([0]|[1])*(0{2})$";
//		for(int i = 0;i<bin�rspeicher.length;i++) {
//			boolean b = Pattern.matches(bin�r, bin�rspeicher[i]);
//			//System.out.println(b + " " +bin�rspeicher[i]); //Aufgabe 1 Ausgabe
//			}
//		
		//Aufagbe 2
		System.out.println(" ");
		String bin�r2 = "((0|1)*((0110)(01))(0|1)*|(1001))*((1|0)*((1001)(10))(1|0)*|(0110))*";
		for(int i = 0;i<bin�rspeicher.length;i++) {
			boolean b = Pattern.matches(bin�r2, bin�rspeicher[i]);
			System.out.println(b + " " +bin�rspeicher[i]); //Aufgabe 2 Ausgabe
			}
		boolean b = Pattern.matches(bin�r2, "1001XYZ0110");
		System.out.println(b);
		boolean c = Pattern.matches(bin�r2, "011001"); 
		System.out.println(c);
		
		//Aufgabe 3 
//		String[] datumSpeicher = {"00.00.2000","13.13.2009","01.32.2009","01.01.-0000","192.168.178","01.011.2009","01...01.2009","01012009","01.01.2009...","..01..01..2009..","13.67.09","31.12.2009","01.01.1510","01.01.2009"};
//		String datum = "((0?[1-9])|([1|2][0-9])|(3[0|1]))\\.((0?[1-9])|(1[0-2]))\\.\\d{4}";
//		for(int i = 0;i<datumSpeicher.length;i++) {
//			boolean b = Pattern.matches(datum, datumSpeicher[i]);
//			System.out.println(b + " " + datumSpeicher[i]); //Aufgabe 2 Ausgabe
//			}
		
//		//Aufgabe 4
//		String[]  geldspeicher= {"03,56�","3,56�","1.000.000.000,00�","3,568�","100000.000�","1000.00,00�","10000,00�","100000�","100.000.000,00�","100.000000,00�"};
//		String geld = "(([1-9]\\d*)|([1-9]\\d{0,2}\\.(\\d{3}\\.)*?\\d{3}))(,\\d{2})?�";
//		for(int i = 0;i<geldspeicher.length;i++) {
//		boolean c = Pattern.matches(geld, geldspeicher[i]);
//		System.out.println(c + " " + geldspeicher[i] + " ");
//		}
	}
}
