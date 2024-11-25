package actividadesboletin;

import java.util.Scanner;

public class Actividad2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int precioInicial = 60;
				
		System.out.println("¿De qué tipo  es la uva que entregas a o b?");
		
		String  tipoUva = scan.next();
		
		
		
		System.out.println("¿De que tamaño es?");
		
		int tamaño = scan.nextInt();
	
		
		if (tipoUva.equals("a") && tamaño==1) {
			System.out.println("la ganancia total será de "+ (precioInicial+20)+ " céntimos por kilo");
			
		}else if (tipoUva.equals("a") && tamaño ==2) {
			System.out.println("La ganancia total será de "+ (precioInicial+30)+ " céntimos por kilo");
			
		}else if (tipoUva.equals("b")&& tamaño ==1) {
			System.out.println("La ganancia total será de "+ (precioInicial-30)+ " céntimos por kilo");
			
		}else if (tipoUva.equals("b") && tamaño ==2) {
			System.out.println("La ganancia será de "+ (precioInicial-50)+ " céntimos por kilo");
			
		}else
			System.out.println("Ni el tipo de uva ni el tamaño se correspone con lo que solicitamos");
		
	
		}
		

	}


