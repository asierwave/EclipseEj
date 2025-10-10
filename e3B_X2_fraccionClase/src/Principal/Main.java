package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la primera fraccion:");
		Fraccion f1 = new Fraccion(teclado);
		System.out.println("Introduce la segunda fraccion:");
		Fraccion f2 = new Fraccion(teclado);

		// Fraccion f1 = new Fraccion(1,2);
		// Fraccion f2 = new Fraccion(2,3);
		Fraccion f3;

		f3 = f1.sumar(f2);
		System.out.println(f1+ " + " + f2 + " = " + f3);

		f3 = f1.restar(f2);
		System.out.println(f1+ " - " + f2 + " = " + f3);


		f3 = f1.multiplicar(f2);
		System.out.println(f1+ " * " + f2 + " = " + f3);

		f3 = f1.cociente(f2);
		System.out.printf(f1+ " / " + f2 + " = " + f3);
		teclado.close();

	}

}
