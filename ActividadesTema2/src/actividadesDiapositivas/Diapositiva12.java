package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int a = scan.nextInt();
		
		String impar = "Es impar";
		
		if (a%2 == 0) {
			impar = "Es par";
			
		}
		System.out.println(impar);
	}
}


