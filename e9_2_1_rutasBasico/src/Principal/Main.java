package Principal;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ruta;
		
		int contadorDirectorio = 0;
		int contadorFichero = 0;
		
		System.out.println("Dame la ruta de un directorio existente y te digo su info:");
		ruta = sc.nextLine();
		
		File archivo = new File (ruta);

		
		if (archivo.exists()) {
			System.out.println("Es una ruta válida");
			if (archivo.isDirectory())
			{
				File vector[]=archivo.listFiles();
	
				
				for (File item : vector)
				{
					System.out.println(item.getName());
					if (item.isDirectory()) {
						System.out.print(" - es directorio");
						contadorDirectorio++;
					}
					else 
						System.out.println(" - es fichero");
					contadorFichero++;

				}
				System.out.println("\nHay un total de "+contadorDirectorio+" directorios y "
						+ contadorFichero+" ficheros en la ruta proporcionada");
				
			}
			
		}
		
		
	}

}
