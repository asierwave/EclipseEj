package Principal;

import java.util.Scanner;

public class Catalogo {

		
		private Libro catalogo[];
		private int nLibros;
		
	

		
		public Catalogo (int nMaxLibros) {
			
			catalogo = new Libro[nMaxLibros]; //Creamos vector y reservamos el espacio máximo de titulos (100)
			nLibros= 0;
		}
		
	
		
		
		public boolean alta (Libro l) {
			
			boolean exito = false; //No se puede añadir un libro
			if (nLibros < catalogo.length) {
				
				catalogo[nLibros] = l;
				nLibros++;
				exito = true; //Se puede añadir un libro porque hay espacio, ya que nLibros es menor que el catálogo
				
			}
			return exito;
			
			
		}
		
		
		public boolean alta (Scanner sc)
		{
			boolean exito=false;
			if (nLibros < catalogo.length)
			{
				exito = alta(new Libro(sc));
			}
			return exito;
		}

		
		
		public boolean baja (String isbn) {
			boolean exito = false;
			
			
			for (int i=0;i< nLibros; i++)
				if (isbn.equals(catalogo[i].getIsbn()))
				{
					
					//Esta parte exclusivamente mueve el libro de posición para que no queden huecos vacíos en el vector
					for (int j=i; j<nLibros-1; j++)
						catalogo[j]= catalogo [j+1];
					
					
					
					nLibros --;	
					exito = true;
					break;
				}
			return exito;
			
		}
		
		
		
		
		public boolean baja (Scanner sc)
		
		{
			boolean exito = false;
			String isbn;
			
			System.out.println("Escribe el ISBN del libro a eliminar: ");
			isbn = sc.nextLine();
			
			exito = baja(isbn);
			
			return exito;
			
		}
	
		
		public Libro buscarPorIsbn(String isbn)
		{
			Libro l=null;
			for (int i=0;i<nLibros;i++)
				if (isbn.equals(catalogo[i].getIsbn()))
				{
					l = catalogo[i];
					break;
				}
			return l;
		}
		
		public Libro buscarPorIsbn(Scanner sc)
		{
			String isbn;
			Libro l;
			System.out.println("Introduzca isbn del libro a buscar:");
			isbn = sc.nextLine();
			l = buscarPorIsbn(isbn);
			return l;
		}
		
		
		
		public String toString()
		{
			String resultado="";
			resultado += "LISTADO\n";
			resultado += "=======\n";
			for (int i=0;i<nLibros;i++)
				resultado += catalogo[i]+"\n"; 
			return resultado;
		}




		public int getNumLibros() {
			// TODO Auto-generated method stub
			return nLibros;
		}
		

		public int getnLibros() {
			return nLibros;
		}

		
		public Libro getLibro(int i) {
		    return catalogo[i];
		}



		public void setnLibros(int nLibros) {
			this.nLibros = nLibros;
		}

		
	}

	


	
	

