package Michael;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio {
	
	List<Bicicleta> lista = new ArrayList<>();
	
	
	public boolean alta(Bicicleta b) {
		
		return lista.add(b);
	}
	
	public boolean baja(Bicicleta b) {
		
		return lista.remove(b);
	}
	
	public void ordenar() {
		
		lista.sort(null);
	}
	
	public void orderByPrecio() {
		
		lista.sort(new Comparator<Bicicleta>() {

			@Override
			public int compare(Bicicleta o1, Bicicleta o2) {
				// TODO Auto-generated method stub
				return Float.compare(o1.getPrecio(), o2.getPrecio());
			}});
	}
	
	public int bajaByColor(String color) {
		
		int contador=0;
		ListIterator it = lista.listIterator();
		
		Bicicleta b;
		
		while(it.hasNext()) {
			
			b=(Bicicleta) it.next();
			
			if(b.getColor().equals(color)) {
				it.remove();
				contador++;
			}
		}
		
		return contador;
	}
	
	
	public List<Bicicleta> consultaByTipo(String Tipo){
		
		List<Bicicleta> consulta = new ArrayList<>();
		
		for(Bicicleta b : lista) {
			
			if(b.getTipo().equals(Tipo)) {
				consulta.add(b);
			}
		}
		
		return consulta;

	}
	
	public Set<String> getColores(){
		
		Set<String> colores = new HashSet<>();
		
		for(Bicicleta b : lista) {
			
			colores.add(b.getColor());
		}
		
		return colores;
 
	}
	
	public HashMap<String,Integer> contarPorTipo() {
		
		HashMap<String,Integer> mapa = new HashMap<>();
		
		for(Bicicleta b : lista) {
			
			mapa.put(b.getTipo(), mapa.getOrDefault(b.getTipo(), 0)+1);
		}
		
		return mapa;
	}
	
	
	public TreeMap<String,List<Bicicleta>> agruparPorTipo(){
		
		TreeMap<String,List<Bicicleta>> mapa = new TreeMap<>();
		
		for(Bicicleta b : lista) {
			
			if(!mapa.containsKey(b.getTipo())) {
				
				mapa.put(b.getTipo(), new ArrayList<Bicicleta>());
			}
			
			mapa.get(b.getTipo()).add(b);
		}
		
		return mapa;
	}
	
	
	


	@Override
	public String toString() {
		String resultado ="";
		
		for(Bicicleta b : lista) {
			
			resultado += b.toString()+"\n";
		}
		
		return "Repositorio [lista=" + resultado + "]";
	}
	
	

}
