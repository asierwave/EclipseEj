package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int numero_magico, numero_usuario; 
		
		numero_magico = 12345679; //1
		
		System.out.println("Dime un número entero entre 1 y 9: " );
		numero_usuario = teclado.nextInt(); //2
		
		numero_usuario = numero_magico *= 9; //3
		numero_magico *= numero_usuario; //4
		
		System.out.println("Este es el valor final del número mágico: "+numero_magico); //5

	}

}
