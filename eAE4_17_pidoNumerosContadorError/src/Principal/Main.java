package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		float numero;
		float masAlto = 0;
		boolean esLetra = false;
		char letra = 0;

		int contadorError = 0;
		int totalIntentos = 10;
		
		

		
		for (int i= 0; i<totalIntentos; i++) {
		
			try {
		
		if (esLetra) {
			totalIntentos++;
			contadorError++;
			System.out.println("Tienes un intento mas, vuelve a intentarlo");
			}
		
			System.out.println("Dame un número decimal");
			numero = input.nextFloat();
				
			if (numero != Math.floor(numero)) {
			
			masAlto = masAlto(numero, masAlto);
			System.out.println(masAlto);
	
			System.out.println(totalIntentos);
			esLetra =false;
			} else {
				contadorError++;
				System.out.println("Has introducido un número entero, no un decimal");
			}
			
		} catch (InputMismatchException e) {
			  input.nextLine();

			    System.out.print("Has introducido un carácter, repítemelo: ");
			    String texto = input.next();     
			    char letraCaracter = texto.charAt(0); 

			    if (Character.isLetter(letraCaracter)) {
			        esLetra = true;
			        System.out.println("Es letra: " + letraCaracter);
			    } else {
			        System.out.println("No es letra, es un símbolo: " + letraCaracter);
			        contadorError++;
			    }
		}
		
		}
	
		
		
		
		System.out.println("Se han producido "+contadorError+" errores de introducción");
		System.out.println(masAlto+" es el numero decimal mas alto introducido");
		
		
		
	}


	
	private static float masAlto(float numero, float masAlto) {
		
		masAlto = (masAlto > numero)? masAlto: numero;
		
		return masAlto;
	}
}
