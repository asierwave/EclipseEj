package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		int numero = 0;
		
		
		
		while (numero != 999) {
			try {
		System.out.println("Dame un número y te muevo las cifras una posición a la izquierda: ");
		numero = input.nextInt();
		
		
		if (numero != 999) 
		migrarCifraNumero(numero);
		else {
			System.out.println("///////////ADIOS//////////");
		}
		
			} catch (InputMismatchException e) { 
				System.out.println("Introduce un número");
				input.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		
		} 
		
		
		
	}
	
	
	public static void migrarCifraNumero (int numero) {
			int cociente = 0;
			int resto;
			int contador = 0;
			
			
			int aux = numero;
			
			while (aux != 0) {
				contador ++;
				aux = aux / 10;
			}
			
			//System.out.println(contador);
			contador--;
		
		
			cociente = numero/(int)Math.pow(10, contador);
			//System.out.println(cociente);
			resto = numero%(int)Math.pow(10, contador);
			

			//System.out.println(numero);
			//System.out.println(resto);
			numero = numero % ((int)Math.pow(10, contador))*10 +cociente;
			System.out.println(numero);
		
		
	}

}
