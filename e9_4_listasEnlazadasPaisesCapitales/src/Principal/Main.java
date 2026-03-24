package Principal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/* 
 * Desarrolle un programa que maneje dos listas enlazadas (LinkedList). En la primera
 * debe incorporar un conjunto de países, por ejemplo Japón, Sudáfrica, Canadá, Brasil,
 * Australia, Argentina, India y Dinamarca. Y en la segunda sus capitales, por ejemplo
 * Tokio, Pretoria, Ottawa, Brasilia, Camberra, Buenos Aires, Nueva Delhi y Copenhague.
 * A continuación, el programa debe insertar los elementos de la lista de capitales en la
 * lista de países, de manera que cada país estará seguido de su capital. La lista final de
 * los países, siguiendo con el ejemplo, tendría que quedar así: Japón, Tokio, Sudáfrica,
 * Pretoria, Canadá, Ottawa, Brasil, Brasilia, Australia, Camberra, Argentina, Buenos
 * Aires, India, Nueva Delhi, Dinamarca, Copenhague. Finalmente solicite al usuario que
 * introduzca una letra y elimine de la lista final de países (en la que ahora también hay
 * capitales) todos aquellos y aquellas cuyo nombre comiencen por dicha letra. Utilice
 * una versión sin iteradores y otra con ellos para observar las ventajas de estos últimos.
*/

public class Main 
{
	public static void main(String[] args) 
	{
		String paises[] = {"Japón", "Sudáfrica", "Canadá", "Brasil",
				"Australia", "Argentina", "India" ,"Dinamarca"};
		
		String capitales[] = {"Tokio", "Pretoria", "Ottawa", "Brasilia",
				"Camberra", "Buenos Aires", "Nueva Delhi","Copenhague"};
		
		List<Entidad> listaPaises = new LinkedList<>();
		List<Entidad> listaCapitales = new LinkedList<>();
		
		for (String nombre : paises)
			listaPaises.add(new Entidad(nombre));
		
		for (String nombre : capitales)
			listaCapitales.add(new Entidad(nombre));
		
		System.out.println(listaPaises);
		System.out.println(listaCapitales);
		
		ListIterator litP = listaPaises.listIterator();
		ListIterator litC = listaCapitales.listIterator();
		
		while (litP.hasNext()) // Mientras quedan Paises
		{
			litP.next(); // Avanzo un país
			litP.add(litC.next()); // Añado una capital
			litC.remove(); // Elimino una capital
		}
		
		System.out.println(listaPaises);
		System.out.println(listaCapitales);
	}
}
