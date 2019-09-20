package domaci1516;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Zadatak sa IF ;
		// Ucitati 3 broja sa tastature.
		// Sabrati one koji su u intervalu veci 5 i manji ili jednak 9.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi 1. broj:");
		int n = sc.nextInt();
		int sum = 0;
		if (n > 4 && n <= 9) {
			sum += n;
		}
		System.out.println("Unesi 2. broj:");
		n = sc.nextInt();
		if (n > 4 && n <= 9) {
			sum += n;
		}
		System.out.println("Unesi 3. broj:");
		n = sc.nextInt();
		if (n > 4 && n <= 9) {
			sum += n;
		}

		System.out.println("Suma je: " + sum);
	}
}