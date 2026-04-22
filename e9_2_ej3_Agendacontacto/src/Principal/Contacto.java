package Principal;

public class Contacto {

	private String nombre;
	private String telefono;
	private int edad;
	private double salario;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Contacto() {
		super();
	}

	
	public String toString() 
	{
		String resultado = "";
		resultado += this.nombre+" "+ this.telefono + " "+this.edad+" "+this.salario+"€";
		return resultado;
	}
	
	
	
}
