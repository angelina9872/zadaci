package cikazuba;

public class Covek {
	/*
	 * Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.
	 * Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da
	 * se dohvate. Novac moze da se doda i da se oduzme, gde je povratna vrednost
	 * indikator uspesnosti oduzimanja novca. Moze da se sastavi tekstualni zapis u
	 * obliku: IME_PREZIME[ID:JMBG:NOVAC]
	 */

	private static int UID = 0;
	private String ime;
	private String prezime;
	private int jmbg;
	private int novac;
	private int id = ++UID;

	public Covek(String ime,String prezime, int jmbg) {
		this.ime=ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}

	public int getJmbg() {
		return jmbg;
	}

	public int getNovac() {
		return novac;
	}

	public int getId() {
		return id;
	}

	public static int getUID() {
		return UID;
	}

	public void dodajNovac(int novac) {
		this.novac+=novac;
	}

	public void oduzmiNovac(int novac) {
		if (novac > 0) {
			this.novac-=novac;
		}
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getIme()).append("_").append(getPrezime()).append("[").append(id).append(":").append(getJmbg()).append(":").append(getNovac()).append("]");
		return sb.toString();
	}
}