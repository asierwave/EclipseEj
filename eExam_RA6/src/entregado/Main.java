package entregado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		RepositorioPaseos repo = new RepositorioPaseos(100);
		Scanner sc = new Scanner (System.in);
		int op = 0;
		
		
		do {
			try {
			menu();
			op = Integer.parseInt(sc.nextLine());
		
			
			switch (op) {
			
			case 1: 
				
				if (repo.alta(sc)) 
					System.out.println("Se ha añadido el paseo correctamente");
				else 
					System.out.println("No hay espacio para añadir mas paseos en el repositorio");
				
				break;
			case 2: 
				if (repo.baja(sc)) 
					System.out.println("Se ha eliminado correctamente el paseo con el id introducido");
				else 
					System.out.println("No se ha encontrado ningún paseo con ese id");
				break;
			
			case 3: 
				if (repo.consulta(sc))
					System.out.println("Se ha encontrado el paseo a nommbre de ese perro. Los datos son los siguientes:\n");
				else
					System.out.println("No se ha encontrado el paseo a nombre de ese perro");
				break;
			
			
			case 4: 
	
				System.out.println(repo);
				
				break;
				
			case 5: 
				System.out.println("Gracias por utilizar este servicio");
				
			}
			
			if (op <1 || op>5) {
				System.out.println("Introduzca una opción correcta");
			}
			
			
		} catch (NumberFormatException e) {
			System.out.println("Introduce un número por favor");
		}

		
			
		} while (op != 5);	
		
	
	}
		
		
		
		

	private static void menu() {
		System.out.println("\n----------------------------------------------------------");
		System.out.println("1 - Dar de alta un paseo");
		System.out.println("2 - Dar de baja un paseo (buscando por su id)");
		System.out.println("3 - Consulta un paseo (buscando por el nombre del perro)");
		System.out.println("4 - Ver todos los paseos");
		System.out.println("5 - Salir");
		System.out.println("----------------------------------------------------------");
		System.out.println("Selecciona una opción: ");
		
	}

}
