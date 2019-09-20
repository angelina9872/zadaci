package Zadatak_1_08272019;

public class Knjige {
	// Napisati klasu Knjige koja ima sledeca polja:
	// naziv knjige, autora, broj strana, godinu izdanja.
	// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove
	// podatke.

	private String nazivKnjige, imeAutora; // get,potavljamo u kostruktoru
	private int brStrana;// get,potavljamo u kostruktoru
	private int godinaIzdanja;// get,set

	public Knjige(String nazivKnjige, String imeAutora, int brStrana) {
		this.nazivKnjige = nazivKnjige;
		this.imeAutora = imeAutora;
		this.brStrana = brStrana;
		godinaIzdanja = 0;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public String getImeAutora() {
		return imeAutora;
	}

	public int getBrStrana() {
		return brStrana;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
}