package Principal;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		int num1;
		String resultado;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame un numero: ");
		
		num1 = teclado.nextInt();
		
		resultado = (num1 % 2 == 0) ? "Es par" : "Es impar";
		
		System.out.println (resultado);
		
		
	}

}
