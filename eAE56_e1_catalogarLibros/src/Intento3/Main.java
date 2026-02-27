package Intento3;

import java.util.Scanner;

public class Main {
	


	public static void main(String[] args) {

		int op = 0;
		Scanner sc = new Scanner (System.in);
		Catalogo catalogo = new Catalogo(100);

		
		do {
			menu();
			
			op = sc.nextInt();
			
			switch (op){
			case 1: 
			if (catalogo.alta(sc)) {
					System.out.println("Libro añadido correctamente");
			} else 
				System.out.println("No hay espacio para añadir libros");
				break;
			case 2:
				if (catalogo.baja(sc)) {
					System.out.println("Libro añadido correctamente");
				} else 
					System.out.println("No hay libro con ese isbn");

				
				break;

			case 3:
				System.out.println(catalogo);
				
				
				break;

			case 4:
				break;

	
			case 5: System.out.println("Gracias por utilizar el servicio de biblioteca");
			
			}
			
		} while(op != 5);
		
		if (op <1 || op>5) {
			System.out.println("Opcion incorrexta");
		}
		
		
		
		
	}

	private static void menu() {
		
		System.out.println("Menú servicio de biblioteca\n");
		
		System.out.println("1 - Añadir libro (por teclado)\n");
		System.out.println("3 - Ver catálogo\n");
		System.out.println("2 - Dar de baja un libro (según su isbn)\n");
		System.out.println("4 - Modificar libro de la biblioteca\n");
		System.out.println("5 - Salir\n");
		System.out.println("Dame una opción:");


		
		
		
	}

}
