package nizovi;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucitaj duzinu niza:");
		int n = sc.nextInt();
		int niz[] = new int[n];
		System.out.print("Ucitaj brojeve niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for(int i=0;i<niz.length-1;i++) {
			if (niz[i] <= niz[i + 1]) {

				System.out.println("Niz je rastuci");
				break;
			}
			else {System.out.println("Niz nije rastuci");
			break;
		}
	}
}
}