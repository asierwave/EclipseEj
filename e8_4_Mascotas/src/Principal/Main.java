package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		//GRUPO DE MASCOTAS
		
		Mascota[] m = new Mascota[10]; //Creamos array de mascotas para almacenarlas
		
		int n = 2; //Creamos la longitud total de un vector
		m[0]= new Perro ("Jaime", LocalDate.now(), "Pastor Alemán", true); //Creamos mascota en las posiciones del array
		m[1]= new Loro ("Perico", LocalDate.now(), "Hispanoamericano", false); //Otra clase de mascota en la posición 1 del array
		
		
		//Imprimimos el array y sus posiciones según el método toString() 
		for (int i=0; i<n; i++)
			System.out.println(m[i]);
		
		
		
		/////
		
		Mascota m3 = new Mascota("Piedad", LocalDate.now());
		
		Mascota p1 = new Perro("Piedad", LocalDate.now(), "Pincher", true); //Podemos crear un Perro que sea una mascota porque perro es clase hija de Mascota
		
		
		System.out.println(m3);
		
		
		//POLIMORFISMO
		System.out.println(p1); //Imprimirá el toString de la clase hija Perro
	}

}
