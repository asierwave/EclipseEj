package CorregidoIA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;

public class Repositorio {

    // ✔️ Encapsulación correcta
    private List<Herramienta> repo = new ArrayList<>();

    public boolean alta(Herramienta h) {
        return repo.add(h);
    }

    public boolean baja(Herramienta h) {
        return repo.remove(h);
    }

    public void ordenar() {
        // ✔️ Orden natural (por código según compareTo)
        repo.sort(null);
    }

    public void ordenarPorPrecio() {

        // ✔️ Orden alternativo usando Comparator
        repo.sort((h1, h2) ->
            Float.compare(h1.getPrecioAlquiler(), h2.getPrecioAlquiler())
        );

        // ✔️ Alternativa más profesional:
        // repo.sort(Comparator.comparing(Herramienta::getPrecioAlquiler));
    }

    @Override
    public String toString() {

        // ✔️ StringBuilder es más eficiente que concatenar String
        StringBuilder sb = new StringBuilder();

        for (Herramienta h : repo) {
            sb.append("\n").append(h);
        }

        return sb.toString();
    }

    public int bajaByTipo(String tipo) {

        ListIterator<Herramienta> it = repo.listIterator();
        int contador = 0;

        while (it.hasNext()) {

            Herramienta h = it.next();

            if (h.getTipo().equals(tipo)) {
                contador++;
                it.remove(); // ✔️ eliminación segura con iterator
            }
        }

        return contador;
    }

    public List<Herramienta> consultaInalambricas() {

        List<Herramienta> lista = new ArrayList<>();

        for (Herramienta h : repo) {

            // ❌ ERROR QUE TENÍAS: comparar clases con String
            // ✔️ CORRECTO: usar instanceof
            if (h instanceof Inalambrica) {
                lista.add(h);
            }
        }

        return lista;
    }

    public Set<String> getTipos() {

        Set<String> tipos = new HashSet<>();

        for (Herramienta h : repo) {
            tipos.add(h.getTipo());
        }

        return tipos;
    }

    public HashMap<String, Integer> contarPorTipo() {

        HashMap<String, Integer> mapa = new HashMap<>();

        for (Herramienta h : repo) {

            mapa.put(
                h.getTipo(),
                mapa.getOrDefault(h.getTipo(), 0) + 1
            );
        }

        return mapa;
    }

    public TreeMap<String, List<Herramienta>> agruparPorTipo() {

        TreeMap<String, List<Herramienta>> mapa = new TreeMap<>();

        for (Herramienta h : repo) {

            // ✔️ crear lista si no existe
            if (!mapa.containsKey(h.getTipo())) {
                mapa.put(h.getTipo(), new ArrayList<>());
            }

            mapa.get(h.getTipo()).add(h);
        }

        return mapa;
    }
}