package Intento2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio {

	List<Bicicleta> repo = new ArrayList<>();

	public boolean alta (Bicicleta b) {
		
		return repo.add(b);
		
	}
	
	public boolean baja (Bicicleta b) {
		
		return repo.remove(b);
	
	}
	
	
	public void ordenar () {
		repo.sort(null);
	}
	
	
	public String toString() {
		
		String salida= "Lista de Bicicletas\n";
		
		for (Bicicleta b: repo) {
			
			salida += b.toString();
			
			
		}
		
		return salida;
		
	}
	
	
	
//	public void ordenarByPrecio() {
//		
//		repo.sort(Comparator.comparing(getPrecioPorHora()));
//		
//		
//	}

	
	public int bajaByColor(String color) {
		
		ListIterator it = repo.listIterator();
		int contador = 0;
		
		while(it.hasNext()) {
			
			Bicicleta b= (Bicicleta)it.next();
			
			if (b.getColor() == color) {
			contador++;
			it.remove();
			
			}
			
		}
		return contador;
		
	}

	
	
	public List<Bicicleta> consultaByTipo(String tipo) {
		
		List<Bicicleta> listaTipo = new ArrayList<>();
		
		for (Bicicleta b : repo) {
			
			if (b.getTipo().equals(tipo)) {
				listaTipo.add(b);
			}
			
			
		}
		
		
		return listaTipo;
	
	}

	
	
	public Set<String> getColores() {
		
		Set<String> conjunto = new HashSet<>();
		
		for (Bicicleta b: repo) {
			conjunto.add(b.getColor());
			
		}
		
		return conjunto;
		
		
	}
	
	
	public HashMap<String,Integer> contarPorTipo() {
		
		HashMap<String, Integer> mapa = new HashMap<>();
		
		for (Bicicleta b: repo) {
			
			mapa.put(b.getTipo(), mapa.getOrDefault(b.getTipo(), 0)+1);
			
		}
		
		return mapa;
		
	}
	
	
	
	public TreeMap<String, List<Bicicleta>> agruparPorTipo() {
		
		TreeMap <String, List<Bicicleta>> mapa2 = new TreeMap<>();
		
		
		for (Bicicleta b: repo) {
			
			mapa2.put(b.getTipo(), new ArrayList<Bicicleta>());
			
		}
		
		
		return mapa2;
		
	}
	
	
	
	
	
}
