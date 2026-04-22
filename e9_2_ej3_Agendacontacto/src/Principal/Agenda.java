package Principal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private List <Contacto> lista;
	
	
	public Agenda() {
		lista = new ArrayList<>();
	}
	
	
	public boolean alta (Contacto c) {
		return lista.add(c);
	}
	
	
	
	//Persistencia de datos
	
	//Guardamos en fichero txt
	
	public void guardar () throws IOException {
		//Recuerda que hay tres capas siempre caracter, linea, etc...
		FileWriter fw = new FileWriter("Agenda.txt");
		PrintWriter salida = new PrintWriter(fw); //Sobre la anterior capa de escritura
		
		//salida.println(lista); //Como system.out pero en este caso la salida será el documento donde escribamos
		
		for (Contacto c: lista) {
			
			salida.println(c.getNombre());
			salida.println(c.getTelefono());
			salida.println(c.getEdad());
			salida.println(c.getSalario());
		
		}
		
		//Lo mismo que guardamos en un txt, podríamos guardarlo en un CSV definiendo cual es el separador , o ;
		
		salida.close();
		fw.close(); // cerrar siempre el proceso para no desbordar la memoria
		
		
		
	}
	
	
	//Recuperamos, leemos el fichero txt que hemos guardaddo (Recuperamos)
	
	public void recuperar() throws IOException {
		
		FileReader fr = new FileReader("Agenda.txt");
		Scanner entrada = new Scanner(fr);
		
		Contacto c;
		while (entrada.hasNextLine())
			
		{
			c = new Contacto();
			c.setNombre(entrada.nextLine());
			c.setTelefono(entrada.nextLine());
			c.setEdad(Integer.parseInt(entrada.nextLine()));
			c.setSalario(Double.parseDouble(entrada.nextLine()));
			lista.add(c); //Añadimos los contactos en el programa cuando llamamos a este método (al principio del main)
		}
		entrada.close();
		fr.close();
	}
	
	
	
	
	
	public String toString() {
		String resultado = "";
		resultado += "AGENDA DE CONTACTOS\n";
		resultado += "===================\n";
		for (Contacto c: lista) 
			resultado += c+"\n";
		return resultado;
	}
	
	
	
}
