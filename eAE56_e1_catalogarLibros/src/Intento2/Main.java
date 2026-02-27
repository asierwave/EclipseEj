package Intento2;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalogo catalogo1 = new Catalogo(100);
		int op = 0;
		Scanner sc = new Scanner(System.in);

		do {

			op = menu(sc);

			switch (op) {

			case 1:

				catalogo1.alta(new Libro("titulo1", "autor1", "edicion1", "isbn", "Madrid", LocalDate.of(2024, 03, 23),234, 2));
				break;

			case 2:
				if (catalogo1.alta(sc)) {
					System.out.println("Has dado de alta correctamente un libro");
				} else
					System.out.println("No hay espacio para añadir mas libros");

				break;

			case 3:
				
				if (catalogo1.getnLibros() >0)
				System.out.println(catalogo1);
				else 
				System.out.println("No hay ningún libro en el catálogo aún");
					
				break;
				
			case 4: 
				if (catalogo1.baja(sc)) {
					System.out.println("Has dado de baja correctamente el libro");
				} else
					System.out.println("No se ha podido eliminar el libro");
				break;

				
			case 5:
				
				if (catalogo1.modificar(sc)) {
					System.out.println("Has modificado correctamente el libro");
				} else
					System.out.println("No se ha modificado el libro");
				break;
			
			
			case 6:
				System.out.println("Gracias por usar el menú");

			}
		} while (op != 6);

	}
	
	

	public static int menu(Scanner sc) {

		int op;

		System.out.println("Elige opción: ");
		System.out.println("1 - Añadir libro (aleatorio)");
		System.out.println("2 - Añadir libro por teclado");
		System.out.println("3 - Mostrar el catálogo");
		System.out.println("4 - Dar de baja un libro por isbn");
		System.out.println("5 - Modificar un libro por isbn");
		System.out.println("6 - Salir");

		try {
			op = sc.nextInt();

		} catch (InputMismatchException e) {
			op = 0;
		}

		if (op < 1 || op > 6) {
			System.out.println("Opcion incorrecta");
		}
		sc.nextLine();

		return op;

	}

}
