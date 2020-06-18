package ctr;

public class Login {

	Account kontrolle = new Account();

	public Benutzer Anmelden(String name, String passwort) {

		Account akt = kontrolle.gib(name);

		if ((kontrolle.getAccounts(akt.getName())) != null) {

			if (akt.getName().equals(name)) {
				if (akt.getPasswort().equals(passwort)) {
					System.out.println("Anmeldung geschafft");
					return (Benutzer) kontrolle.getAccounts(akt.getName());
				} else {
					System.out.println("Passwort ist Falsch des Benutzers: " + name);
				}
			} else {
				System.out.println("name ist Falsch oder nicht vorhanden des Benutzers: " + name);
			}
		}

		return null;
	}

}