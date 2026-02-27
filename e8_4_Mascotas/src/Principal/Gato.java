package Principal;

import java.time.LocalDate;

public class Gato extends Mascota {
	
	private boolean peloLargo;
	private String color;
	
	
	public Gato(String nombre, LocalDate fechaNacimiento, boolean peloLargo, String color) {
		super(nombre, fechaNacimiento);
		this.peloLargo = peloLargo;
		this.color = color;
	}

	//Los getters y setters de atributos especificos de clases hijas en cada clase hija

	
	
	public boolean isPeloLargo() {
		return peloLargo;
	}


	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Gato [peloLargo=" + peloLargo + ", color=" + color + "]"+super.toString();
	}
	
	
	
	
	

}
