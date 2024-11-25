package actividadesDiapositivas;

import java.util.Scanner;

public class Diapositiva32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime la cantidad diaria de comida que compras para los animales");
		
		int comidaDiaria = scan.nextInt();
		
		System.out.println("Dime el número de animales a alimentar");
		
		int numAnimales = scan.nextInt();
		
		System.out.println("Dime la media de kilos que come cada animal");
		
		int kilosPorAnimal = scan.nextInt();
		
		
		
		if (comidaDiaria >= (numAnimales * kilosPorAnimal) ) {
			System.out.println("Tienes comida suficiente para los animales");
			
			
		}else if (comidaDiaria < (numAnimales * kilosPorAnimal)) {
			System.out.println("No tienes suficiente comida");
			
			System.out.println("Cada animal recibira "+ comidaDiaria / numAnimales+ " kilos de comida");
		
		}

	}

}
