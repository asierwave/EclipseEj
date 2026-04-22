package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio {

	List <Herramienta> repo = new ArrayList<>();
	
	public boolean alta(Herramienta h) {
		
		return repo.add(h);
		
	}
	
	
	public boolean baja(Herramienta h) {
		
		return repo.remove(h);
		
	}
	
	
	public void ordenar() {
		
		repo.sort(null);
		
	}
	
	
	
	public String toString() {
		
		String resultado="";
		for (Herramienta h: repo) {
			
			resultado +="\n"+h.toString();
		
		}
		
		return resultado;
		
	}
	
	
	
	public int bajaByTipo(String tipo) {
		
		ListIterator it = repo.listIterator();
		int contador = 0;
		
		while (it.hasNext()) {
			
			Herramienta h = (Herramienta) it.next();			
			
			if (h.getTipo().equals(tipo)) {
				contador++;
				it.remove();
			}
		
			
		}
		
		return contador;

	}

	
	public List<Herramienta> consultaInalambricas(){
		
		List<Herramienta> listaInalambricas = new ArrayList<>();
		
		
		for (Herramienta h: repo) {
			
			if (h.getClass().toString().equals("class Principal.Inalambrica"))
			listaInalambricas.add(h);
			
		}
		
		
		return listaInalambricas;
		
	}
	
	
	
	public Set<String> getTipos() {
		
		Set<String> conjunto = new HashSet<>();
		
		for (Herramienta h: repo) {
			
			conjunto.add(h.getTipo());
			
		}
		
		return conjunto;
		
	}
	
	
	
	public HashMap<String, Integer> contarPorTipo() {
		
		
		HashMap<String,Integer> mapa = new HashMap<>();
		
		for (Herramienta h: repo) {
			
			mapa.put(h.getTipo(), mapa.getOrDefault(h.getTipo(), 0)+1);
			
		}
		
		return mapa;
		
		
	}
	
	
	
	public TreeMap<String,List<Herramienta>> agruparPorTipo() {
		
		TreeMap<String,List<Herramienta>> arbol = new TreeMap<>();
		
		
		for (Herramienta h: repo) {
			
			arbol.put(h.getTipo(), new ArrayList<Herramienta>());
			
		}
		
		return arbol;
		
		
		
		
	}
	
	
	
}
