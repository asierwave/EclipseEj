package Principal;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		Persona p1 = new Persona("Pepe", 34);
		Persona p2 = new Persona ("María",25);
		Persona p3 = new Persona ("Ana");
		Persona p4 = new Persona ();
		Persona p5 = new Persona(teclado);
		Persona p6 = new Persona(teclado);
		
		p1.saludar();
		p2.saludar();
		p3.saludar();
		p4.saludar();
		p5.saludar();
		p6.saludar();
		
		
	}

}
