package actividadesboletin;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dime una letra en mayúscula o minúscula");
		int numero;

		String letra = scan.next();
		
		// a == A
		// A == A
		
		if (letra.equals(letra.toUpperCase())) {
			System.out.println("Es una mayúscula");
		}else if(letra.equals(letra.toLowerCase()))  {
			System.out.println("Es minúscula");
		}

		//Es mayuscula
		if(letra.matches("[A-Z]")) {
			
		}
		// Es minuscula
		else if(letra.matches("[a-z]")) {
			
		}
		//No es una letra
		else {
			
		}
			
	}

}
