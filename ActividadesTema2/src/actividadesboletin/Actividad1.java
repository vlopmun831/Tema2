package actividadesboletin;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dame un número");
		
		double num1 = scan.nextDouble();
		
		System.out.println("Dame otro número");
		
		double num2 = scan.nextDouble();
		
		if ( num2!=0  ) {
			System.out.println("Tu resultado es " + num1/num2);
			
		}else  {
			System.out.println("Imposible, el segundo número es cero");
		}

	}

}
