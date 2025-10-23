package e5_1_multiploDeOtro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Un número es múltiplo de otro cuando su división da resto 0
		
		int num1, num2;
		int mayor, menor;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Ingrese dos dígito: ");
		num1= teclado.nextInt();
		num2= teclado.nextInt();
		
		mayor = (num1 > num2) ? num1:num2;
		menor = (num1 < num2) ? num1:num2;
		
		if (mayor == 0 || menor == 0) {
			System.out.println("No tienes otra cosa mejor que hacer");
		} else {
			
			if (mayor % menor == 0) {
				System.out.println("El número " +mayor+ " es múltiplo del número "+menor);

			} else {
				System.out.println("El número " +mayor+ " NO es múltiplo del número "+menor);

			}
		}
		

	}

}
