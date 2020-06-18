import java.util.Scanner;

public class FortbildungLoeschenAAS {

	
	private static FortbildungLoeschenK kontrolle = new FortbildungLoeschenK();
	
	
	public static void oeffnen() {
		
		System.out.println("Von welchem Sachbearbeiter wird die Fortbildung geloescht?");
		System.out.println("Bitte geben Sie den Sachbearbeiter ein: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Welche Fortbildung soll geloescht werden?");
		System.out.println("Bitte geben Sie die Fortbildung ein:");
		String fortbildung = input.nextLine();
		
		
		
		
		kontrolle.fortbildungLoeschen(name, fortbildung);
	}
	
	
	
}
