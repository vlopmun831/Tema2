package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
			int a = scan.nextInt();
		
		System.out.println("Dime otro número");
	
			int b = scan.nextInt();
			
			boolean múltiplo = (b % a == 0);
			
			System.out.println("Esto es " + múltiplo);
			

	}

}
