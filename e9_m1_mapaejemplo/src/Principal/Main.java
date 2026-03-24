package Principal;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> mapa = new HashMap <>();
		
		mapa.put("Rojo", 2); //Insertamos rojo y número de veces que aparece en el mapa
		mapa.put("Azul", 5);
		mapa.put("Verde", 7);
		mapa.put("Azul", 1); //Sobreescibe el valor 5 de "Azul" porque no admite duplicados
		
		//System.out.println(mapa);
		
		for (Map.Entry<String,Integer> item : mapa.entrySet()) //No podemos recorrer un mapa con un forEach como una lista, tenemos que convertirlo en un set de entrada
			// Hay que recorrer un conjunto de entradas 
		{
			System.out.print("La clave es "+item.getKey());
			System.out.println(". El valor es "+item.getValue());
		}
		
		// Así recorremos el mapa de elemento a elemento
		
		
		
	}

}
