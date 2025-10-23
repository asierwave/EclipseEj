package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un digito: " );
		numero=teclado.nextInt();

		switch(numero) {
		case 1: 
			System.out.println("Pepe");
			break;
			
			//Para asignar los mismos valores a más de un caso
		case 24:
		case 18: 
			System.out.println("Ana");
			break;
		
		case -3: 
			System.out.println ("Carlos");
			break;
		
		default: 
			System.out.println ("Anónimo");
			
		}	
	}
}
