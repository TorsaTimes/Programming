package ctr;

import java.util.HashMap;

public class Bibliothekar extends Account {

	private int bId;

	private void b�cherEinpflegen(String name, Status status) {

	}

	private boolean verf�gbarkeitPr�fen(String buch) {
		return false;

	}

	private boolean AusleihenPr�fen(String name) {
		return false;

	}

	private void setBuchName(String name) {

	}

	private void setAuthor(String name) {

	}

	private void setVerDatum(String verDatum) {

	}

	private void setGenre(String genre) {

	}

	private void setSeitenanzahl(int seitenanzahl) {

	}

	private void setBuchId(int buchid) {

	}

	private void setBuchPreis(int setBuchPreis) {

	}

	public Buch[] getAusgeliehenBuecher() {
		return null;

	}

	public Buch[] benutzerAusgelieheBuecher(Account name) {
		return null;

	}

	public HashMap getBuchliste() {
		return null;

	}

	public Status setBuchStatus(Status status) {
		return status;

	}

	public Benutzer getBenutzer() {
		return null;

	}

}