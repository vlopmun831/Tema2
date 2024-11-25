package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Pedir tres números y mostrarlos ordenados de mayor a menor
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Dime un número");
	
	int num1 = scan.nextInt();
	
	System.out.println("Dime otro numero");
	
	int num2 = scan.nextInt();
	
	System.out.println("dime un tercer número");
	
	int num3 = scan.nextInt();
	
	
	if (num1 >= num2  && num2 >= num3) {
		
		System.out.println(num1+ ">" + num2 + ">" + num3);
	}else if (num2 >= num1 && num1>=num3) {
		
		System.out.println("Mayor "+ num2+ " intermedio " + num1 + " menor " + num3);
	}else if (num3>=num1 && num1>=num2 ) {
		System.out.println("mayor "+num3 + " intermedio "+ num1 + " menor "+ num2);
		
	}else if ( num2>=num3 && num3>=num1) {
		
		System.out.println("mayor "+ num2+ " intermedio "+ num3 + " menor " + num1);
		
	}else if (num1>=3 && num3>=num2) {
		System.out.println("Mayor "+num1+ " intermedio "+ num3+ " menor"+ num2);
		
	}else if (num3>=num2 && num2>=num1) {
		System.out.println("Mayor "+ num3+ " intermedio "+ num2+ " menor "+ num1);
		
	}else {
		System.out.println("No se pueden ordenar porque algún número presenta error");
	}
	
	}

}
