package ctr;

import java.util.regex.*;


public class beispiel {

	public static void main(String[] args) {
		
	
		
		String int_pattern = "0|[123456789][0123456789]*";
		String int_pattern1 = "^[+-]?\\d*\\.?\\d*\\[E]*\\d?$";
		String int_pattern2 = "\\d*";
		String int_pattern3 = "(^(\\+|\\-)(0|([1-9][0-9]*))(\\.[0-9]{1,2})?$)|(^(0{0,1}|([1-9][0-9]*))(\\.[0-9]{1,2})?$)";
		String int_pattern4 = "^\\d*.?\\d*[E]?\\d*$";
		

		System.out.println(Pattern.matches(int_pattern, "0")); // true

		System.out.println(Pattern.matches(int_pattern, "007")); // false

		System.out.println(Pattern.matches(int_pattern, "5")); // true

		System.out.println(Pattern.matches(int_pattern, "4009")); // true

		System.out.println(Pattern.matches(int_pattern1, "5.614E1"));
		
		System.out.println(Pattern.matches(int_pattern2, "175359476"));
		
		System.out.println(Pattern.matches(int_pattern4, "574,736735E123"));
		
		System.out.println(Pattern.matches(int_pattern4, "574,736735EE123"));
		
		
		System.out.println("");
		System.out.println("testphase");
		
		String int_pattern8 = "^([1-9]|[1-9][0-9]|24)(\\s([1-9]|[1-9][0-9]|24))*$";
		
		String int_pattern9 = "^\\d{4}[-](([0]?[1-9])|([1]?[0-2]))[-](([0]?[1-9])|([1-2]?[0-9])|([3]?[0-1]))[T]?(2[0-4]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9]\\.?\\d{3}\\.)$";
		
		System.out.println(Pattern.matches(int_pattern9, "1233-12-31T24:00:59.888."));
		System.out.println("");
		
		
		
		test eins = new test("");
		
		//_____________________________________________________________________________________________________________________________________________________________________________
		//Aufgabe 2
		
		String int_pattern5 = "^[-]|[+]\\d*.?\\d*[E]?\\d*$";							
		
		String tr1 = "0,6565E11";
		
		System.out.println("Ausgabe Aufgabe 2"); 
		System.out.println(test.regulär(int_pattern5, tr1 ));
		System.out.println(" ");
		
		//_________________________________________________________________________________________________________________________________________________________________________
		//Aufgabe 3 

		String int_pattern6 = "^\\d{4}[-](([0]?[1-9])|([1]?[0-2]))[-](([0]?[1-9])|([1-2]?[0-9])|([3]?[0-1]))[T]?(2[0-4]|[01]?[0-9]):([0-5]?[0-9]):([0-5]?[0-9]\\.?\\d{3}\\.)$";
		
		String tr2 = "1233-12-31T24:00:59.888.";
		
		System.out.println("Ausgabe Aufgabe 3");
		System.out.println(test.regulär(int_pattern6, tr2 ));
		System.out.println(" ");
		
		//____________________________________________________________________________________________________________________________________________________________________________
		//Aufgabe 4
		
		String int_pattern7 = "([A-Z]?[A-Z]?[A-Z])\\s[-]\\s([A-Z]?[A-Z])\\s([1-9]?[0-9]?[0-9]?[0-9])([E|H])?$";
		
		String tr3 = "SAS - FZ 4233H";

		System.out.println("Ausgabe Aufgabe 4");
		System.out.println(test.regulär(int_pattern7, tr3 ));
		System.out.println(" ");
		
		
		
		
	}

}
