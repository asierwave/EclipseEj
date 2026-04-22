package CorregidoIA;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // ✔️ Crear repositorio
        Repositorio repo = new Repositorio();

        // ✔️ Crear herramientas
        Herramienta h1 = new Herramienta("taladro", 10);
        Herramienta h2 = new Herramienta("martillo", 5);
        Herramienta h3 = new Herramienta("taladro", 12);

        // ✔️ Crear herramientas inalámbricas
        Inalambrica i1 = new Inalambrica("taladro", 15, 120, true);
        Inalambrica i2 = new Inalambrica("sierra", 20, 90, false);

        // ✔️ Alta de herramientas
        repo.alta(h1);
        repo.alta(h2);
        repo.alta(h3);
        repo.alta(i1);
        repo.alta(i2);

        System.out.println("=== REPOSITORIO ORIGINAL ===");
        System.out.println(repo);

        // ✔️ Ordenar
        repo.ordenar();
        System.out.println("\n=== REPOSITORIO ORDENADO ===");
        System.out.println(repo);

        // ✔️ Consulta inalámbricas
        System.out.println("\n=== HERRAMIENTAS INALÁMBRICAS ===");
        List<Herramienta> inalambricas = repo.consultaInalambricas();
        for (Herramienta h : inalambricas) {
            System.out.println(h);
        }

        // ✔️ Tipos distintos
        System.out.println("\n=== TIPOS DE HERRAMIENTAS ===");
        Set<String> tipos = repo.getTipos();
        for (String t : tipos) {
            System.out.println(t);
        }

        // ✔️ Contar por tipo
        System.out.println("\n=== CONTAR POR TIPO ===");
        Map<String, Integer> conteo = repo.contarPorTipo();
        for (String tipo : conteo.keySet()) {
            System.out.println(tipo + ": " + conteo.get(tipo));
        }

        // ✔️ Agrupar por tipo
        System.out.println("\n=== AGRUPAR POR TIPO ===");
        TreeMap<String, List<Herramienta>> agrupado = repo.agruparPorTipo();

        for (String tipo : agrupado.keySet()) {
            System.out.println("Tipo: " + tipo);
            for (Herramienta h : agrupado.get(tipo)) {
                System.out.println("   " + h);
            }
        }

        // ✔️ Baja por tipo
        System.out.println("\n=== BAJA POR TIPO (taladro) ===");
        int eliminadas = repo.bajaByTipo("taladro");
        System.out.println("Eliminadas: " + eliminadas);

        System.out.println("\n=== REPOSITORIO FINAL ===");
        System.out.println(repo);
    }
}