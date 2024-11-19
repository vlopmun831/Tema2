package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int  num1 = scan.nextInt();
		
		System.out.println("DIme otro número");
		
		int  num2 = scan.nextInt();
		
		System.out.println("Ingresa el operador(-,+,*/");
		
		String operador = scan.next();
		
		
		switch (operador) {
			case "+" : 
			System.out.println(num1 + num2);
			break;
			
			case "-" :
			System.out.println(num1 -num2);
			break;
			
			case "*":
			System.out.println(num1 *num2);
			break;
			
			case "/" :
			System.out.println(num1 / num2);
			break;
			
			default:
			System.out.println("No es operable");
			
			
		}
		
		

	}

}
