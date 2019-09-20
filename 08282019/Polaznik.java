package ucionica;

public class Polaznik {
// Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
// Polaznik poseduje i identifikacioni broj koji se moze dohvatiti.
// Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
// Polaznik se ispisuje u obliku: IME_PREZIME{ID}.
	// private static int UID = 0;
	private String ime;// u konstruktoru; get
	private String prezime;// u konstruktoru; get
	private int id;// get

	public Polaznik(String ime, String prezime, int id) {
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;
	}

	public String getIme(String ime) {
		return ime;
	}

	public String getPrezime(String prezime) {
		return prezime;
	}

	public int getId(int id) {
		return id;
	}

	public String ispisi() {
		return ime+"_"+ prezime +"{"+id+"}";
	}
}
