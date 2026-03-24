package Principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// diccionario es sinónimo de mapa en JAVA
		
		Scanner sc = new Scanner (System.in);
		String op;
		int opn;
		
		////CREAMOS MAPAS
		Map <String,Float> productoPrecioMapa = new HashMap<>();
		Map <String, Integer> productoCestaMapa = new HashMap<>();
		
	////INTRODUCIMOS VALORES PREDEFINIDOS STOCK
		productoPrecioMapa.put("Avena", (float)2.21);
		productoPrecioMapa.put("Garbanzos", (float)2.39);
		productoPrecioMapa.put("Tomate", (float)1.59);
		productoPrecioMapa.put("Jengibre", (float)3.13);
		productoPrecioMapa.put("Quinoa", (float)4.50);
		productoPrecioMapa.put("Guisantes", (float)1.60);
	
		
		
	////MENU
		do
		{
			System.out.println("Añade producto (Avena, Garbanzos, Tomate, Jengibre, Quinoa, Guisantes) y unidades de producto a la cesta: (Escribe 'fin' para acabar)");
			op = sc.nextLine().toLowerCase(); //evitamos tener en cuenta mayus
			
			if (!"fin".equals(op)) {
			System.out.println("Dame numero");
			opn = Integer.parseInt(sc.nextLine());
			sc.nextLine();
			
			

			
			switch (op) {
			
			case "avena": productoCestaMapa.put("Avena", opn);
			break;
			case "garbanzos": productoCestaMapa.put("Garbanzos", opn);

			break;
			case "tomate": productoCestaMapa.put("Tomate", opn);
			break;
			case "jengibre": productoCestaMapa.put("Jengibre", opn);
			break;
			case "quinoa": productoCestaMapa.put("Quinoa", opn);
			break;
			case "guisantes": productoCestaMapa.put("Guisantes", opn);
			break;
			
			default: System.out.println("No existe ese producto en el inventario. Elige otro.");
			break;
			}
			
			}
			
			
			
		} while (!"fin".equals(op));

		System.out.println("Tu lista de la compra: ");
		
				
		
		for (Map.Entry<String, Integer> item : productoCestaMapa.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());		
	}
		
		System.out.println("Gracias por utilizar el servicio");

	}

}
