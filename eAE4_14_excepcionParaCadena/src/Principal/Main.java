package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int numero;
		
		try {
		
		System.out.println("Dame un valor: ");
		numero = input.nextInt();
		
		System.out.println("El valor introducido es: "+numero);

		} catch (InputMismatchException e) {
			System.out.println("Error: Introduzca un número entero");
			input.nextLine();
		}
		
		
	}

}
