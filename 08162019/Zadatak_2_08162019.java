package domaci1516;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// WHILE petlja
		// Ispis prirodnih brojeva od k do n koji nisu djeljivi sa 5.

		Scanner sc = new Scanner(System.in);
		System.out.println("Odredi donju granicu:");
		int k = sc.nextInt();
		System.out.println("Odredi gornju granicu:");
		int n = sc.nextInt();
		int br = k;
		while (br<=n) {
			if(br%5!=0) {
			
			System.out.println(br);
			
		}
		br+=1;
	}

}
}