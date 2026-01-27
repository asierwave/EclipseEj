package Principal;

import java.util.Scanner;

public class Empleado 
{
	private String dni;
	private String nombre;
	private float salario;
	
	public Empleado(String dni, String nombre, float salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
	}

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

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
}
