package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva28_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dime tu nota entre 0 y 10");
		
		int nota = scan.nextInt();
		
		switch (nota) {
		
			case 0  :
			case 1 :
			case 2:
			case 3 :
			case 4 :
				System.out.println("insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9 :
			case 10 :
				System.out.println("Sobresaliente");
				break;
			default: 
				System.out.println("Invaluable");
				
		}
	}

}
