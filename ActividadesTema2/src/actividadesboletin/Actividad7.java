package actividadesboletin;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		 System.out.println(" Dime un año");
		
		int año = scan.nextInt();
		
		if (año % 4== 0 && año % 100 !=0  )  {
			
			System.out.println("Es bisiesto");
			
		}else   {
			System.out.println(" No es bisiesto");
			
		}

		}
		

	}


