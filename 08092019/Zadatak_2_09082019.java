package paket;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi kvadrat, krug ili pravougaonik ");
		String geom;
		geom = sc.nextLine();
		double a, b, r;
		switch (geom) {
		case "kvadrat":
			System.out.println("Unesi duzinu");
			a = sc.nextDouble();
			System.out.println("Povrsina je " + (a * a));
			break;
		case "krug":
			System.out.println("Unesi poluprecnik");
			r = sc.nextDouble();
			System.out.println("Povrsina je " + (r * r * 3.14));
			break;
		case "pravougaonik":
			System.out.println("Unesi duzinu");
			a = sc.nextDouble();
			System.out.println("Unesi visinu");
			b = sc.nextDouble();
			System.out.println("Povrsina je " + ((a + b) * 2));
			break;
		default:
			System.out.println("Los unos!");

		}

	}
}
