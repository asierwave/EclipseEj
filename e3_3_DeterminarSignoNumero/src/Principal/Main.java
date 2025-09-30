package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		float num1;
		String resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		
		num1 = teclado.nextFloat();
		
		resultado = (num1 > 0) ? "Es positivo" : "Es negativo";
		
		System.out.println (resultado);
		
		
		
	}
}
