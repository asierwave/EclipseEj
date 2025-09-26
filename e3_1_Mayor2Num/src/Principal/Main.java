package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		float num1, num2;
		String resultado;
		
		System.out.println ("Dame dos números y te digo cual es el mayor: ");
		num1= teclado.nextFloat();
		num2= teclado.nextFloat();
		
		resultado = (num1 > num2) ? ("El mayor es "+ (int)num1) : ((num2 > num1) ? ("El mayor es "+ (int)num2) : "Imposible");
		
		System.out.println(resultado);

	}

}
