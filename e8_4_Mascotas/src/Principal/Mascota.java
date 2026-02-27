package Principal;

import java.time.LocalDate;
import java.util.Objects;

public class Mascota {
	
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
	}





	@Override
	protected Mascota clone() {
		// TODO Auto-generated method stub
		
		//Clonamos una mascota creando otra
		Mascota m = new Mascota(this.nombre, this.fechaNacimiento); //Hacemos una nueva mascota con la misma mascota
		return m;
	}





	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}





	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	public Mascota(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
