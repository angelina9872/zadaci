package vezbanjee;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesi n i k");
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = 0;
			while (n <= k) {
				sum += n;
				n += 1;
			}
			System.out.println(sum);
		}

	}

