package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva32_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número comprendido entre el 0 y el 10");
		int  número = scan.nextInt();
		
		switch (número) {
		case 0 :
			System.out.println("Cero");
			break;
		case 1 :
			System.out.println("Uno");
			break;
		case 2 :
			System.out.println("Dos");
			break;
		case 3 :
			System.out.println("Tres");
			break;
		case 4 :
			System.out.println("Cuatro");
			break;
		case 5 :
			System.out.println("Cinco");
			break;
		case 6 :
			System.out.println("Seis");
			break;
		case 7 :
			System.out.println("Siete");
			break;
		case 8 :
			System.out.println("Ocho");
			break;
		case 9 :
			System.out.println("Nueve");
			break;
		case 10:
			System.out.println("Diez");
			break;
			default :
				System.out.println("Este número no está entre el cero y el diez");
				
			
		}

	}

}
