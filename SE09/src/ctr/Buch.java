package ctr;

public class Buch {
	
	
	Bibliothek bib = new Bibliothek();
	
	private String name;
	private String autor;
	private String verDatum;
	private String genre;
	private int buchId;
	private int Verlängert;
	private Status status;
	private String kategorie;
	
	public Buch(String name, String autor, String verDatum, String genre, int verlängert, Status status, String kategorie) {
		
		this.name = name;
		this.autor = autor;
		this.verDatum = verDatum;
		this.genre = genre;
		this.Verlängert = verlängert;
		this.status = status;
		this.kategorie = kategorie;
		
		bib.getInstance().buchBibliotheksListe.put(this, status);
		
	}
	
	public String getBuchName() {
		return this.name;
	}
	public Status getStatus() {
		return this.status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

