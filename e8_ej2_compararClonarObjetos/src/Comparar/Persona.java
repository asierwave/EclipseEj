package Comparar;

import java.util.Objects;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	
	
	public Persona (String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}

	
	//Aquí se define que es lo que implica que un objeto sea igual a otro, porque si no, compara direcciones y siempre van a ser distintos
	//Cada clase tendrá un equals.
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Cuando se comparen dos objetos del mismo tipo, serán iguales
			return true;
		if (obj == null) //Cuando se comparen dos objetos del mismo tipo pero vacio, serán distintos
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	
	
}
