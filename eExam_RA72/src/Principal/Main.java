package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Repositorio repositorio = new Repositorio();

        // ============================
        // ALTAS DE HERRAMIENTAS
        // ============================

        
        repositorio.alta(new Herramienta("Taladro", 12.5f));
        repositorio.alta(new Herramienta("Sierra", 15.0f));
        repositorio.alta(new Herramienta("Lijadora", 10.0f));
        repositorio.alta(new Herramienta("Taladro", 12.5f));

        repositorio.alta(new Inalambrica("Atornillador", 18.0f, 45, true));
        repositorio.alta(new Inalambrica("Radial", 20.0f, 30, false));
        repositorio.alta(new Inalambrica("Atornillador", 18.0f, 45, true));

        // ============================
        // MOSTRAR TODAS
        // ============================

        System.out.println("=== TODAS LAS HERRAMIENTAS ===");
        System.out.println(repositorio);

        // ============================
        // CONSULTA INALÁMBRICAS
        // ============================

        System.out.println("=== CONSULTA INALÁMBRICAS ===");
        List<Herramienta> inalambricas = repositorio.consultaInalambricas();
        inalambricas.forEach(System.out::println);
        System.out.println();

        // ============================
        // ORDENAR POR CÓDIGO
        // ============================

        System.out.println("=== ORDENADAS POR CÓDIGO ===");
        repositorio.ordenar();
        System.out.println(repositorio);

        // ============================
        // ORDENAR POR PRECIO
        // ============================

//        System.out.println("=== ORDENADAS POR PRECIO ===");
//        repositorio.ordenarByPrecio();
//        System.out.println(repositorio);

        // ============================
        // BAJA POR TIPO
        // ============================

        System.out.println("=== BAJA POR TIPO 'Taladro' ===");
        int eliminadas = repositorio.bajaByTipo("Taladro");
        System.out.println("Herramientas eliminadas: " + eliminadas);
        System.out.println(repositorio);

        // ============================
        // TIPOS DISPONIBLES
        // ============================

        System.out.println("=== TIPOS DISPONIBLES ===");
        Set<String> tipos = repositorio.getTipos();
        System.out.println(tipos);
        System.out.println();

     // ============================
     // CONTAR POR TIPO
     // ============================

     System.out.println("=== CONTAR POR TIPO ===");
     HashMap<String, Integer> mapa = repositorio.contarPorTipo();

     
     
    //Los tooltips de Eclipse sirven mas de lo que parecen...
     for (String k: mapa.keySet()) { //mientras haya claves en el mapa
     
    	 System.out.println(k+"-"+mapa.get(k)); //imprímeme la clave y el valor asociado a ella
    		 
     }
     
     



     System.out.println();


  // ============================
  // AGRUPAR POR TIPO
  // ============================

  System.out.println("=== AGRUPAR POR TIPO ===");
  TreeMap<String, List<Herramienta>> arbol = repositorio.agruparPorTipo();
  // El alumno debe desarrollar la parte de la impresión
  // Mostrando en pantalla con el formato:
  // Tipo 
//         Codigo Precio
  // Por ejemplo: 
  // Taladro
//        1 12.5
//        4 12.5
  // Sierra
//        2 15.0 etc....


  for (String k: arbol.keySet()) {
	 
	 TreeMap<String, List<Herramienta>> arbol2 = new TreeMap<>();
	 
	 arbol2.put(k, arbol2.get(k));
	 
 	 System.out.println(k); 
 	 System.out.println(arbol2);

	  
  }
  
  
    }
}