package fakultet;


import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek{

	/*
	 * Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	 * Predmeti mogu da se dodaju i oduzimaju iz liste. Profesora ispisati u
	 * formatu: Ime_Prezime[godina rodjenja] je ___(titula) koji drzi nastavu na:
	 * <lista predmeta>.
	 */
	private String titula;
	private List<String> predmet;

	public Profesor (String titula,String ime,String prezime,int godinaRodjenja) {
		super(ime,prezime,godinaRodjenja);
		this.titula = titula;
		predmet = new ArrayList<String>();
		//predmet.add("Likovno");
		//predmet.add("Muzicko");
		
	}

	public void removePredmet(String p) {
		predmet.remove(p);
	}

	public void dodajPredmet(String p) {
		predmet.add(p);
	}

	public String ispisi() {;
		return getIme()+"_"+getPrezime()+" ["+getGodinaRodjenja()+"] je "+titula+" koji drzi nastavu na:"+ predmet;
	}
}