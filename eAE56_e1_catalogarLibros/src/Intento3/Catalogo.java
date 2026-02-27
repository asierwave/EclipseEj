package Intento3;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {

	private Libro catalogo[];
	private int nLibros;
	
	
	public Catalogo(int nMaxLibros) {
		
		catalogo = new Libro[nMaxLibros];
		this.nLibros = nLibros;
	}
		
	
	public boolean alta (Libro l) {
		
		boolean exito = false;
		
		for (int i=0; i<nLibros; i++) {
			if (nLibros < catalogo.length) {
				catalogo[i] = l;
				exito = true;
				nLibros++;
			}
			
		}
		
		return exito;
		
		
	}
	
	

	public boolean alta (Scanner sc) {
		boolean exito = false;
		
			if (nLibros < catalogo.length) {
				alta(new Libro(sc));
				nLibros++;
			}
			
		
		
		return exito;
		
		
	}
	
	
	public boolean baja (String isbn) {
		boolean exito = false;
		
		for (int i=0; i<nLibros; i++) {
			
			if (isbn.equals(catalogo[i])) {
				
				
				for (int j=1; j<nLibros-1; j++) {
					catalogo [j]= catalogo[j+1];
					
				}
				
				
				
				exito = true;
				nLibros--;
			}
			
			
		}
		return exito;
		
		
	}
	
	
	public boolean baja (Scanner sc) {
	
		boolean exito = false;
		
		String isbn;
		
		System.out.println("Dame el isbn para localizar le libro a dar de baja:");
		isbn = sc.nextLine();
		
		
		if(baja(isbn)) {
			exito = true;
		}
		
		
		return exito;
	}


	@Override
	public String toString() {
		
		String resultado = "Biblioteca\n";
		
		for (int i=0; i<nLibros; i++)
		resultado+= catalogo[i];
		
		return resultado;
	}
	
	
	
	
	
	
	
	
}



