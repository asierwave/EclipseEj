package Principal;

import java.time.LocalTime;
import java.util.Scanner;

public class Trabajador {
	
	private String dni;
	private String nombre;
	private float salarioBase;
	private float salarioFinal;
	private float complemento;
	
	
	
	
	public Trabajador(String dni, String nombre, float salarioBase, float salarioFinal, float complemento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.salarioFinal = salarioFinal;
		this.complemento = complemento;
	}

	
	
	public Trabajador(Scanner sc) 
	{
		
		System.out.println("introduce un dni: ");
		this.dni=sc.nextLine();
		System.out.println("introduce nombre: ");
		this.nombre=sc.nextLine();
		System.out.println("introduce el salario base: ");
		this.salarioBase=sc.nextFloat();
		this.salarioFinal = salarioBase;
		this.complemento = complemento;
	}



	public float getComplemento() {
		return complemento;
	}




	public void setComplemento(float complemento) {
		this.complemento = complemento;
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




	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", nombre=" + nombre + ", salarioBase=" + salarioBase + ", salarioFinal="
				+ salarioFinal + "complemento: "+complemento+"]";
	}
	
	
	
	

}
