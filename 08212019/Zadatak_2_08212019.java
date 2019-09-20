package nizovi;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// TODO Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		// redosledom.
		// Primer niza: 3 54 123 18
		// Ispis: 18 123 54 32
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucitaj duzinu niza:");
		int n = sc.nextInt();
		int niz[] = new int[n];
		System.out.print("Ucitaj brojeve niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int i = niz.length-1; i >=0; i--) {
			System.out.print(niz[i]);
		}
	}
}
