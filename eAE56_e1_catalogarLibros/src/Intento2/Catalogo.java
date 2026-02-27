package Intento2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Catalogo {

	private static int nLibros=0;
	private Libro catalogo[];
	
	
	public Catalogo (int nMaxLibros){
		this.nLibros = nLibros;
		catalogo = new Libro [nMaxLibros];
	}
	
	
	
	public boolean alta (Libro l) {
		boolean exito = false;
		
			
			if (nLibros < catalogo.length) {
		
				catalogo[nLibros]= l;
				nLibros++;
				return true;
			
		}
		return exito;	
	}

	
	public boolean alta (Scanner sc) {
		boolean exito = false;
		
				
			if (nLibros < catalogo.length) 
				exito = alta(new Libro(sc));
				
			
		return exito;	
	}
	
	public boolean modificar(Scanner sc) {

	    Libro l = null;
	    boolean exito = false;

	    // 🔎 Buscar libro por ISBN
	    do {
	        System.out.println("Dame un ISBN para buscar el libro a modificar:");
	        String isbnBuscar = sc.nextLine();

	        for (int i = 0; i < nLibros; i++) {
	            if (catalogo[i].getIsbn().equals(isbnBuscar)) {
	                l = catalogo[i];
	                break;
	            }
	        }

	        if (l == null) {
	            System.out.println("ISBN no encontrado.");
	        }

	    } while (l == null);

	    // ✏ Modificación de campos

	    System.out.println("Introduce un título (ENTER para mantener): ");
	    String entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        l.setTitulo(entrada);
	        exito = true;
	    }

	    System.out.println("Introduce la edición (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        l.setEdicion(entrada);
	        exito = true;
	    }

	    System.out.println("Introduce autor (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        l.setAutor(entrada);
	        exito = true;
	    }

	    System.out.println("Introduce nuevo ISBN (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        l.setIsbn(entrada);
	        exito = true;
	    }

	    System.out.println("Introduce lugar de impresión (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        l.setImpresion(entrada);
	        exito = true;
	    }

	    System.out.println("Introduce nueva fecha (año, mes, día) o ENTER para mantener:");

	    String anyoStr = sc.nextLine();

	    if (!anyoStr.isEmpty()) {
	        try {
	            int anyo = Integer.parseInt(anyoStr);
	            int mes = Integer.parseInt(sc.nextLine());
	            int dia = Integer.parseInt(sc.nextLine());

	            LocalDate nuevaFecha = LocalDate.of(anyo, mes, dia);
	            l.setFecha(nuevaFecha);
	            exito = true;

	        } catch (NumberFormatException | DateTimeException e) {
	            System.out.println("Fecha no válida. Se mantiene la anterior.");
	        }
	    }

	    // 📄 Páginas
	    System.out.println("Introduce páginas (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        try {
	            l.setPaginas(Integer.parseInt(entrada));
	            exito = true;
	        } catch (NumberFormatException e) {
	            System.out.println("Número no válido.");
	        }
	    }

	    // 📚 Ejemplares
	    System.out.println("Introduce ejemplares (ENTER para mantener): ");
	    entrada = sc.nextLine();
	    if (!entrada.isEmpty()) {
	        try {
	            l.setEjemplares(Integer.parseInt(entrada));
	            exito = true;
	        } catch (NumberFormatException e) {
	            System.out.println("Número no válido.");
	        }
	    }

	    return exito;
	}



	public boolean baja(Scanner sc) {
		// TODO Auto-generated method stub
		boolean exito=false;
		System.out.println("Dame un isbn para buscar libro a elimniar: ");
		String isbn = sc.nextLine();
		
		if(baja(isbn))
			exito = true;
		
		return exito;
	

	}

	
	public boolean baja (String isbn) {
		boolean exito = false;
		
		
	for (int i=0; i<nLibros; i++) {
			
			if (catalogo[i].getIsbn().equals(isbn)) 	
				exito = true;	
			
			
		

			
			for (int j=i; j<nLibros-1; j++)
				catalogo[j]= catalogo[j+1];
	
			
			nLibros--;
			
	}
		
		return exito;
		
	}
	
	@Override
	public String toString() {
		String resultado;
		
		resultado ="Listado de libros" + nLibros + "Libros";
		
		for (int i=0; i<nLibros; i++)
		resultado+= "\n"+catalogo[i];
		
		return resultado;
	}



	public int getnLibros() {
		// TODO Auto-generated method stub
		this.nLibros= nLibros;
		return nLibros;
	}

	
	
	
	
}
