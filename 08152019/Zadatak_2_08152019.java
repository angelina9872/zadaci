package domaci1516;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// TODO Napisati program koji ce ispisati N brojeva Fibonacijevog niza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj");
		int n = sc.nextInt();
		int i;
		int a = 0;
		System.out.print(a);
		int b = 1;
		System.out.print(b);
		for (i = 1; b < n; i++) {
			int c = a + b;
			System.out.print(c);
			a = b;
			b = c;

		}

	}

}
