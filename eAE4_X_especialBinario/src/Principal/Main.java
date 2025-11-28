package Principal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	// Función para convertir decimal a binario según el número de bits necesarios
	public static String decimalABinario(int n) {
		if (n == 0) return "0";
		return Integer.toBinaryString(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Convertir número decimal a binario (según bits necesarios)");
			System.out.println("2. Salir");
			System.out.print("Elige una opción: ");

			try {
				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
					System.out.print("Introduce un número decimal: ");
					try {
						int numero = sc.nextInt();
						String binario = decimalABinario(numero);
						int bitsNecesarios = binario.length();
						System.out.println("El número " + numero + " en binario es: " + binario);
						System.out.println("Número de bits necesarios: " + bitsNecesarios);
					} catch (InputMismatchException e) {
						System.out.println("¡Error! Debes introducir un número entero.");
						sc.next(); // Limpiar buffer
					}
					break;
				case 2:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida. Inténtalo de nuevo.");
				}

			} catch (InputMismatchException e) {
				System.out.println("¡Error! Debes introducir un número entero para la opción.");
				sc.next(); 
			}

		} while (opcion != 2);

		sc.close();
	}
}