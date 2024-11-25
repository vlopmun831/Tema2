package actividadesboletin;

import java.util.Scanner;

public class Actividad2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("¿Dime cuantos alumnos van al viaje?");
		
		int alumnos = scan.nextInt();
		
		
		if (alumnos>= 100 ) {
			System.out.println("El pago a la compañía será de " + (alumnos*65)+ " € y los alumnos pagarán 65 €");
			
		}else if (alumnos >=50 && alumnos <=99) {
			
			System.out.println("El pago a la compañia será de "+ (alumnos*70) + " € y los alumnos pagarán 70 €");
			
		}else if ( alumnos >=30 && alumnos <=49) {
			
			System.out.println("El pago a la compañia será de "+ (alumnos*95) +"  € y los alumnos pagarán 95 €");
			
		}else if (alumnos <30) {
			
		System.out.println("El pago a la compañía será de 4000 € y los alumnos pagarán " + (4000/alumnos) +" €");
		}
		

	}

}
