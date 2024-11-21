package actividadesboletin;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
<<<<<<< Updated upstream
		Scanner scan = new Scanner (System.in);
				
				System.out.println("Dime la variable x1");
				double x1 = scan.nextDouble();
				
				System.out.println("Dime la variable y1");
				double y1 = scan.nextDouble();
				
				System.out.println("Dime la variable x2");
				double x2 = scan.nextDouble();
				
				System.out.println("Dime la variable y2");
				double y2 = scan.nextDouble();
				
				System.out.println("Dime el r1");
				double r1 = scan.nextDouble();
				
				System.out.println("Dime r2");
				double r2 = scan.nextDouble();
				
				//d=√((x_2-x_1)²+(y_2-y_1)²)
				double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

				if (distancia>(r1+r2)) {
					System.out.println("Son exteriores");
					
				}else if (distancia == r1+r2) {
					System.out.println("Son Tangentes exteriores");
					
				}else if (distancia<(r1+r2) && distancia>(r1-r2)) {
					System.out.println("Son secantes");
					
				
				
				}else if ( distancia ==(r1-r2)) {
					System.out.println("Son Tangentes interiores");
					
				} else  if (distancia> 0 && distancia > (r1-r2)) {
					System.out.println("Son interiores");
					
				}else if (distancia == 0) {
					System.out.println("Son concéntricas");
				}
					
				}
=======
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame un punto x1");
		
		double x1 = scan.nextDouble();
		
		System.out.println("Dame otro punto y1");

		double y1 = scan.nextDouble();
		
		System.out.println("Dame el punto x2");
		
		double x2= scan.nextDouble();
		
		System.out.println("Dame el punto y2");
		
		double y2 = scan.nextDouble();
		
		System.out.println("Dame el radio r1");
		
		double r1 = scan.nextDouble();
		
		System.out.println("Dame el radio r2");
		
		double r2 = scan.nextDouble();
		
		switch 
	}
>>>>>>> Stashed changes

}
