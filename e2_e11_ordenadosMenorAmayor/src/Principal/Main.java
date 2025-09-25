package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
		float num1, num2;
		String resultado;
		
		System.out.println("Dame dos números y te los ordeno de menor a mayor: ");
		num1= teclado.nextFloat();
		num2=teclado.nextFloat();
		
		resultado = (num1 > num2) ? (int)num2+" y "+(int)num1 : (int)num1+" y "+(int)num2;
		
		System.out.println (resultado);
		
		

	}

}
