package domaci1516;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int izbor;
		do {
			System.out.println("Izracunaj povrsinu");
			System.out.println("0-Izlaz");
			System.out.println("1-Kocke");
			System.out.println("2-Kvadra");
			System.out.println("3-Valjka");
			System.out.println("4-Lopte");
			izbor=sc.nextInt();
			double a,b,c,r;
			switch(izbor) {
			case 1:System.out.println("Unesi a");
			a=sc.nextDouble();
			System.out.println(6*(a*a));
			break;
			case 2:System.out.println("Unesi a,b i c");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			System.out.println(2*((a*b)+(b*c)+(c*a)));
			break;
			case 3:System.out.println("Unesi poluprecnik i visinu");
			r=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println((2*((r*r)*3.14))+(((r*r)*3.14))*b);	
			break;
			case 4:System.out.println("Unesi precnik");
			r=sc.nextDouble();
			System.out.println(4*((r*r)*3.14));
			break;
			case 0:System.out.println("Izlaz");
			break;
			default:System.out.println("Los unos");
			break;
			}
		} while(izbor!=0);
		
	}

}
