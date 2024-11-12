package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un numero");
		
		int num1 = scan.nextInt();
		
		System.out.println("Dime otro número");
		
		int num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		}else { 
			System.out.println("Son distintos");
			
		}
		
		
	}

}
