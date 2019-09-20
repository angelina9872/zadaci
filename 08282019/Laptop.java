package ucionica;

public class Laptop {
	// Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	// Marka moze samo da se dohvati.
	// Laptop takdje moze da menja polaznika ili da ostane bez polaznika.
	// Moze da se ispise u obliku: MARKA{POLAZNIK}

	private Polaznik polaznik;// u kontruktoru
	private String marka;// get

	public Laptop(Polaznik polaznik, String marka) {
		this.marka = marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}

	public String getMarka() {
		return marka;
	}
	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}

	public void resetPolaznika(Polaznik polaznik) {
		polaznik = null;
	}

	public String ispisi() {
		String p;
		if (polaznik == null) {
			p = "NEMA POLAZNIKA";
		} else {
			p = polaznik.ispisi();
		}
		return marka + "{" + p + "}";
	}
}