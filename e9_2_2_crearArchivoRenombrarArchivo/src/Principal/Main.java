package Principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException { //lanzamos la excepción de sleep para el main

		Scanner sc = new Scanner (System.in);
		File datos = new File ("datos.txt");
		File informacion = new File ("informacion.txt");
		int op; 
		
		
		do {
			
			System.out.println("\nElige una opción: ");
			System.out.println("1- Crea archivo datos.txt ");
			System.out.println("2- Reenombra datos.txt a informacion.txt");
			System.out.println("3- Elimina el archivo informacion.txt");
			op = Integer.parseInt(sc.nextLine());

			switch (op) {
			
			case 1: 
				if (datos.exists()) {
					System.out.println("El archivo ya está creado y esta es su ruta: ");
					System.out.println(datos.getAbsolutePath());
				} else 
				{
					try {
						if(datos.createNewFile()) {
							System.out.println("Se ha creado correctamente el archivo datos.txt");
						} else
							System.out.println("No se ha podido crear el archivo datos.txt");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			break;
			case 2:
				
				if (!datos.exists()) 
					System.out.println("El archivo datos.txt no existe");
				
				 else 
				{
						if(datos.renameTo(informacion)) 
							System.out.println("Se ha cambiado correctamente el archivo de nombre a informacion.txt");
				}
				
				Thread.sleep(3000); // esto es para esperar 3 segundos y que se elimine el fichero informacion.txt

			case 3:
				
				if (!informacion.exists()) {
					System.out.println("El archivo informacion.txt no existe");
				} else 
				{
					if(informacion.delete()) 
						System.out.println("Se ha eliminado correctamente el archivo informacion.txt");
					 else
						System.out.println("No se ha podido eliminar el archivo informacion.txt");
				}
				
			break;
			
				}
	
		} while (op !=0);
		
		}
	}


