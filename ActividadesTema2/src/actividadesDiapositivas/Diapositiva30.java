package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Dime un numero comprendido entre el 0 y el 9999");
		
		int num = scan.nextInt();
		
		int unidades = num%10;
		int decenas = (num/10)%10;
				
		int centenas = (num/100) % 10;
		int millar = (num/1000) % 10;
		
		

	if (num >= 0 && num < 10) {
		System.out.println("Es capicúa");
		
	}else if (num >=10 && num <100 && unidades==decenas ) {
		System.out.println("Es capicúa");
		

	}else if (num>=100 && num < 1000 && unidades==centenas ) {
		System.out.println("Es capicúa");
	
	}else if (num >=1000 && num <10000 && decenas == centenas && unidades==millar) {
		System.out.println("Es capicúa");
		
	}else {
		System.out.println("No es capicúa");
	}
	
	
	}
}