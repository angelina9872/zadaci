package nizovi;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// ucitaj k n m kao niz ,vrati proizvod i minimalni
		int niz[] = new int[3];
		ucitajNiz(niz);
		int pro = proizvodCifara(niz);
		System.out.println(pro);
		int min = minimalni(niz);
		System.out.println("Najmanja cifra je: " + min);

	}

	public static void ucitajNiz(int niz[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi 3 broja: ");
		for (int i = 0; i < 3; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvodCifara(int niz[]) {
		int c = niz[0] * niz[1] * niz[2];
		System.out.print("Proizvod cifara je: ");
		return c;
	}

	public static int minimalni(int niz[]) {
		int min = 0;
		for (int i = 1; i < niz.length; i++) {
			if (niz[i] < niz[min]) {
				min = i;
			}

		}
		return niz[min];
	}
}
