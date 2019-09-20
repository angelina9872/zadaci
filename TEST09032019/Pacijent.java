package cikazuba;

public class Pacijent extends Covek {

	public Pacijent(String ime, String prezime, int jmbg) {
		super(ime, prezime, jmbg);
	}

	public String toString() {
		return "P_" + super.toString();
	}
}
