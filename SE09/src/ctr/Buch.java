package ctr;

public class Buch {
	
	
	Bibliothek bib = new Bibliothek();
	
	private String name;
	private String autor;
	private String verDatum;
	private String genre;
	private int buchId;
	private int Verl�ngert;
	private Status status;
	private String kategorie;
	
	public Buch(String name, String autor, String verDatum, String genre, int verl�ngert, Status status, String kategorie) {
		
		this.name = name;
		this.autor = autor;
		this.verDatum = verDatum;
		this.genre = genre;
		this.Verl�ngert = verl�ngert;
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

