package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime una nota de 0 a 10");
		
		int nota = scan.nextInt();
		
		if (nota >= 0  &&  nota <=4) {
			
			System.out.println("Tu nota es insuficiente");
		}else if (nota ==5) {
			System.out.println("Tu nota es suficiente");
			
		}else if ( nota == 6) {
			System.out.println("Tu nota es bien");
			
		}else if (nota>=7 && nota<=8) {
			System.out.println("Tu nota es un notable");
			
		}else if (nota >=9 && nota <=10) {
			System.out.println("Tu nota es sobresaliente");
		}

	}

}
