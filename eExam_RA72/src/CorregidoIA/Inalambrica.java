package CorregidoIA;

public class Inalambrica extends Herramienta {

    private int autonomia;
    private boolean extraible;

    // ⚠️ Cambiado Float → float (coherente con la clase padre)
    public Inalambrica(String tipo, float precioAlquiler, int autonomia, boolean extraible) {
        super(tipo, precioAlquiler);
        this.autonomia = autonomia;
        this.extraible = extraible;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isExtraible() {
        return extraible;
    }

    public void setExtraible(boolean extraible) {
        this.extraible = extraible;
    }

    @Override
    public String toString() {
        // ✔️ Reutiliza el toString del padre + info extra
        return super.toString() +
               " con autonomia de " + autonomia +
               " minutos y batería " +
               (extraible ? "extraible" : "no extraible");
    }
}