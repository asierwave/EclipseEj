package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio  {

	private List<Bicicleta> lista;
	
	

	public Repositorio(List<Bicicleta> lista) {
		super();
		this.lista = new ArrayList<>();
	}
	
	
	public boolean alta (Bicicleta b) {
		boolean exito = false;
		
		if (lista.add(b))
			exito = true;
		
		return exito;
	}
	
	public boolean baja (Bicicleta b) {
		
		for (Bicicleta be: lista) 
			if (be.equals(b)) 
				return lista.remove(be);
		
		return false;
	}
	
	
	public void ordenar() {
		
		Collections.sort(lista);
		//lista.sort(null);
		//También se puede así

	}
	
	public void ordenarInverso() {
		
		lista.sort(null);
		Collections.reverse(lista);
		
		//Collections.reverse(lista,Comparator.reverseOrder());
		//También se puede así
	}
	
	
	
	
	public void ordenarByPrecio() {
  lista.sort(Comparator.comparing(Bicicleta::getAlquilerHora));
	}
	
	
	
	
	public int bajaByColor(String color) {

	    Iterator<Bicicleta> it = lista.iterator();
	    int contador = 0;

	    while (it.hasNext()) {
	        Bicicleta b = it.next();

	        if (b.getColor().equalsIgnoreCase(color)) {
	            it.remove();
	            contador++;
	        }
	    }

	    return contador;
	}
	
	
	
	
	
	public Set<String> consultaByTipo(String tipo) {
		
		Set<String> conjuntoColores = new HashSet<>();
		
		for (Bicicleta b: lista) {
			if (b.getTipo().equals(tipo))
			conjuntoColores.add(b.getColor());
		}
		
		return conjuntoColores;	
		
	}
	
	
	
	
	public HashMap<String,Integer> contarPorTipo() {
		HashMap<String,Integer> mapa = new HashMap<>();
		
		for (Bicicleta b: lista) {
			mapa.put(b.getTipo(), mapa.getOrDefault(b.getTipo(), 0)+1);
			
		}
		return mapa;	
		
	}
	
	
	@Override
	public String toString() {
		String mensaje = "Repositorio de bicicletas";
	for (Bicicleta b: lista) {
		mensaje += "\n"+b.toString();
	}
	
	return mensaje;		
	}


	public TreeMap <String, List<Bicicleta>> agruparPorTipo() {
	TreeMap<String, List<Bicicleta>> mapa = new TreeMap<>();
		
		for (Bicicleta b: lista) {
			mapa.putIfAbsent(b.getTipo(), new ArrayList<>());
			mapa.get(b.getTipo()).add(b);
		}
		
		return mapa;
	}
	
	

		
	

	



	
	
}
