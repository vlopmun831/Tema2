package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dime un numero");
		
		int num1= scan.nextInt();
		
		System.out.println("Dame otro número");
		
		int num2= scan.nextInt();
		
		if ( num1 > num2 ) {
			System.out.println("EL mayor es "+ num1);
		}else {
			System.out.println("El mayoe es "+ num2);
			
			
		}
	}

}
