package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int num= scan.nextInt();
		String  resultado = "impar";
		
		
		if (num % 2 == 0) {
			resultado = "par";
			
		}
		System.out.println(resultado);
		

	
		
		
		
		
	}
}


