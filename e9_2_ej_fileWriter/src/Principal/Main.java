package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// Siempre que creamos un fichero en un disco local o remoto puede haber errores
		// por lo que siempre se recomienda controlar errores en el propio programa o lanzarlo arriba
		FileWriter salida = new FileWriter("fichero.txt");
		salida.write("Hola, Asier. "
				+ "\nSobreescribo el mensaje anterior"); // cada vez que se escribe algo será una acción restructiva con lo que realmente hay
		salida.close();
		
		
		//Ejemplo de lectura de un fichero de texto con su código ASCII
		
		FileReader entrada = new FileReader("fichero.txt");
		int c; //es un entero porque hablamos de códigos ASCII de los carácteres
		char letra;
		while ((c=entrada.read()) != -1) { //y lee caracter a caracter, mientras no se introduzca un ASCII que no exista (todos los negativos)
			letra = (char)c; //convertimos el numero ASCII a caracter y lo guardamos en letra
			System.out.println("He leído: "+ letra+ " con código: "+c); //leemos cada letra del texto que esté en caracter
		
			
			
	
		}	
	}
}
