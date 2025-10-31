package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		String respuesta;

		do {

			System.out.println("Introduzca un entero: ");
			numero = teclado.nextInt();
			teclado.nextLine();
			for (int i=1; i <=10; i++)
			{
				System.out.println(numero + " x "+i+" = "+(numero*i));
			}


			System.out.println("¿Quieres repetir (S/N)?");
			respuesta = teclado.nextLine();
			respuesta = respuesta.toUpperCase();
			

		} while (respuesta.equals("S"));

		
		System.out.println("Gracias por usar el multiplicador");
		//No se puede llamar al metodo main de nuevo
		teclado.close();
	


	}


}
