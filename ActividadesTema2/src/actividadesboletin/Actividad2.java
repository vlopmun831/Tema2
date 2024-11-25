package actividadesboletin;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Dime nombre de usuario");
		
		String nombre = scan.next();
		
		System.out.println("Dime contraseña");
		
		String contraseña = scan.next();
		 
	
		
		if (nombre.equals ("vladi") && contraseña.equals( "daw") ) {
			System.out.println("Has entrado en el sistema");
		}else {
			System.out.println("Error");
		}

	}

}
