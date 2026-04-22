package Intento2;

public class Electrica extends Bicicleta {

	private int autonomia;
	private boolean extraible;
	
	
	public Electrica(String tipo, String color, float precioPorHora, int autonomia, boolean extraible) {
		super(tipo, color, precioPorHora);
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
		return super.toString()+ "Electrica [autonomia=" + autonomia + ", extraible=" + extraible + "]";
	}
	
	
	
	
	
	
	
	
}
