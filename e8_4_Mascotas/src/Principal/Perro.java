package Principal;

import java.time.LocalDate;

public class Perro extends Mascota {
	
	private String raza; //Añadimos los atributos específicos del perro
	private boolean pulgas;

	
	//Constructor mínimo que necesito
	public Perro(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	
	public Perro(String nombre, LocalDate fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, fechaNacimiento);
		this.raza = raza;
		this.pulgas =pulgas;
	}
	
	
	public String emiteSonido() {
		
	
		return "guau";
	}


	@Override //Sobreescribo el método toString de Mascota (clase padre) añadiendo los atributos de clase pERRO
	public String toString() {
		
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]"+super.toString(); //Llamamos a lo que vuelca el toString de Mascota
	}
	
	
}


