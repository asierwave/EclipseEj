package Principal;

import java.time.LocalDate;
import java.util.Scanner;

public class Libro {

	private String titulo;
	private int edicion;
	private String autor;
	private String isbn;
	private String lugarImpresion;
	private LocalDate fechaPublicacion;
	private int paginas;
	private int ejemplares;
	
	
	public Libro(String titulo, int edicion, String autor, String isbn, String lugarImpresion, LocalDate fechaPublicacion,
			int paginas, int ejemplares) {
		super();
		this.titulo = titulo;
		this.edicion = edicion;
		this.autor = autor;
		this.isbn = isbn;
		this.lugarImpresion = lugarImpresion;
		this.fechaPublicacion = fechaPublicacion;
		this.paginas = paginas;
		this.ejemplares = ejemplares;
	}


	public Libro(Scanner sc) {
		// TODO Auto-generated constructor stub
		
		String fechaPublicacionTxt;
		
		System.out.println("Introduzca título del libro");
		this.titulo = sc.nextLine();
		
		System.out.println("Intoduzca la edición del libro (en número)");
		this.edicion = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime el autor del libro: ");
		this.autor = sc.nextLine();
		System.out.println("Escribe el ISBN del libro: ");
		this.isbn = sc.nextLine();
		System.out.println("Escribe el lugar de impresión del libro");
		this.lugarImpresion = sc.nextLine();
		System.out.println("Escribe la fecha de publicación de la edición: ");
		fechaPublicacionTxt= sc.nextLine();
		this.fechaPublicacion = LocalDate.parse(fechaPublicacionTxt);
		System.out.println("Escibr el número de páginas de la edición: ");
		this.paginas= sc.nextInt();
		System.out.println("Escribe el número de ejemplares que quieres dar de alta de esta edición: ");
		this.ejemplares= sc.nextInt();
		
		
		//Para pillar la fecha bien
		
//		System.out.println("Fecha (dd/mm/aaaa)");
//		String tokens [] = sc.nextLine().split("/"); //Divido la cadena con el carácter split, la expresión regular que divide es /
//		this.fechaPublicacion = LocalDate.of(
//				Integer.parseInt(tokens[2]),
//				Integer.parseInt(tokens[1]),
//				Integer.parseInt(tokens[0])
//				);
				
	}
	
	
	public void modificarCampos(Scanner sc) {
		
		String cadena;
		int numero;
		System.out.println("Titulo: "+titulo);
		cadena = sc.nextLine();
		if (cadena.length()> 0)
			this.titulo= cadena;
		
		System.out.println("Edicion: "+edicion);
		cadena = sc.nextLine();
		if (cadena.length()> 0)
			this.edicion= Integer.parseInt(cadena);
		
		System.out.println("L.Impresión: "+lugarImpresion);
		cadena = sc.nextLine();
		if (cadena.length()> 0)
			this.lugarImpresion= cadena;
		
		System.out.println("Fecha: "+fechaPublicacion);
		cadena = sc.nextLine();
		if (cadena.length()> 0)
		{
			String tokens[] = cadena.split("/");
			this.fechaPublicacion=LocalDate.of(
					Integer.parseInt(tokens[2]),
		Integer.parseInt(tokens[1]),
		Integer.parseInt(tokens[0]));
		}
			
		//Se puede añadir el resto...
		
		
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getEdicion() {
		return edicion;
	}


	public void setEdicion(int edicion) {
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


	public String getLugarImpresion() {
		return lugarImpresion;
	}


	public void setLugarImpresion(String lugarImpresion) {
		this.lugarImpresion = lugarImpresion;
	}


	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}


	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
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
	
	
	
	public String toString() {
		String resultado = "";
		resultado += "Título: "+titulo;
		resultado += " ISBN: "+isbn;
		resultado += " Autor: "+autor;
		resultado += " Edicion: "+edicion+"ªva";
		resultado += " Núm. Páginas: "+paginas;
		resultado += " Ejemplares: "+ejemplares;
		resultado += " Fecha de Publicación: "+fechaPublicacion;
		resultado += " Impresión: "+lugarImpresion;




		return resultado;
		}
	
	
}
