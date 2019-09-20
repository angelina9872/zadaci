package nizovi;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama,
		// a druga vraca zbir parnih elemenata niza.
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucitaj duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitajNiz(niz);
		int pro = proizvod(niz);
		System.out.println("Proizvod je " + pro);
		int sum = suma(niz);
		System.out.println("Suma je " + sum);
	}

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite " + niz.length + " elementa: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int proizvod(int niz[]) {
		int pro = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0) {
				pro *= niz[i];
			}

		}
		return pro;
	}

	public static int suma(int niz[]) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 0) {
				sum += niz[i];
			}
		}
		return sum;
	}
}
