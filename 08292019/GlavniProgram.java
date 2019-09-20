package fakultet;


public class GlavniProgram {

	public static void main(String[] args) {
	

		Student s1 = new Student("Angelina", "Zabaljac", 20051989, 00000, 4, 8.3);
		Student s2 = new Student("Lidija", "Vukicevic", 12031965, 12345, 3, 7.5);
		Student s3 = new Student("Zika", "Sarenica", 30121955, 566862, 2, 6.5);
		Profesor p1 = new Profesor("profesor", "Miloje", "Milojevic", 03031);
		p1.dodajPredmet("Automatika");
		Profesor p2 = new Profesor("nastavnik", "Milos", "Milosevic", 23081954);
		p2.dodajPredmet("Tehnicko");
	
		
		System.out.println(s1.ispisi());
		System.out.println(s2.ispisi());
		System.out.println(s3.ispisi());
		System.out.println(p1.ispisi());
		System.out.println(p2.ispisi());

	}
}