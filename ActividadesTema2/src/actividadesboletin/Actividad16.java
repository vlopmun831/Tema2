package actividadesboletin;

import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número comprendido entre el 30 y 99");
		
		int numero = scan.nextInt();
		
		int unidades = numero %10;
		int decenas = numero /10;
		
		switch (decenas) {
		
		case 3: 
			System.out.println("Treinta");
			break;
			
		case 4:
			System.out.println("Cuarenta");
			break;
			
		case 5:
			System.out.println("Cincuenta");
			break;
			
		case 6:
			System.out.println("Sesenta");
			break;
			
		case 7:
			System.out.println("Setenta");
			break;
			
		case 8:
			System.out.println("Ochenta");
			break;
			
		case 9:
			System.out.println("Noventa");
			break;
			
			
		}
		
		switch(unidades) {
		
		case 1:
			System.out.println(" y uno");
			break;
			
		case 2:
			System.out.println(" y dos");
			break;
			
		case 3:
			System.out.println(" y tres");
			break;
			
		case 4 :
			System.out.println(" y cuatro");
			break;
			
		case 5 :
			System.out.println(" y cinco");
			break;
			
		case 6 :
			System.out.println(" y seis");
			break;
			
		case 7 :
			System.out.println(" y siete");
			break;
			
		case 8 :
			System.out.println(" y ocho");
			break;
			
		case 9 :
			System.out.println(" y nueve");
			break;
		default:
			
		
		}
		
		

	}

}
