package CorregidoIA;

import java.util.Objects;

public class Herramienta implements Comparable<Herramienta> {

    private static int secuencia = 1;
    private int codigo;
    private String tipo;
    private float precioAlquiler;

    public Herramienta(String tipo, float precioAlquiler) {
        this.codigo = secuencia++; // ✔️ Código autoincremental
        this.tipo = tipo;
        this.precioAlquiler = precioAlquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Herramienta " + codigo + ", de tipo " + tipo +
               " y precio por día de " + precioAlquiler + "€";
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo); // ✔️ Identidad única por código
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        // ✔️ instanceof permite herencia (mejor que getClass)
        if (!(obj instanceof Herramienta)) return false;

        Herramienta other = (Herramienta) obj;
        return codigo == other.codigo;
    }

    @Override
    public int compareTo(Herramienta o) {

        // ❌ ERROR QUE TENÍAS: ordenar por precio (NO es orden natural)
        // ✔️ CORRECTO: el orden natural es por código

        return Integer.compare(this.codigo, o.codigo);
    }
}