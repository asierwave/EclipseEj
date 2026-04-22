package Principal;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Repositorio r = new Repositorio ();
		//Polimorfismo con enlace dinámico
		r.alta(new Insecto ("Maya", "Abeja"));
		r.alta(new Insecto ("Willy", "Abeja"));
		r.alta(new Insecto ("Jaime", "Cucaracha"));
		r.alta(new Insecto ("Joaquín", "Hormiga"));
		r.alta(new Coleoptero("Julián", "Escarabajo Pelotero", "Negro"));
		
		HashMap<String,Integer>m = r.contarByEspecie();
		
		
		//Un mapa no se puede recorrer con un for each directamente, hay que utilizar map.entry
		
		for (Map.Entry<String, Integer> item : m.entrySet())
			System.out.println(item.getKey()+ " "+item.getValue());
		
		// Si necesito orden, treeMap, si no hashMap. El orden en el treeMap natural es la clave (K)
		
		
		
		//Lo mismo que el hashmap pero ordenado aquí abajo, pero no admite valores nulos
		TreeMap<String,Integer>t = r.contarByEspecie2();

		
		for (Map.Entry<String, Integer> item : t.entrySet())
			System.out.println(item.getKey()+ " "+item.getValue());
		
		
		r.eliminarDuplicados();
		
		
		
	}
	
		
	

}
