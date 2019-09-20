package cikazuba;

import java.util.ArrayList;
import java.util.List;

public class Ordinacija {

	/*
	 * Ordinacija poseduje naziv, listu stomatologa, listu pacijenata, cenu usluge
	 * kao i stanje racuna. Naziv i cena se zadaju prilikom kreiranja i mogu samo da
	 * se dohvate. Moze da se dodati/ukloni doktor. Moze da se doda/ukloni pacijent.
	 * Moze da se dohvati broj pacijenata/doktora. Moze da se naplati usluga
	 * pacijentima, ali ukoliko neki pacijent ne poseduje dovoljno novca ispisuje se
	 * poruka: “PACIJENT ide u zatvor”. Ordinacija takodje moze da isplati platu
	 * stomatolozima u zadatom iznosu, a povratna vrednost je indikator da li je
	 * plata uspesno isplacena. Moze da se sastavi tekstualni opis:NAZIV:CENA
	 */
	private String naziv;
	private List<Pacijent> pacijent = new ArrayList<>();
	private List<Stomatolog> stomatolog = new ArrayList<>();
	private int cena;
	private int stanjeRacuna;
	private int i;

	public Ordinacija(String naziv, int cena) {
		this.naziv = naziv;
		this.cena = cena;

	}

	public String getNaziv(String naziv) {
		return naziv;
	}
	public List<Stomatolog>getStomatolog(){
		return stomatolog;
	}
	public List<Pacijent>getPacijent(){
		return pacijent;
	}
	
	public int getCena(int cena) {
		return cena;
	}

	public void ukloniStomatologa(int i) {
		stomatolog.remove(i);
	}
	public void dodajStomatologa(Stomatolog i) {
		stomatolog.add(i);
	}

	public void ukloniPacijenta() {
		getPacijent().remove(i);
	}
	public int getBrojPacijenata() {
	return getPacijent().size();
	}

	public String naplata(Pacijent p) {
		if(p.getNovac()<this.cena) 
	return "Pacijent ide u zatvor";
		
	else 
		this.stanjeRacuna+=this.cena;
		return "Naplaceno";
	}
	public String isplatiPlatu(int plata){
			if(plata*stomatolog.size()>=stanjeRacuna) {
				stanjeRacuna-=plata*stomatolog.size();
				for(Stomatolog s:stomatolog) {
					s.dodajNovac(plata);
				}
				return "Plate su isplacene";
			}
			return "Nema para za isplatu";
		}
			
			
		}




