package e5_10_numerosIntentosHastaNegativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		int numero = 0;
		int intentos=0;
		int suma=0;
		float media = 0;

		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número, si insertas uno negativo (FIN): ");
		numero = teclado.nextInt();
		
		
		while (numero >= 0) {
			intentos ++;
			System.out.println("Es positivo");

			suma = suma+numero;
			System.out.println("Dame un número, si insertas uno negativo (FIN): ");
			numero = teclado.nextInt();

		}
		
		System.out.println("Es negativo");
		
		if (intentos > 0) {
			media = (float) suma / intentos;
			System.out.println("La media es "+media+" y has utilizado "+intentos+" intentos");
			
		} else {
			System.out.println("No has insertado ningún número positivo");

		}
		
		
	}

}
