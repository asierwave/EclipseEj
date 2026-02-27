package Principal.Modelo;

public class Trabajador {

	private String dni;
	private String nombre;
	private float salarioBase;
	private float salarioFinal;
	
	
	//Clase POJO

	public Trabajador(String dni, String nombre, float salarioBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.salarioFinal = salarioBase;
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}



	public float getSalarioFinal() {
		return salarioFinal;
	}



	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}



	public String getDni() {
		return dni;
	}


	
	public String toString() {
		
		String resultado = "";
		resultado += this.dni+" "+ this.nombre+ " ";
		resultado += this.salarioBase + " "+ this.salarioFinal;
		return resultado;
		
		
	}

	
	
}
