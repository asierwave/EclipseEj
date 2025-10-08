package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		Persona p1 = new Persona (teclado); //Cuando tenga los datos introducidos en teclado crea la Persona p1, usando la clase Persona
		Persona p2 = new Persona (teclado); 
		
		System.out.println(p1);
		System.out.println(p2);

		
		teclado.close();
		

	}

}
