public class SachbearbeiterverwaltungHS {


		public static void main(String[] args) {
			
			SachbearbeiterEK Tom = new SachbearbeiterEK("Tom_Weinberger","1234","admin");
			SachbearbeiterEK Cedric = new SachbearbeiterEK("Ron_Metzger","1234","normal");
			SachbearbeiterEK Dani = new SachbearbeiterEK("Daniel_Grimm","1234","admin");
			SachbearbeiterEK saleh = new SachbearbeiterEK("Saleh_Omar","1234","normal");
			Tom.add();
			Cedric.add();
			Dani.add();
			saleh.add();
			Fortbildung AllgemeineBetriebswirtschaft = new Fortbildung("Allgemeine Betriebswirtschaft");
			Fortbildung Mathe1 = new Fortbildung("Mathe1");
			Fortbildung Mathe2 = new Fortbildung("Mathe2", Mathe1);
			Fortbildung kostenrechnung = new Fortbildung("kostenrechnung", Mathe2 ,AllgemeineBetriebswirtschaft);
			
			//System.out.println(SachbearbeiterEK.gibKopie("Cedric"));
			//System.out.println(SachbearbeiterEK.gibAlleNamen().toString());
			//System.out.println(SachbearbeiterEK.gibAnzahl());
			
			//System.out.println(SachbearbeiterEK.gib("Tom").getBenutzername());
//			System.out.println(SachbearbeiterEK.gib("Tom").getPasswort());
//			System.out.println(SachbearbeiterEK.gib("Tom").gibBerechetigung());
			
			System.out.println("Willkommen im Sachbearbeiterverwaltungs-Programm");
			System.out.println("------------------------------------------------");
			LoginAS.oeffnen();
			
			
		}


}