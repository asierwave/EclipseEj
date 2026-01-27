package Principal;

import java.util.Scanner;

public class Main {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0;
		
		Scanner teclado = new Scanner (System.in);
				
		
		//Introducción de reserva
		
		//Inicializamos la reserva a nula
		Reserva r2 = new Reserva (1, 1, 1, 1, " ", " ", 0);
		
		do {
			
			
			System.out.println("\n1 - Crear una reserva desde el teclado");
			System.out.println("2 - Establecer el costo de la reserva actual");
			System.out.println("3 - Mostrar datos de la reserva");
			System.out.println("4 - Comprobar dígitos ordenados");
			System.out.println("5 - Salir");
			System.out.println();
			
			System.out.println("Introduzca una opción: ");
			op = teclado.nextInt();
			
			switch (op) {
			case 1: r2= new Reserva (teclado); break;
			case 2: 
				
				
				if (r2.getnComensales()==0) {
					System.out.println("\nNo se puede calcular el coste porque no hay reserva registrada aún.\n");

				} else {
				
				r2.coste= r2.setCoste(r2.getnComensales(), r2.getHoras(), r2.getDia());
				System.out.println("\n¡Coste calculado para la reserva!");
				}
				break;
				
				
			case 3: 
				// Condicional para que si no tenemos reserva aún nos lo indique como tal.
				//Usamos el nComensales a 0 porque eso significa que no hemos formalizado la reserva porque no puede ser 0
				
				if (r2.getnComensales()==0) {
					
					System.out.println("\nNo hay reserva registrada en la plataforma aún.\n");
		
				} else 
				System.out.println("\n"+r2.toString());
				break;
			case 4:	System.out.println("Se intentó");
			break;
			case 5: System.out.println("\nGracias por utilizar nuestra plataforma de reservas. ¡Adiós!"); break;
			}
			
		} while (op != 5);
		
		
		//Imprimir reserva con el constructor que no va por Scanner
		
		Reserva r1 = new Reserva(01, 23, 21, 15, "Niklaus Wirth", "555 555 555", 2);

		System.out.println("\n Extra: Aquí imprimo reserva la otra reserva de ejemplo, por el constructor que no va por Scanner y sin calcular el coste.");

		System.out.println("--------------");
		System.out.println(r1.toString());
		System.out.println("--------------");
		
		
	
	}
	
	
	// Intento de recursividad
	public boolean recursivoCreciente (int aux, int numero) {
			boolean exito=true;
		
		if (numero < aux) {
			exito = false;
			
			
		} else {
			recursivoCreciente(aux, numero);
		}
		
		aux = numero;
		return exito;
		
		
	}
	

}
