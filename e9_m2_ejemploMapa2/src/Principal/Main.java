package Principal;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
/**
 * Una pequeña tienda de barrio le ha solicitado desarrollar un programa sencillo para
 * vender su mercancía. En esta primera versión del programa se tendrán en cuenta los
 * productos que se indican en la tabla junto con su precio. Los productos se venden en bote, 
 * brick, etc. Cuando se realiza la compra, hay que indicar el producto y el número de
 * unidades que se compran, por ejemplo “guisantes” si se quiere comprar un bote de
 * guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. La compra se
 * termina con la palabra “fin. Suponemos que el usuario no va a intentar comprar un
 * producto que no existe. Utiliza un diccionario para almacenar los nombres y precios de los
 * productos y una o varias listas para almacenar la compra que realiza el usuario.
 * Avena Garbanzos Tomate Jengibre Quinoa Guisantes
 * 2,21    2,39     1,59   3,13     4,50    1,60
 */


	public static void main(String[] args) {
		
		
		String texto = "En un lugar de la Mancha donde Mancha " + "el lugar no hay lugar con más Mancha";
		Map<String,Integer> mapa = new HashMap<>();
		
		String tokens []= texto.split("\\s+"); // también puede ser el espacio sin expresión regular " "
		
		/////////
		//Versión 1 del bucle
		
	/*	for (String palabra : tokens)
		{
			if (mapa.get(palabra)==null)
			mapa.put(palabra, 1);
			else {
				int aux = mapa.get(palabra); 
				mapa.put(palabra,aux+1); // si en el bucle en la frase ya se ha guardado la palabra, se suma 1 por cada vez que aparece
				
			}
		} 
		
		*
		*		System.out.println(mapa);
*/
		
		//Versión 2 del bucle
		
		for (String palabra : tokens)
		{
			mapa.put(palabra, mapa.getOrDefault(palabra, 0)+1); //getOrDefault(palabra, 0) +1 detecta si no está la clave antes, parte de 0 y suma 1 si no suma 1 al contador anterior 
		}
		
		for (Map.Entry<String, Integer> item : mapa.entrySet())
			System.out.print(item.getKey()+" "+item.getValue());
		
		
		///////
		
	}

}
