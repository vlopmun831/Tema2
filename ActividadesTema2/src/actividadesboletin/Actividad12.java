package actividadesboletin;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dime el número correspondiente a un día de la semana");
		
		int día = scan.nextInt();
		
		switch  (día){
		
		case 1 :
			System.out.println("Lunes");
			break;
		case 2 :
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4 :
			System.out.println("Jueves");
			break;
		case 5 :
			System.out.println("Viernes");
			break;
		case 6 :
			System.out.println("Sábado");
			break;
		case 7 :
			System.out.println("Domingo");
			break;
		default :
			System.out.println("Error");
			
			
			
			
			
		}
		

	}

}
