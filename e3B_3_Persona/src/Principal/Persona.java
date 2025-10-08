package Principal;

import java.util.Scanner;

public class Persona {
	
	//Las clases son las entidades que utilizamos en Bases de datos, solo que nosotros los usamos para crear programas, no bases !
	// Atributos información que va a representar a la persona, normalmente en privado
	
	private String dni; 
	private String nombre; 
	private String apellido1, apellido2;
	private int edad; //No es correcto, lo correcto es poner la fecha de nacimiento
	
	
	
	//Métodos (relaciones en base de datos)
	
	public Persona(String dni, String nombre, String apellido1, String apellido2, int edad) {
		super(); //Está relacionada con la palabra this, que se refiere al objeto con el que estamos trabajando sería como poner
		//Persona.dni aquí abajo... Super es herencia, llama a la clase de la que depende, en este caso el constructor padre del que se nutren todos los constructores que construyas.
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
	}
	
	
	public Persona (Scanner teclado) { //Ya no podría crear un constructor que reciba un Scanner, porque ya lo hecho, no puede haber métodos iguales
	
		System.out.println ("Introduzca el dni");
		this.dni = teclado.nextLine(); //Hace salto de línea y no queda nada en el buffer del teclado
		System.out.println("Introduzca el nombre");
		this.nombre = teclado.nextLine();
		System.out.println("Introduzca el primer apellido");
		this.apellido1 = teclado.nextLine();
		System.out.println("Introduzca el segundo apellido");
		this.apellido2 = teclado.nextLine();
		System.out.println("Introduzca la edad");
		this.edad = teclado.nextInt(); //Aquí como no hay nextLine se queda el intro en el buffer y lo pilla como valor
		teclado.nextLine(); //Con esto evitamos que el intro se quede en el buffer
	
	}


	//@Override
	//public String toString() {
	//	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
	//			+ ", edad=" + edad + "]";
	//}
	
	
	public String toString() {
		String mayoriaEdad;
		mayoriaEdad = (edad >= 18) ? " es mayor de edad" : " es menor de edad";
		return nombre +" "+apellido1+" "+apellido2+" con DNI "+dni+mayoriaEdad;
	}
	
	
	
	

}
