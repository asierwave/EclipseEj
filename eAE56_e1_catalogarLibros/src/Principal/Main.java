package Principal;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Catalogo catalogo = new Catalogo(100);


		//Añadimos libros al catálogo de primeras

		catalogo.alta(new Libro("1984", 1, "George Orwell", "9780451524935",
				"Londres", LocalDate.of(1949, 6, 8), 328, 1));

		catalogo.alta(new Libro("Cien años de soledad", 1, "Gabriel García Márquez", "9780307474728",
				"Buenos Aires", LocalDate.of(1967, 5, 30), 471, 2));

		catalogo.alta(new Libro("Don Quijote de la Mancha", 2, "Miguel de Cervantes", "9788491050297",
				"Madrid", LocalDate.of(1605, 1, 16), 863, 3));

		catalogo.alta(new Libro("El principito", 3, "Antoine de Saint-Exupéry", "9780156012195",
				"París", LocalDate.of(1943, 4, 6), 96, 2));

		catalogo.alta(new Libro("Fahrenheit 451", 1, "Ray Bradbury", "9781451673319",
				"Chicago", LocalDate.of(1953, 10, 19), 249, 4));

		catalogo.alta(new Libro("Crónica de una muerte anunciada", 1, "Gabriel García Márquez", "9788439726436",
				"Bogotá", LocalDate.of(1981, 4, 1), 120, 1));

		catalogo.alta(new Libro("La sombra del viento", 4, "Carlos Ruiz Zafón", "9788408172173",
				"Barcelona", LocalDate.of(2001, 4, 12), 565, 8));

		catalogo.alta(new Libro("El código Da Vinci", 5, "Dan Brown", "9780307474278",
				"Nueva York", LocalDate.of(2003, 3, 18), 689, 1));

		catalogo.alta(new Libro("Los juegos del hambre", 4, "Suzanne Collins", "9780439023528",
				"Nueva York", LocalDate.of(2008, 9, 14), 374, 12));

		catalogo.alta(new Libro("Harry Potter y la piedra filosofal", 3, "J.K. Rowling", "9780747532699",
				"Londres", LocalDate.of(1997, 6, 26), 223, 15));

		catalogo.alta(new Libro("Harry Potter y la cámara secreta", 1, "J.K. Rowling", "9780747538493",
				"Londres", LocalDate.of(1998, 7, 2), 251, 1));

		catalogo.alta(new Libro("Harry Potter y el prisionero de Azkaban", 2, "J.K. Rowling", "9780747542155",
				"Londres", LocalDate.of(1999, 7, 8), 317, 13));

		catalogo.alta(new Libro("El Hobbit", 3, "J.R.R. Tolkien", "9780547928227",
				"Londres", LocalDate.of(1937, 9, 21), 310, 6));

		catalogo.alta(new Libro("El señor de los anillos", 3, "J.R.R. Tolkien", "9780618640157",
				"Londres", LocalDate.of(1954, 7, 29), 1178, 4));

		catalogo.alta(new Libro("Dune", 2, "Frank Herbert", "9780441172719",
				"Filadelfia", LocalDate.of(1965, 8, 1), 688, 7));

		catalogo.alta(new Libro("Neuromante", 4, "William Gibson", "9780441569595",
				"Nueva York", LocalDate.of(1984, 7, 1), 271, 5));

		catalogo.alta(new Libro("Fundación", 2, "Isaac Asimov", "9780553293357",
				"Nueva York", LocalDate.of(1951, 6, 1), 255, 6));

		catalogo.alta(new Libro("Yo, robot", 1, "Isaac Asimov", "9780553382563",
				"Nueva York", LocalDate.of(1950, 12, 2), 224, 8));

		catalogo.alta(new Libro("El nombre de la rosa", 1, "Umberto Eco", "9780156001311",
				"Milán", LocalDate.of(1980, 9, 1), 512, 5));

		catalogo.alta(new Libro("La carretera", 1, "Cormac McCarthy", "9780307387899",
				"Nueva York", LocalDate.of(2006, 9, 26), 287, 4));

		catalogo.alta(new Libro("Ensayo sobre la ceguera", 3, "José Saramago", "9780156007757",
				"Lisboa", LocalDate.of(1995, 10, 1), 352, 6));

		catalogo.alta(new Libro("Rayuela", 3, "Julio Cortázar", "9788439723947",
				"Buenos Aires", LocalDate.of(1963, 6, 28), 736, 3));

		catalogo.alta(new Libro("El túnel", 3, "Ernesto Sabato", "9788432225073",
				"Buenos Aires", LocalDate.of(1948, 1, 1), 160, 5));

		catalogo.alta(new Libro("Rebelión en la granja", 3, "George Orwell", "9780451526342",
				"Londres", LocalDate.of(1945, 8, 17), 112, 9));

		catalogo.alta(new Libro("El alquimista", 2, "Paulo Coelho", "9780062315007",
				"Río de Janeiro", LocalDate.of(1988, 4, 15), 208, 10));

		catalogo.alta(new Libro("El perfume", 4, "Patrick Süskind", "9780375725845",
				"Múnich", LocalDate.of(1985, 9, 1), 255, 6));

		catalogo.alta(new Libro("Drácula", 4, "Bram Stoker", "9780486411095",
				"Londres", LocalDate.of(1897, 5, 26), 418, 4));

		catalogo.alta(new Libro("Frankenstein", 4, "Mary Shelley", "9780486282114",
				"Londres", LocalDate.of(1818, 1, 1), 280, 6));

		catalogo.alta(new Libro("La metamorfosis", 3, "Franz Kafka", "9780805210576",
				"Praga", LocalDate.of(1915, 10, 1), 201, 7));

		catalogo.alta(new Libro("El retrato de Dorian Gray", 2, "Oscar Wilde", "9780141439570",
				"Londres", LocalDate.of(1890, 7, 1), 254, 5));



		int opcion;
		String titulo; //variable para poder modificarlo mas abajo en la funcion editTitulo
		boolean exito;
		Libro l;
		do
		{
			opcion = menu(sc);
			switch (opcion)
			{
			case 1:
				exito = catalogo.alta(sc);
				if (exito==false)
					System.out.println("El repositorio está lleno");
				else
					System.out.println("Alta realizada con éxito");
				break;
			case 2:
				exito = catalogo.baja(sc);
				if (exito==false)
					System.out.println("El conductor no existe");
				else
					System.out.println("Baja realizada con éxito");
				break;
			case 3:
				l = catalogo.buscarPorIsbn(sc);
				if (l==null)
					System.out.println("Ese libro no está en el catálogo");
				else
					System.out.println(l);
				break;
			case 4:
				l = catalogo.buscarPorIsbn(sc);
				if (l==null)
					System.out.println("El libro no está en el catálogo");
				else
				{
					System.out.println(l);
					System.out.println("¿Que título le quieres poner?");
					titulo = sc.nextLine();
					l.setTitulo(titulo);
					System.out.println(l);
				}
				break;
			case 5: 
				System.out.println(catalogo);
				break;

			case 6:
				Catalogo listaOrdenada = filtrarPorMenosDe2EjemplaresPorOrdenAlfabetico(catalogo);

				//Mostramos la lista ordenada alfabeticamente de libros con menos de 2 ejemplares
				System.out.println(listaOrdenada);
				
			break;
			
			case 7:
				
				System.out.println("\nGracias por utilizar este servicio!");

				
			}
			
			
		} while (opcion!=7);

		sc.close();

	}

	
	
	public static int menu(Scanner sc)
	{
		int opcion;
		do
		{
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1 - Añadir libro al catálogo");
			System.out.println("2 - Dar de baja un libro del catálogo");
			System.out.println("3 - Consulta de libros por ISBN");
			System.out.println("4 - Modificación de título de libros");
			System.out.println("5 - Listado de libros del catálogo");
			System.out.println("6 - Mostrar Libros con Max 2 ejemplares alfabéticamente");
			System.out.println("7 - Salir");
			System.out.println("Opción:");
			try
			{
				opcion = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				opcion = 0;
			}
			sc.nextLine();
			if (opcion<1 || opcion>7)
				System.out.println("Opción incorrecta");
		} while (opcion<1 || opcion>7);
		return opcion;
	}




	public static Catalogo filtrarPorMenosDe2EjemplaresPorOrdenAlfabetico (Catalogo catalogo) {

		//Creamos las listas que vamos a utilizar para el método, con el mismo espacio que el catálogo, por si acaso
		Catalogo listaFiltrada = new Catalogo(100); 
		Catalogo listaOrdenada= new Catalogo (100);


		//////Primera parte: FILTRADO


		// Esta primera parte copia de catálogo todos los libros con menos de 2 ejemplares

		for(int i=0 ; i <catalogo.getnLibros(); i++) { // bucle que manda los libros que cumplen la condición de ejemplares a la lista ordenada

			Libro libroAux = catalogo.getLibro(i);

			if(libroAux.getEjemplares()<=2) {

				listaFiltrada.alta(libroAux); //Lo asignamos a la lista ordenada 1

			}

		}

		//Mostramos la lista de libros con como máximo 2 ejemplares, aún sin ordenar
		System.out.println(listaFiltrada);



		///////Segunda parte: ORDENAMIENTO


		//Inicializamos el libro en primeraPosicion para poder usarlo en el bucle de comparación
		Libro primeraPosicion = null;
		//Inicializamos la comparación 
		int comparacion = 0;

		//inicializamos la bandera que da fin al bucle de ordenamiento while
		boolean ordenCompleto=false;


		//Mientras el ordenamiento no esté finalizado se repetirá
		while (ordenCompleto == false)
		{

			//System.out.println(listaFiltrada.getnLibros()); // Vueltas que quedan del bucle

			primeraPosicion =listaFiltrada.getLibro(listaFiltrada.getNumLibros()-1); //Para inicializar,suponemos que el libro en primeraPosicion es el último de la lista 


			//Este bucle for compara todas las posiciones de la lista filtrada de libros con max.2 ejemplares con el que estuviese en primeraPosicion. 
			//Ese primeraPosicion va cambiando a medida que se compara con los libros de la lista 
			// y da como resultado final la el libro en primeraPosicion alfabética de todos los de la lista
			
			
			for (int j=0; j<listaFiltrada.getNumLibros(); j++) {

				comparacion =(listaFiltrada.getLibro(j).getTitulo().toUpperCase()).compareTo(primeraPosicion.getTitulo().toUpperCase());


				if (comparacion < 0) {
					primeraPosicion = listaFiltrada.getLibro(j); //cambiamos la variable primeraPosicion por el libro que comparativamente lo es
				}

			}

			////////



			//Añadimos el libro primeraPosicion de la lista a la lista auxiliar que vamos a mostrar después ordenada
			listaOrdenada.alta(primeraPosicion);
			//System.out.println(primeraPosicion);	

			//A medida que vayamos añadiendo, se retiran de la lista original para que no entren de nuevo en la comparación y podamos sacar todos en orden alfabético
			listaFiltrada.baja(primeraPosicion.getIsbn()); //En el método baja ya restamos un libro, asi que no hace falta volverlo a restar con un --



			//Cuando hemos retirado todos los libros de la lista original, significa que los tenemos todos ordenados en la auxiliar que vamos a mostrar
			if (listaFiltrada.getnLibros()==0) {
				ordenCompleto = true;
			}

		}	

		//Devolvemos la lista filtrada y ordenada alfabéticamente
		return listaOrdenada;

	}

}