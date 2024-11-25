package actividadesboletin;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
	System.out.println("Dime uno de los lados");
	
	double a = scan.nextDouble();
	
	System.out.println("Dime otro lado");
	double b = scan.nextDouble();
	
	System.out.println("Dime el tercer lado");
	
	double c = scan.nextDouble();
	
	if (Math.pow(a,  2)+ Math.pow(b,2) == Math.pow(c,2)) {
		System.out.println("Es un triángulo rectángulo");
		
	}else if (a==b && c!=a || c==a  && b!=c  || b==c && a !=b) {
		System.out.println("Es un triángulo isósceles");
		
	}else if (a==b && a==c) {
		System.out.println("Es un triángulo equilátero");
		
	}else {
		System.out.println("Es un triángulo escaleno");
		
	}

	}

}
