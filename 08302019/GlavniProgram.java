package njiva;

public class GlavniProgram {

	public static void main(String[] args) {
		/*
		 * Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume
		 * ili njive i ispisuje njihov prinos u toku 3 godine.
		 */

		Parcela[] niz = new Parcela[10];
		niz[0] = new Suma(150,100,5,15);
		niz[1] = new Suma(200,220, 200, 120);
		niz[2] = new Njiva(150,200);
		niz[3] = new Njiva(120,180);
		for (Parcela p : niz) {
			if (p != null)
			System.out.println("Prinos parcele u periodu od 3 godine je: " + p.prinos(3));
		}
	}

}
