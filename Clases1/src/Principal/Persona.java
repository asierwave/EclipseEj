package Principal;

import java.util.Scanner;

public class Persona {

	// Atributos		
	private String nombre;
	private int edad; //Para una base de datos lo común es guardar la fecha de nacimiento en vez de la edad para que no haya problemas y tener mas información y luego poder calcular la edad correctamente en cualquier momento
	
	
	//Métodos
		
	
	//Método constructor que recibe como argumento la cadena de caracteres que representa su nombre y el número entero que representa la edad
	public Persona (String nombre, int edad) { //Esto no son los atributos, son canales por los que se introduce la información a los atributos

		
		//Asignamos a los atributos esos argumentos
		this.nombre = nombre; //con this. antes del canal de información, se asigna el canal al atributo del mismo nombre
		this.edad = edad;

		
	}
	
	
	public Persona (String nombre) { //Se permite tener otro método constructor igual y del mismo nombre pero porque los canales no son ni el mismo número ni son los mismos.
		this.nombre = nombre;
		this.edad = -1; //Edad absurda, una marca para indicar que no se conoce la edad en este caso
	}
	
	public Persona () {
		this.nombre = "No name";
		this.edad = -1;
	}
	
	
	public Persona (Scanner teclado) {
		System.out.println ("Introduzca el nombre");
		this.nombre = teclado.nextLine(); //nextLine considera que el intro como separador si no, sería teclado.next() que utilizaría el espacio como separador
		System.out.println ( "Introduzca la edad ");
		this.edad = teclado.nextInt(); //Esto a la hora de introducir informacion por teclado es un problema porque se queda el intro en le buffer y si se crea otra persona después se va a asignar ese intro al campo nombre, en este caso
		teclado.nextLine(); //Se utiliza esta instrucción para saltar el intro que sobre cuando guarda el entero el teclado
	
		// Esto mismo pasa con variables int, float, double... con nextLine
	}
	
	
	public void saludar () {
		System.out.println ("Hola me llamo " +this.nombre+" y tengo "+this.edad);
	
}
	
}




