package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean esPar = false;
		Scanner input = new Scanner (System.in);

		try {
			
			if (verificarNumero(input, esPar)) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
			
		}catch (InputMismatchException e) {
			System.out.println("Error: Solo acepto enteros");
			input.nextLine();
		}
		

		
	}
	
	
	public static boolean verificarNumero(Scanner input,boolean esPar) {
		int numero;
		esPar=false;
		
		System.out.println("Dame un número y te verifico si es par: ");
		numero = input.nextInt();
		
		
		if (numero%2 == 0)
			esPar=true;
		
		return esPar;
		
	}

}
