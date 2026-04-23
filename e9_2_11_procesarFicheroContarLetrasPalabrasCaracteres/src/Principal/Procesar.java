package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Procesar {
	
private String nombreFichero;
	public Procesar (String nombreFichero)
	{
		this.nombreFichero = nombreFichero;
	
	}
	
	
	public int caracteres() throws IOException
	{
		FileReader entrada = new FileReader(nombreFichero);
		int contador = 0;
		int c;
		while ((c=entrada.read())!=-1)
			if (c!=32 && c!=13 && c!=10) //Si c no es un espacio, codigo CF y codigo CR ni el retorno de linea, se cuenta 
			contador++;
		entrada.close();
		return contador;
	
	}
	
	
	public int lineas() throws IOException
	{
		int lineas = 0;
		String linea;
		FileReader fr = new FileReader(nombreFichero);
		BufferedReader entrada = new BufferedReader(fr);
		
		while ((linea = entrada.readLine())!= null)
			lineas ++;
		
		
		
		entrada.close();
		fr.close();
		return lineas;
	}
	
	
	
	public int palabras() throws IOException
	{
		int palabras = 0;
		FileReader fr = new FileReader(nombreFichero);
		BufferedReader br = new BufferedReader(fr);
		Scanner entrada = new Scanner(br);
		
		while (entrada.hasNext())
		{
			entrada.next();
			palabras++;
		}
		
		entrada.close();
		br.close();
		fr.close();
		
		return palabras;
	}
	
}
