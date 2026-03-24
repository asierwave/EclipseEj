package Principal;

import java.time.LocalDate;

public abstract class Vehiculo {
	
	private String matricula;
	private String modelo;
	private LocalDate fechaMatricula;
	private Conductor conductor;
	
	public Vehiculo(String matricula, String modelo, LocalDate fechaMatricula, Conductor conductor) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.fechaMatricula = fechaMatricula;
		this.conductor = conductor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public abstract float calcularCosteMantenimiento();
	
	public String toString() {
		String respuesta = "";
		respuesta += this.matricula+" - "+this.modelo+" "+String.format("%02d", fechaMatricula.getDayOfMonth()) +"/";
		respuesta += String.format("%02d", fechaMatricula.getMonthValue()) +"/";
		respuesta += String.format("%04d", fechaMatricula.getYear())+" - ";
		return respuesta;
	}
	
	

}
