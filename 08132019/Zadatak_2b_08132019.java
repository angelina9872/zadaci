package domaci;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <=n) {
			sum += i;
			i += 1;
		}
		System.out.println(sum);
	}

}