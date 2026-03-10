package Principal;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo{
	
	private int capacidad;
	private boolean adaptado;
	
	
	public Furgoneta(String matricula, String modelo, LocalDate fechaMatricula, Conductor conductor, int capacidad,
			boolean adaptado) {
		super(matricula, modelo, fechaMatricula, conductor);
		this.capacidad = capacidad;
		this.adaptado = adaptado;
	}
	
	
	
	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public boolean isAdaptado() {
		return adaptado;
	}



	public void setAdaptado(boolean adaptado) {
		this.adaptado = adaptado;
	}



	@Override
	public float calcularCosteMantenimiento() {
		float mantenimiento;
		mantenimiento = 70+(this.capacidad * 10);
		mantenimiento += (adaptado = true)?mantenimiento * 0.15f:0;
	
		return mantenimiento;
	}
	public String toString() {
		String respuesta = "";
		respuesta += super.toString();
		respuesta += this.capacidad+" pax. ";
		respuesta += (adaptado == true)?"Adaptado":"No Adaptado";
		respuesta += " ---> "+this.getConductor();
		return respuesta;
	}
}
