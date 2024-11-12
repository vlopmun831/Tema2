package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		
		int a=scan.nextInt();
		
		System.out.println("Dime otro número entero");
		
		int b=scan.nextInt();
		
		boolean distintos  = ((a!=b) || a==0 || b==0);
		
		System.out.println("Esto es " + distintos);
		
		
		
	

	}

}
