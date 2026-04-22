package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio {

	
	private List<Insecto> lista;
	
	public Repositorio() 
	{
		lista = new ArrayList<>();
	}
	
	public boolean alta(Insecto i) 
	{
		return lista.add(i);
	}
	
	public boolean baja(Insecto i) 
	{
		return lista.remove(i);
	}
	
	
	public int eliminarByEspecie(String especie) 
	{
		int contador = 0; //Contador de insectos por especie
		
		Iterator<Insecto>it = lista.iterator();//copia para recorrer, solo se utiliza una vez
		Insecto i;
		while (it.hasNext()) //mientras haya siguiente insecto en el iterator
		{
			i = it.next();
			if (especie.equals(i.getEspecie())) {
				it.remove(); //en el que estoy
				contador++;
			}
		}
		return contador;
	}
	
	
	
	public HashMap<String,Integer> contarByEspecie()
	{
		HashMap<String,Integer> mapa = new HashMap<>();
			
		for (Insecto i : lista) //Para cada insecto i de la lista
			mapa.put(i.getEspecie(), mapa.getOrDefault(i.getEspecie(),0)+1);
		
		return mapa;
	}
	
	public TreeMap<String,Integer> contarByEspecie2()
	{
		TreeMap<String,Integer> mapa = new TreeMap<>();
			
		for (Insecto i : lista) //Para cada insecto i de la lista
			mapa.put(i.getEspecie(), mapa.getOrDefault(i.getEspecie(),0)+1);
		
		return mapa;
	}
	
	
	//En Conjuntos no puede haber duplicados HashSet o TreeSet (ordenados o no)
	public void eliminarDuplicados()
	{
		Set<Insecto> conjunto = new HashSet<>();
		
		//Metemos todos los insectos de la lista en el conjunto para eliminar los repetidos
		conjunto.addAll(lista);
		//Limpiamos la lista, la borramos
		lista.clear();
		//Volcamos el conjunto sin duplicados en la lista
		lista.addAll(conjunto);

		
		//No se puede meter en el conjunto (set) lo que hay en una lista de otro tipo (balones a insectos)
	}
	
	
	
}
