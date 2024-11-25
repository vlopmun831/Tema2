package actividadesboletin;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dime una letra en mayúscula o minúscula");

		String letra = scan.next();
		
		if (letra.equals(letra.toUpperCase())) {
			System.out.println("Es una letra mayúscula");
			
		}
		else {
			System.out.println("Es una letra minúscula");
		}
	}

}
