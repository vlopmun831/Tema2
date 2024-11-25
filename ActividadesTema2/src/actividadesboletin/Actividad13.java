package actividadesboletin;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número entre 1 y el 12");
		
		int mes = scan.nextInt();
		
		
		switch (mes) {
		
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 : 
				System.out.println("El mes  tiene 31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes tiene 30 días");
				break;
			case 2:
				System.out.println("El mes tiene 28 días");
				break;
			default :
				System.out.println("El mes debe estar entre uno y doce");
				
		}
		
		
		
	}

}
