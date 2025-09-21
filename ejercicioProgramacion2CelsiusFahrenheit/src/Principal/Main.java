package Principal;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {


		Scanner teclado = new Scanner (System.in);
		float gradosCelsius, gradosFahrenheit;
		
		System.out.println("¿Cuántos grados celsius?");
		
		gradosCelsius = teclado.nextFloat();
		
		gradosFahrenheit = ((gradosCelsius * 1.8f) + 32);
		
		System.out.printf("Tus %.1f grados celsius son %.1f grados fahrenheit",gradosCelsius, gradosFahrenheit);
		
		
		
	}

}
