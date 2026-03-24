package Principal;

import java.util.Objects;

public class Persona {

	
	private String nombre;
	private int edad;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	//Esto es lo que hace que los objetos personas sean similares, apuntan al mismo sitio

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
	//El compareTo debería ser similar al equals


	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
