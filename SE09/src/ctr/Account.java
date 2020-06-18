package ctr;

import java.util.ArrayList;

public class Account {

	private String name;
	private int alter;
	private static ArrayList<Account> personenListe = new ArrayList<Account>();
	private String passwort;
	private String fakultät;

	Account(String name, String passwort, int alter, String fakultät){//Konstruktor Account
		this.name = name;
		this.alter = alter;
		this.passwort = passwort;
		this.fakultät = fakultät;
		personenListe.add(this);
	}
	
	Account(){};
	
	public Account getAccounts(String name) {

		
		for(Account n: personenListe) {
			if(n.getName() == name) {
				return n;
			}
		}
		return null;
	}
	
	
	public String getName() {
		return this.name;
	}
	public String getPasswort() {
		return this.passwort;
	}
	public int getAlter() {
		return this.alter;
	}
	public String getFakultät() {
		return this.fakultät;
	}
	
	public Account gib(String name) {
		for(Account a: personenListe) {
			if(a.name.equals(name)) {
				return a;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setName(String name) {
		// TODO - implement Account.setName
		throw new UnsupportedOperationException();
	}
	public void setVorname(String name) {
		// TODO - implement Account.setVorname
		throw new UnsupportedOperationException();
	}

	public void setEmail(String name) {
		// TODO - implement Account.setEmail
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		// TODO - implement Account.getEmail
		throw new UnsupportedOperationException();
	}

	public String getVorname() {
		// TODO - implement Account.getVorname
		throw new UnsupportedOperationException();
	}

}