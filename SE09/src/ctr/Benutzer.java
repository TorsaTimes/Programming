package ctr;

public class Benutzer extends Account {

	Bibliothek bib = new Bibliothek();
	int buchListeCounter = 0;
	private Buch[] buchList = new Buch[15];

	public Benutzer(String name, String passwort, int alter, String fakultät) {
		super(name, passwort, alter, fakultät);
	}

	public void buchAusleihen(String name) {
		if (this.getAlter() > 18) {

			for (Buch b : bib.buchBibliotheksListe.keySet()) {
				if (b.getBuchName().equals(name)) {
					if (bib.buchBibliotheksListe.get(b).equals(Status.Verfügbar)) {
						this.buchList[buchListeCounter] = b;
						buchListeCounter++;
						bib.buchBenutzerAusleiheListe.put(b, this.getName());
						bib.buchBibliotheksListe.replace(b, Status.Ausgliehen);
						break;
					} else {
						System.out.println("Das buch ist schon verliehen!!!" + b.getBuchName());
					}
				}
			}
		} else {
			System.out.println("Der Benutzer: " + name + " ist unter 18 jahre und ist damit nicht berechtigt ein Buch Auszuleihen");
		}
	}

	public Buch buchSuchenTitle(String name) {

		for (Buch b : bib.buchBibliotheksListe.keySet()) {
			if (b.getBuchName().equals(name)) {
				return b;
			}
		}
		return null;
	}

	public Buch[] getBenutzerBuecher() {
		return null;
	}

	public void getBenutzerBuecherDrucken() {
		System.out.println("Diese Buecher hat der Benutzer: " + this.getName() + " Ausgeliehen: ");
		for (int i = 0; i < buchList.length; i++) {
			if (this.buchList[i] != null) {
				System.out.println("Buch: " + this.buchList[i].getBuchName());
			} else {
				break;
			}
		}
	}

	public void buchZurückgeben(String name) {
		// TODO - implement Benutzer.buchZurückgeben
		throw new UnsupportedOperationException();
	}

	public Buch buchSuchenGenre(String genre) {
		// TODO - implement Benutzer.buchSuchenGenre
		throw new UnsupportedOperationException();
	}

	public Buch buchSuchenAutor(String autor) {
		// TODO - implement Benutzer.buchSuchenAutor
		throw new UnsupportedOperationException();
	}

	public Buch buchSucheKombo(String name, String autor, String genre) {
		// TODO - implement Benutzer.buchSucheKombo
		throw new UnsupportedOperationException();
	}

	public void buchVorbestellen(String name) {
		// TODO - implement Benutzer.buchVorbestellen
		throw new UnsupportedOperationException();
	}

}