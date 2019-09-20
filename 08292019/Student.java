package fakultet;

public class Student extends Covek {

	/*
	 * Student je covek koji se kreira sa brojem indeksa i ima trenutnu godinu
	 * studija i trenutni prosek. Sva polja mogu samo da se dohvate. ispisati u
	 * formatu: Ime_Prezime[godina rodjenja] je student ___ (god studija) godine
	 * studija sa prosekom____ (trenutni prosek).
	 */
	private int brojIndeksa;
	private int godinaStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godinaRodjenja, int brojIndeksa, int godinaStudija,
			double trenutniProsek) {
		super(ime, prezime, godinaRodjenja);
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
		this.trenutniProsek = trenutniProsek;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public double getTrenutniProsek() {
		return trenutniProsek;
	}

	public String ispisi() {
		return getIme() + "_" + getPrezime() + " [" + getGodinaRodjenja() + "] " + " je student " + getGodinaStudija()
				+ ". godine studija sa prosekom " + getTrenutniProsek();
	}
}
