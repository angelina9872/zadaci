package domaci1516;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// FOR petlja
		// Ispisati prvih a parnih prirodnih brojeva.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi a");
		int i;
		int a = sc.nextInt();
		for (i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			
		}
	}
}
