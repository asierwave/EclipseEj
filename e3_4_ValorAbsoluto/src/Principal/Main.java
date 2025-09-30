package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float num1, absoluto, resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println ("Dame un número: ");
		num1 = teclado.nextFloat();
		
		
		absoluto= Math.abs(num1);
		
		resultado = (num1 < 0) ? absoluto : num1;
		
		
		System.out.println ("El valor absoluto del número es: " +resultado);

	}

}
