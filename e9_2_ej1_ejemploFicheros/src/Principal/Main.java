package Principal;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File fichero = new File ("Fichero.txt"); //Creamos un primer fichero
		//con la clase File pero no me lo crea de verdad, crea la referencia, para ello habrá que hacer boolean createNewFile()
		
		//¿Cómo saber si el fichero existe?
		
		if (fichero.exists())
		{
			System.out.println("Ruta: "+fichero.getAbsolutePath());
			System.out.println("Nombre: "+fichero.getName());
			System.out.println("Tamaño: "+fichero.length());
		}
		else
		{
			System.out.println("El fichero no existe");
			}
		
		//No está creando carpeta, para crear carpeta realmente tendría que ser mkdir()
		
		File carpeta = new File ("//Users//asier//Documents//GitHub//EclipseEj//e9_2_ej1_ejemploFicheros//");
		if (carpeta.exists())
		{
			System.out.println("Ruta: "+carpeta.getAbsolutePath());
			System.out.println("Tamaño: "+carpeta.length());
			File vector[]=carpeta.listFiles();
			for (File item:vector) {
				System.out.println(item.getName());
				if (item.isDirectory())
					System.out.println("Es una carpeta");
				else
					System.out.println("Es un fichero");
			}
		}
		else 
			System.out.println("No existe esta carpeta");
		
	}

}
