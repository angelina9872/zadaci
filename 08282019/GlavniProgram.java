package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		/*
		 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
		 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
		 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
		 * u obliku: IME_PREZIME{ID}. Laptop poseduje polaznika i marku koji se zadaju
		 * prilikom kreiranja. Marka moze samo da se dohvati. Laptop takdje moze da
		 * menja polaznika ili da ostane bez polaznika. Moze da se ispise u obliku:
		 * MARKA{POLAZNIK}
		 */
		Polaznik p1 = new Polaznik("Angelina", "Zabaljac" , 123);
		Laptop l1 = new Laptop(p1,"HP");
		l1.setPolaznik(p1);
		Polaznik p2=new Polaznik("Lidija","Vukicevic",321);
		Laptop l2=new Laptop(p2,"Asus");
		l2.setPolaznik(p2);
	
		System.out.println(p1.ispisi());
		System.out.println(l1.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(p2.ispisi());
		System.out.println(l2.ispisi());

	}
}
