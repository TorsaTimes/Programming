package ctr;

import java.util.Collection;
import java.util.HashMap;

public class Bibliothek implements BuchSuche {

	public static HashMap<Buch, Status> buchBibliotheksListe = new HashMap<Buch, Status>();
	public static HashMap<Buch, String> buchBenutzerAusleiheListe = new HashMap<Buch, String>();
	
	Collection<Bibliothekar> bibliothekare;
	Collection<Benutzer> benutzer;
	
	public static Bibliothek instance;
	
	public static Bibliothek getInstance() {
		if(instance == null) {
			instance = new Bibliothek();
		}
		return instance;
	}
	

	public static void main(String[] args) {
		
		Login login = new Login();
		
		Benutzer samuB = new Benutzer("Samu","1234",24,"Informatik");
		Benutzer samuB2 = new Benutzer("Oli","1234",19,"Informatik");
		Benutzer samuB3 = new Benutzer("Uwe","1234",23,"Informatik");
		
		
		Buch harryPotter1 = new Buch("harry1","rolling","22.03.1999","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter01 = new Buch("harry1","rolling","22.03.1999","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter2 = new Buch("harry2","rolling","22.03.1999","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter3 = new Buch("harry3","rolling","22.03.1999","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter4 = new Buch("harry4","rolling","22.03.1998","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter5 = new Buch("harry5","rolling","22.03.1997","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter6 = new Buch("harry6","rolling","22.03.1988","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter7 = new Buch("harry7","rolling","22.03.1977","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter8 = new Buch("harry8","rolling","22.03.1956","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter9 = new Buch("harry9","rolling","22.03.1934","fantansy",0,Status.Verfügbar,"keine");
		Buch harryPotter10 = new Buch("harry10","rolling","2 n. Ch.","fantansy",0,Status.Verfügbar,"keine");
		
		
		Benutzer benutzer1 = login.Anmelden("Samu","1234");
		Benutzer benutzer2 = login.Anmelden("Oli","1234");
		Benutzer benutzer3 = login.Anmelden("Uwe", "1234");
		
		String ausleiheSucheB1;
		String ausleiheSucheB2;
		String ausleiheSucheB3;
		
		ausleiheSucheB1 = benutzer1.buchSuchenTitle("harry1").getBuchName();
		benutzer1.buchAusleihen(ausleiheSucheB1);
		ausleiheSucheB1 = benutzer1.buchSuchenTitle("harry2").getBuchName();
		benutzer1.buchAusleihen(ausleiheSucheB1);
		ausleiheSucheB1 = benutzer1.buchSuchenTitle("harry3").getBuchName();
		benutzer1.buchAusleihen(ausleiheSucheB1);
		ausleiheSucheB1 = benutzer1.buchSuchenTitle("harry8").getBuchName();
		benutzer1.buchAusleihen(ausleiheSucheB1);
	
		benutzer1.getBenutzerBuecherDrucken();
		
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry3").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		benutzer2.getBenutzerBuecherDrucken();//Buch kann nicht Ausgeliehen werden
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry4").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry5").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry6").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry7").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		ausleiheSucheB2 = benutzer2.buchSuchenTitle("harry1").getBuchName();
		benutzer2.buchAusleihen(ausleiheSucheB2);
		benutzer2.getBenutzerBuecherDrucken();
		
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		Bibliothek.getInstance().getbuchBibliotheksListe();
		
		System.out.println("     ");
		System.out.println("     ");
		System.out.println("     ");
		
		Bibliothek.getInstance().getbuchBenutzerAusleiheListe();
		
	}
	
	public void getbuchBibliotheksListe() {
		for(Buch b: buchBibliotheksListe.keySet()) {
			System.out.println("Buch: " + b.getBuchName() + " Status: " + buchBibliotheksListe.get(b));
		}
	}
	
	public void getbuchBenutzerAusleiheListe() {
		for(Buch b: buchBenutzerAusleiheListe.keySet()) {
			System.out.println("Buch: " + b.getBuchName() + " Status: " + buchBenutzerAusleiheListe.get(b));
		}
	}
	

	@Override
	public Buch buchSuchenTitle(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}