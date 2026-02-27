package Intento3;

import java.time.LocalDate;
import java.util.Scanner;

public class Libro {

	private String titulo, autor, isbn, lugar;
	LocalDate fechapubli;
	private int edicion, paginas, ejemplares;

	
	
	public Libro(String titulo, String autor, String isbn, String lugar, LocalDate fechapubli, int edicion, int paginas,
			int ejemplares) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.lugar = lugar;
		this.fechapubli = fechapubli;
		this.edicion = edicion;
		this.paginas = paginas;
		this.ejemplares = ejemplares;
	}
	
	
	public Libro (Scanner sc) {
		
		int anyo;
		int mes;
		int dia;
		
		System.out.println("Dame titulo: ");
		this.titulo = sc.nextLine();
		
		System.out.println("Dame autor: ");
		this.autor = sc.nextLine();
		
		System.out.println("Dame isbn: ");
		this.isbn = sc.nextLine();
		
		System.out.println("Dame edicion:");
		this.edicion = Integer.parseInt(sc.nextLine());
		
		do {
		System.out.println("Dame fecha de publicacion:");
		anyo = Integer.parseInt(sc.nextLine());
		mes = Integer.parseInt(sc.nextLine());
		dia = Integer.parseInt(sc.nextLine());
		
		this.fechapubli = LocalDate.of(anyo, mes, dia);
		
		} while (this.fechapubli == null);
		
		System.out.println("Dame lugar edicion: ");
		this.lugar = sc.nextLine();
		
		System.out.println("Dame paginas:");
		this.paginas = Integer.parseInt(sc.nextLine());

		System.out.println("Dame ejemplares del libro:");
		this.ejemplares = Integer.parseInt(sc.nextLine());
	
	}




	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
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


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public LocalDate getFechapubli() {
		return fechapubli;
	}


	public void setFechapubli(LocalDate fechapubli) {
		this.fechapubli = fechapubli;
	}


	public int getEdicion() {
		return edicion;
	}


	public void setEdicion(int edicion) {
		this.edicion = edicion;
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
	
	
	
	

	@Override
	public String toString() {
		String resultado="Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", lugar=" + lugar + ", fechapubli="
				+ fechapubli + ", edicion=" + edicion + ", paginas=" + paginas + ", ejemplares=" + ejemplares + "]";
		return resultado;
	}
	
	
	
	
	
}
