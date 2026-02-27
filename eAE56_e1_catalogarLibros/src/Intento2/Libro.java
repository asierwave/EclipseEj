package Intento2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Libro {
	
		

		private String titulo, edicion, autor, isbn, impresion;
		private LocalDate publicacion;
		private int paginas, ejemplares;
	
	public Libro (String titulo, String edicion, String autor, String isbn, String impresion, LocalDate publicacion, int paginas, int ejemplares )  {
		
		this.titulo = titulo;
		this.edicion = edicion;
		this.autor = autor;
		this.isbn = isbn;
		this.impresion = impresion;
		this.publicacion = publicacion;
		this.paginas = paginas;
		this.ejemplares = ejemplares;
		
	}
	
	
	@Override
	public String toString() {
		String resultado = "Libro: " + titulo;
		resultado +="\n Edicion:" + edicion;
		resultado +="\n Autor: " + autor;
		resultado +="\n isbn: " + isbn;
		resultado +="\n lugar de impresión: " + impresion;
		resultado +="\n fecha de publicación: " + publicacion;
		resultado +="\n paginas: " + paginas;
		resultado +="\n ejemplares: " + ejemplares;




		return resultado;
	}


	public Libro (Scanner sc) {
		int anyo;
		int mes;
		int dia;
		
		System.out.println("Introduce un título: ");
		this.titulo = sc.nextLine();
		System.out.println("Introduce la edición: ");
		this.edicion = sc.nextLine();		
		System.out.println("Introduce autor: ");
		this.autor = sc.nextLine();		
		System.out.println("Introduce un isbn: ");
		this.isbn = sc.nextLine();		
		System.out.println("Introduce un lugar de impresión: ");
		this.impresion = sc.nextLine();
		System.out.println("Introduce el momento de publicacion: ");

		do {
		try {
		anyo = Integer.parseInt(sc.nextLine());
		mes = Integer.parseInt(sc.nextLine());
		dia = Integer.parseInt(sc.nextLine());
		this.publicacion = LocalDate.of(anyo, mes, dia);
		
		} catch (DateTimeException e) {
			System.out.println("Introduce la fecha en formato AAAA-MM-DD");
		
		} catch (NumberFormatException e) {
			System.out.println("Introduce la fecha de nuevo, por favor");
		
		}
		} while (this.publicacion == null);
		
		System.out.println("Introduce paginas: ");
		this.paginas = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce ejemplares: ");
		this.ejemplares = Integer.parseInt(sc.nextLine());;
		
	}
	
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getImpresion() {
		return impresion;
	}

	public void setImpresion(String impresion) {
		this.impresion = impresion;
	}

	public LocalDate getFecha() {
		return publicacion;
	}

	public void setFecha(LocalDate fecha) {
		this.publicacion = fecha;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	
	
	
	
	
	
	
}
