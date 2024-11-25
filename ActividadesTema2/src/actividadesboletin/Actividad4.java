package actividadesboletin;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime tu nota");
		
		int nota= scan.nextInt();
		
		System.out.println("Dime tu edad");
		
		int edad = scan.nextInt();
		
		System.out.println("¿Estás matriculado s/p?");
		
		String matrícula = scan.next();
		
		if (nota>=5 && edad>= 18 && matrícula.equals("s")) {
			System.out.println("Aceptada");
		}else if (nota >= 5 && edad >= 18 && matrícula.equals("p")) {
			System.out.println("Posible");
			
		}else {
			System.out.println("No aceptada");
		}
		
		
	}

}
