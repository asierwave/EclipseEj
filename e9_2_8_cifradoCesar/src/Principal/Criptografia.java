package Principal;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Criptografia {

	
	private int clave;
	
	public Criptografia (int clave) 
	{
		this.clave = clave;
		
	}
	
	
	public void encriptar (String nombreFichero) throws IOException 
	{
	
		FileReader entrada = new FileReader(nombreFichero+".txt");
		FileWriter salida = new FileWriter (nombreFichero + "_crypt.txt"); //salida de fichero encriptado
		int c;
		char letra;
		
		while ((c = entrada.read()) != -1)
				{
			letra = (char)(c+clave);
			salida.write(letra);
				}
		entrada.close();
		salida.close();
	}
	
	
	
	public void desencriptar (String nombreFichero) throws IOException 
	{
	
		FileReader entrada = new FileReader(nombreFichero+"_crypt.txt");
		FileWriter salida = new FileWriter (nombreFichero + ".txt"); //salida de fichero encriptado
		int c;
		char letra;
		
		while ((c = entrada.read()) != -1)
				{
			letra = (char)(c-clave);
			salida.write(letra);
				}
		entrada.close();
		salida.close();
	}
	
	
	
	
}
