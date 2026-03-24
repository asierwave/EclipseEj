package Principal;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List <Integer> lista = new ArrayList<>();
		//ArrayList<Integer> lista = new ArrayList<Integer>();
		
		
		//Guardar un valor entero en la lista de enteros
		
		lista.add(8);
		lista.add(14);
		lista.remove(new Integer(14)); //Habría que apuntar al índice
		
		
		//Estos dos for siguientes hacen lo mismo
		
		for (int i=0; i<lista.size(); i++) //Se recorre con lista.size en vez de lista.length
			System.out.println(lista.get(i)+" ");
		
		
		for (Integer elemento : lista ) {
			System.out.println(elemento+" ");
			
			//Tipo de lista, en este caso int, Integer, podría ser un vector de instrumentos... y otros objetos
			//A este bucle se le designa como forEach, para cada elemento de la lista de Integer, no es un bucle for each ordinario
			
		}
		
		//lista.add(o) -> Añadir
		//lista.remove (o) -> eliminar
		//Estos dos tienen first y last para añadir o eliminar el último o el primero y son boolean
	
		
		//lista.size -> tamaño de la lista (número de elementos)
		//lista.clear, elimina todos los elementos de la lista
		//lista.contains(o)-> te dice si el objeto está dentro de la lista
		//y otros...
		
		System.out.println();
		System.out.println(lista);
	}

}
