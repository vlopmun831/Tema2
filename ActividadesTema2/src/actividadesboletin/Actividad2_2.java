package actividadesboletin;

import java.util.Scanner;

public class Actividad2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un dia de la semana del 1 al 7");
		
		int dia = scan.nextInt();
		
		switch (dia)  {
		case 1 :
			System.out.println("Lunes");
			break;
		case 2 :
			System.out.println("Martes");
			break;
		case 3 :
			System.out.println("Miércoles");
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
				System.out.println("Este número no es válido como día de la semana");
				
		}
			

	}

}
