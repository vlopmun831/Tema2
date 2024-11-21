<<<<<<< Updated upstream
 package actividadesboletin;
=======
package actividadesboletin;
>>>>>>> Stashed changes

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime un día");
		
		int dia = scan.nextInt();
		
		System.out.println("Dime un mes");
		
		int mes = scan.nextInt();
		
		System.out.println("Dime un año");
		
		int anno = scan.nextInt();
		
		switch (mes) {
			case 1: 
			case 2:
				if (dia>=1 && dia<=28) {
					
					System.out.println("Tu fecha es válida");
				}else if( (anno % 4== 0 && anno %100 != 0) && (dia >=1 && dia <=28)) {
					System.out.println("Tu fecha es válida");
					
				}else {
					System.out.println("Tu fecha es incorrecta , revisa el dia");
				}
				
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >=1 && dia <=31) {
					System.out.println("La fecha es válida");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia >=1 && dia <=30) {
					System.out.println("La fecha es válida");
				}else 
					System.out.println("Tu fecha es incorrecta, revisa el día");
				break;
			default :
				System.out.println("Tu fecha no es correcta");
			}
				
		}
		

	}


