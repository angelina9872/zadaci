package Zadatak_1_08272019;

public class GlavniProgram {
	public static void main(String[] args) {
		Knjige a = new Knjige("Lovac u zitu", "Dz. D. Selindzer", 236);
		Knjige b = new Knjige("Majstor i Margarita", "Mihail Bulgakov", 514);
		Knjige c = new Knjige("Sidarta", "Hese", 124);
		a.setGodinaIzdanja(1951);
		b.setGodinaIzdanja(1967);
		c.setGodinaIzdanja(1922);
		System.out.println(
				a.getNazivKnjige() + " / " + a.getImeAutora() + " / " + a.getBrStrana() + " str. / " + a.getGodinaIzdanja() +" god.");
		System.out.println(
				b.getNazivKnjige() + " / " + b.getImeAutora() + " / " + b.getBrStrana() + " str. / " + b.getGodinaIzdanja()+" god.");
		System.out.println(
				c.getNazivKnjige() + " / " + c.getImeAutora() + " / " + c.getBrStrana() + " str. / "+ c.getGodinaIzdanja()+" god.");
	}
}
