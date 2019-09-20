package paket;

import java.util.Scanner;

public class Zadatak_1_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, p, o;
		System.out.println("Unesi duzinu");
		a = sc.nextDouble();
		System.out.println("Unesi visinu");
		b = sc.nextDouble();
		p = a * b;
		o = (a + b) * 2;
		System.out.println("Povrsina pravougaonika je:" + p);
		System.out.println("Obim pravougaonika je:" + o);
	}

}
