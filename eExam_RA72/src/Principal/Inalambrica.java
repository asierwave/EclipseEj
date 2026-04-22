package Principal;

public class Inalambrica extends Herramienta {
	private int autonomia;
	private boolean extraible;
	
	
	public Inalambrica(String tipo, Float precioAlquiler, int autonomia, boolean extraible) {
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
		return super.toString()+" con autonomia de " + autonomia + " minutos y batería " + (extraible? "extraible":"no extraible");
	}
	
	
	
	
	
	
	
}
