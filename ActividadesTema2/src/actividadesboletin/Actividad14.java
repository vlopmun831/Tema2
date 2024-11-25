package actividadesboletin;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Dime donde va el paquete");
		System.out.println("AN. America del Norte");
		System.out.println("AC. America Central");
		System.out.println("AS. America del Sur");
		System.out.println("E. Europa");
		System.out.println("A. Asia");
//		System.out.println("1. America del Norte");
//		System.out.println("2. America Central");
//		System.out.println("3. America del Sur");
//		System.out.println("4. Europa");
//		System.out.println("5. Asia");

		String destino = scan.next();

		System.out.println("Dime cuanto pesa el paquete en gramos");

		int gramos = scan.nextInt();
		int kilos = gramos / 1000;
		
		if (gramos > 0 && gramos <= 5000) {
			switch (destino) {
			case "AN":
				System.out.println("El costo de tu paquete hacia América del Norte es " + (kilos * 24) + " euros");
				break;
			case "AC":
				System.out.println("El costo de tu paquete hacia América Central es " + (kilos * 20) + " euros");
				break;
			case "AS":
				System.out.println("El costo de tu envío hacia Amercica del Sur es " + (kilos * 21) + " euros");
				break;
			case "E":
				System.out.println("El envío de tu paquete hacia Europa es " + (kilos * 10) + " euros");
				break;
			case "A":
				System.out.println("El envío de tu paquete hacia Asia es " + (kilos * 18) + " euros");
				break;
			default:
				System.out.println("El destino indicado no es válido. ");
			}
		}
		else {
			System.out.println("Solo transportamos paquetes de 1-5000 gramos");
		}
	}

}