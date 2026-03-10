package Principal;

import java.time.LocalDate;

public class Camion extends Vehiculo{
	
	private float volumen;
	private float peso;
	
	
	public Camion(String matricula, String modelo, LocalDate fechaMatricula, Conductor conductor, float volumen,
			float peso) {
		super(matricula, modelo, fechaMatricula, conductor);
		this.volumen = volumen;
		this.peso = peso;
	}
	
	
	
	
	public float getVolumen() {
		return volumen;
	}




	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}




	public float getPeso() {
		return peso;
	}




	public void setPeso(float peso) {
		this.peso = peso;
	}




	@Override
	public float calcularCosteMantenimiento() {
		float mantenimiento;
		mantenimiento = 100+(this.peso * 0.05f)+(this.volumen * 0.01f);
		return mantenimiento;
	}

	
	
	public String toString() {
		String respuesta = "";
		respuesta += super.toString();
		respuesta += this.volumen+" litros. "+this.peso+" kg. ---> "+this.getConductor();
		return respuesta;
	}




}
