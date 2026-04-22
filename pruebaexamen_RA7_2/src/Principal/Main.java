package Principal;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		Repositorio repo = new Repositorio(null);
		
		repo.alta(new Electrica ("Veloz", "Roja", (float) 3.75 ,125, true));


		repo.alta(new Bicicleta ("Lenta", "Azul", (float) 2.75));
		repo.alta(new Electrica ("Jaim", "Azul", (float) 4.75 ,155, false));

		repo.alta(new Bicicleta ("Mara", "Gris", (float) 1.75));
		repo.alta(new Electrica ("Mara", "Verde", (float) 4.75 ,155, false));

		
		System.out.println(repo.toString());
		
		System.out.println("\nHemos dado de baja "+repo.bajaByColor("Azul")+" bicicletas de color Azul");

		
		System.out.println("\n"+repo.toString());

		System.out.println("\nLos colores que quedan de tipo Mara son: "+repo.consultaByTipo("Mara"));
		
		System.out.println("\nEstos son el número de bicicletas por tipo: "+repo.contarPorTipo());
		
		System.out.println("\nEstas son las bicicletas restantes agrupadas por tipo: ");
		
		for (Map.Entry<String, List<Bicicleta>> item : repo.agruparPorTipo().entrySet())
		{
		    System.out.println(item.getKey() + " " + item.getValue());
		}
		
		
		
		
		
		
		
	}

}
