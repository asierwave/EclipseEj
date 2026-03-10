package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Academia academia = new Academia("B-987654","Artes Sonoras");

		//Creamos instrumentos
		
		Instrumento piano1 = new Piano ("YAMAHA", "Yamaha C3", LocalDate.of(2018, 4, 12),new Profesor("Laura Gómez"), 88, true); 
		Instrumento guitarra1 = new Guitarra ("Fender", "Fender Stratocaster", LocalDate.of(2020, 9, 5),new Profesor("Pedro Martín"), 6, true);
		Instrumento tambor1 = new Tambor ("Pearl", "Pearl Export", LocalDate.of(2019, 11, 18),new Profesor("Ana Torres"), 45.0F);

	
		
		
		//Añadimos instrumentos a academia
		academia.alta(piano1);
		academia.alta(guitarra1);
		academia.alta(tambor1);
		
	
		System.out.println(academia);
		
		//Imprimimos costes de mantenimiento

		System.out.println(academia.imprimirCoste());
		
		
		//Imprimimos qué instrumentos necesitan revisión
		
		//Todos se tienen que revisar porque todos llevan mas de los años especificados en cada clase sin revisar
		//Si por ejemplo el piano introducido se pone como fecha adquisicion en 2025, no se tiene que revisar porque han pasado menos de 3 años. Comprobado
		System.out.println(academia.imprimirRevision());
		
	}

}
