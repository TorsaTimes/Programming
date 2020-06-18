import java.util.Scanner;

public class AdminAS {

	SachbearbeiterAdminK controll = new SachbearbeiterAdminK();
	SachbearbeiterAdminEditierenAAS sachbearbeiterAdminEditierenAAS =  new SachbearbeiterAdminEditierenAAS();
	
	public static void menue() {
		

		System.out.println("Willkommen im Sachbearbeiter-Admin-Menue");
		System.out.println("--------------------------------------");
		System.out.println("Sie können nun waehlen: ");
		System.out.println("Fuer Sachbearbeiter zu editieren waehlen Sie die -> 1");
		System.out.println("Fuer Sachbearbeiter berechtigung aendern -> 2");
		System.out.println("Fuer Sachbearbeiter erzeugen -> 3");
		System.out.println("Fuer Sachbearbeiter loeschen -> 4");
		System.out.println("Fuer Fortbildungauswaehlen -> 5");
		System.out.println("Fuer Login waehlen Sie die -> 6");
		Scanner input = new Scanner(System.in);
		int eingabe = input.nextInt();
		if(eingabe == 6) {
			
			return;
			
		}
		if(eingabe == 1) {
		
			SachbearbeiterEditierenAAS.oeffnen();
			menue();			
		}
		if(eingabe == 2) {
	
			SachbearbeiterAdminEditierenAAS.oeffnen();
			menue();
	
		}
		if(eingabe == 3) {
	
			SachbearbeiterAdminErzeugenAAS.oeffnen();
			menue();
	
		}	
		if(eingabe == 4) {
			
			SachbearbeiterAdminLoeschenAAS.oeffnen();
			menue();
			
		}
		if(eingabe == 5) {
			
			FortbildungAS.menue();
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