package Principal;

import java.time.LocalDate;

//Clase abstracta no crea objetos Instrumento
public abstract class Instrumento {

	private String marca;
	private String nombre;
	private LocalDate fechaAdquisicion;
	private Profesor p;
	
	
	public Instrumento(String marca, String nombre, LocalDate fechaAdquisicion, Profesor p) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.fechaAdquisicion = fechaAdquisicion;
		this.p = p;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}


	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}


	public Profesor getP() {
		return p;
	}


	public void setP(Profesor p) {
		this.p = p;
	}


	//Metodos abstracto para que se hereden porque los van a tener todas las clases hijas
	public abstract String toString();
	
	
	
	public abstract double calcularCosteMantenimiento();
	
	
	
	
}
