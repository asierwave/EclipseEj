package Michael;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Repositorio almacen = new Repositorio();
		
		Bicicleta b1 = new Bicicleta( "MTB", "Rojo", 5.5f);
		Bicicleta b2 = new Bicicleta( "Urbana", "Azul", 3.0f);
		Bicicleta b3 = new Bicicleta( "MTB", "Negro", 6.0f);
		Bicicleta b4 = new Bicicleta( "Carretera", "Blanco", 8.5f);
		
		Electrica e1 = new Electrica( "Electrica", "Verde", 12.0f, 80, true);
		Electrica e2 = new Electrica( "Electrica", "Rojo", 15.0f, 120, false);
		Electrica e3 = new Electrica( "MTB", "Azul", 10.0f, 60, true);
		
		almacen.alta(b1);
		almacen.alta(b2);
		almacen.alta(b3);
		almacen.alta(b4);
		almacen.alta(e1);
		almacen.alta(e2);
		almacen.alta(e3);
		
		
		
		System.out.println(almacen.consultaByTipo("MTB"));
		
		for(Map.Entry<String, List<Bicicleta>> entradas : almacen.agruparPorTipo().entrySet()) {
			
			System.out.println("Tipo:" + entradas.getKey());
			System.out.println(" Bicicleta:" + entradas.getValue()+"\n");
			
			
		}
		
		
		for(Map.Entry<String, Integer> entradas2 : almacen.contarPorTipo().entrySet()) {
			
			
			System.out.println("Tipo:" + entradas2.getKey());
			System.out.println("cantidad: "+ entradas2.getValue());
		}
		

	}

}
