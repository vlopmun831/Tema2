package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Dime un número comprendido entre 0 y 99999");

		int num = scan.nextInt();

		if (num >= 0 && num <= 9) {
			System.out.println("El número tiene una cifra");
			
		} else if (num >= 10 && num <= 99) {
			System.out.println("El número tiene dos cifras");
			
		} else if (num >=100 && num <= 999) {
			System.out.println("El número tiene tres cifras");
			
		} else if (num >= 1000 && num <= 9999) {
			System.out.println("El número tiene cuatro cifras");
		
		} else if (num >=10000 && num <= 99999) {
			System.out.println("El número tiene cinco cifras");
		}

	}

}
