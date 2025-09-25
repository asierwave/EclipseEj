package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		float numero;
		String resultado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Dame un número y te digo si es negativo, positivo o 0: ");
		numero = teclado.nextFloat();
		
		resultado = (numero >0) ? "positivo" : ((numero<0) ? "negativo" : "cero") ;
		
		System.out.println("El número es "+resultado);
		
		teclado.close();
	}

}
