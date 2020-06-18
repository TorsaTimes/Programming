
import java.util.Scanner;

public class FortbildungAS {

	static FortbildungK kontrolle = new FortbildungK();
	
	public static void menue() {
	
	System.out.println("Willkommen im Fortbildung-Menue");
	System.out.println("Folgende Operationen stehen zur Auswahl bereit");
	System.out.println("Ein Sachbearbeiter zuordnen -> 1");
	System.out.println("Fortbildungsstatus eines Sachbearbeiters aendern -> 2");
	System.out.println("Aktuelle Fortbildungen des Sachbearbeiters -> 3");
	System.out.println("Fuer die loeschung einer Fortbildung eines Sachbearbeiters -> 4");
	System.out.println("Zurück in das Menue Sachbearbeiter -> 5");
	Scanner input = new Scanner(System.in);
	int eingabe = input.nextInt();
	if(eingabe == 5) {
		
		return;
	}
	if(eingabe == 1) {
		
		FortbildungZuordnenAAS.oeffnen();
		menue();
	}
	if(eingabe == 2) {
	
		FortbildungStatusAendernAAS.oeffnen();
		menue();
	}
	if(eingabe == 3) {
		
		kontrolle.aktFortbildungStatus();
		menue();
	}
	if(eingabe == 4) {
	
		FortbildungLoeschenAAS.oeffnen();
		menue();
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	

	
	
	
	
	
	
	
	


	


	


	

	


	




	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

	public void sachbearbeiterAdminEditieren() {
		// TODO - implement AdminAS.sachbearbeiterAdminEditieren
		throw new UnsupportedOperationException();
	}

	public void Login() {
		// TODO - implement AdminAS.Login
		throw new UnsupportedOperationException();
	}

	public void sachbearbeiterAdminErzeugen() {
		// TODO - implement AdminAS.sachbearbeiterAdminErzeugen
		throw new UnsupportedOperationException();
	}

	public void sachbearbeiterAdminLoeschen() {
		// TODO - implement AdminAS.sachbearbeiterAdminLoeschen
		throw new UnsupportedOperationException();
	}

}
