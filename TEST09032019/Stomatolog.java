package cikazuba;

public class Stomatolog extends Covek {

	public Stomatolog(String ime, String prezime, int jmbg) {
		super(ime, prezime, jmbg);
	}

	public String toString() {
		return "S_" + super.toString();
	}


}
