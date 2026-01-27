package Principal;

import java.util.Scanner;
// La clase empleado representa a los datos de un empleado 
public class Empleado 
{
	private String dni;
	private String nombre;
	private float salario;
	
	// Constructor con parámetros
	public Empleado(String dni, String nombre, float salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
	}

	// Constructor con Scanner
	public Empleado(Scanner sc)
	{
		System.out.println("Introduzca el dni");
		dni = sc.nextLine();
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca salario");
		salario = sc.nextFloat();
		sc.nextLine();
	}
	
	// Métodos getter y setter
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	// Método toString
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	// Método que permite actualizar los datos del empleado
	public void actualizaDatos(Scanner sc)
	{
		String nuevoNombre;
		String nuevoSalario;
		System.out.println("Nombre actual "+nombre);
		System.out.println("Nuevo nombre:");
		nuevoNombre = sc.nextLine();
		if (nuevoNombre.length()!=0)
			nombre = nuevoNombre;
		System.out.println("Salario actual "+salario);
		System.out.println("Nuevo salario:");
		nuevoSalario = sc.nextLine();
		if (nuevoSalario.length()!=0)
			salario = Float.parseFloat(nuevoSalario); 

		System.out.println(this);
	}
}