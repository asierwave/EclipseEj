package Principal;

import java.time.LocalDate;

public class Loro extends Mascota 
{

	private String origen;
	private boolean habla;
	
	
	
	public Loro(String nombre, LocalDate fechaNacimiento, String origen, boolean habla) {
		super(nombre, fechaNacimiento);
		this.origen = origen;
		this.habla = habla;
	}



	public String getOrigen() {
		return origen;
	}



	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public boolean isHabla() {
		return habla;
	}



	public void setHabla(boolean habla) {
		this.habla = habla;
	}



	@Override
	public String toString() {
		return "Loro [origen=" + origen + ", habla=" + habla + "]"+super.toString();
	}
	
	
	
	
	
	

}
