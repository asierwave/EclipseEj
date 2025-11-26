package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long numeroIntroducido;
		Scanner input = new Scanner (System.in);


		do 
		{

			System.out.println("Dame un número entero y te digo los numeros perfectos que hay desde cero hasta él: ");
			numeroIntroducido = leerEntero (input, "Introduzca un número (0=FIN)");

			
			//Para comprobar si los números desde cero hasta numero introducidos son perfectos

			
			for (long n=1; n < numeroIntroducido; n++) {

				if (numeroEsPerfecto(n) == true) 
					System.out.println(n+ " es perfecto");

			}
			

			
			//Para comprobar si el número introducido es perfecto o no
			
			//if (numeroEsPerfecto(numeroIntroducido) == true) 
			//System.out.println(numeroIntroducido+ " es perfecto");
			

		} while (numeroIntroducido !=0);



		input.close();


	}



	public static long leerEntero (Scanner input, String mensaje) {
		long numeroIntroducido=0;


		do 
		{

			System.out.println(mensaje);

			try {


				numeroIntroducido = input.nextInt();

			} catch (InputMismatchException pendejada) {
				System.out.println("Introduzca un número, no una letra ni na");
				input.nextLine();
				numeroIntroducido = -1;
			}

			if (numeroIntroducido <0) 
				System.out.println("Introduzca un valor positivo");


		} while (numeroIntroducido <0);

		return numeroIntroducido;
	}




	public static boolean numeroEsPerfecto (long numeroIntroducido) {


		long divisor = 0;
		long sumaDivisores = 0;
		boolean esNumeroPerfecto=false;


		for (long i=1;i<numeroIntroducido; i++) {

			try {

				if (numeroIntroducido%i == 0) {
					divisor = i;
					sumaDivisores= sumaDivisores + divisor;

					//System.out.println("Divisor es "+divisor+ " y la suma de divisores es "+sumaDivisores);
				} 
					



			} catch (ArithmeticException e) {
				System.out.println("No contamos cero");
			}


		}
		
		
		if (numeroIntroducido == sumaDivisores) {
			esNumeroPerfecto = true;

		}

		return esNumeroPerfecto;

	}



}
