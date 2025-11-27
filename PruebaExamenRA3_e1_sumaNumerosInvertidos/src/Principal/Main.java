package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int numeroInvertido;
		int suma;
		do {
			System.out.println("Introduzca un número");
			numero = leerEntero(sc);
			if (numero != 0) {
				numeroInvertido = invertirNumero(numero);
				suma = numero + numeroInvertido;
				System.out.println(numero + " + " + numeroInvertido + " = " + suma);
			}
		} while (numero != 0);

		sc.close();
	}

	public static int invertirNumero(int numero) {
		int numeroInvertido = 0;
		while (numero != 0) {
			numeroInvertido = numeroInvertido * 10 + numero % 10;
			numero = numero / 10;
		}
		return numeroInvertido;
	}

	public static int leerEntero(Scanner sc) {
		int numero;

		do {
			try {
				numero = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número ¡bruto/a/e!");
				sc.nextLine();
				numero = -1;
			}
			if (numero < 0)
				System.out.println("Debe ser positivo o cero");

		} while (numero < 0);
		return numero;
	}
}

/*
 * System.out.println("Introduzca un número"); numero = sc.nextInt(); while
 * (numero!=0) { numeroInvertido = invertirNumero(numero); suma = numero +
 * numeroInvertido; System.out.println(numero+" + "+
 * numeroInvertido+" = "+suma);
 * 
 * System.out.println("Introduzca un número"); numero = sc.nextInt(); }
 */
