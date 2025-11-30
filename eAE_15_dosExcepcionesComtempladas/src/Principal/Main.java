package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
	Scanner input = new Scanner (System.in);
	int numero,a,b;
	float resultado;
	
	try {
	
	System.out.println("Dame dos valores A y B y los divido.");
	System.out.println("Introduzca el valor A: ");
	a= input.nextInt();
	
	System.out.println("Introduzca el valor B: ");
	b= input.nextInt();

		
	resultado= (float)a/b;
	System.out.println(resultado);
	
	} catch (InputMismatchException e) {
		System.out.println("Error: Solo recibo números enteros");
	} catch (ArithmeticException e) {
		System.out.println("0");
	}
		
	}

}
