package snippet;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sken = new Scanner(System.in);
		System.out.print("Unesi kolicinu elemenata:");
		int n = sken.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesi broj kojim ces da delis:");
		int br = sken.nextInt();
		int i;
		for (i = 1; i <niz.length; i++) {
			if (i % br == 0) {
				System.out.println(niz[i]+i);
			}

		}

	}
}
