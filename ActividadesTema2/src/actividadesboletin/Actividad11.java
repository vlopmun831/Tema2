package actividadesboletin;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime el número que te ha salido");
		
		int número= scan.nextInt();
		
		 switch (número) {
		 
		 	case 1 :
		 		System.out.println("Tu número opuesto es seis");
		 		break;
		 		
		 	case 2 :
		 		System.out.println("Tu número opuesto es cinco");
		 		break;
		 		
		 	case 3 :
		 		System.out.println("Tu numero opuesto es cuatro");
		 		break;
		 		
		 	case 4 :
		 		System.out.println("Tu número opuesto es el tres");
		 		break;
		 		
		 	case 5 :
		 		System.out.println("Tu número opuesto es el dos");
		 		break;
		 		
		 	case 6 :
		 		System.out.println("Tu número opuesto es el uno");
		 		break;
		 		
		 	default :
		 		System.out.println("Ese número es imposible en un dado");
		 
		 }
	

	}

}
