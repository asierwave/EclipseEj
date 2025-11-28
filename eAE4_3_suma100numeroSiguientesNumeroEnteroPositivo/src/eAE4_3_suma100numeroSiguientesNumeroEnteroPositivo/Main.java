package eAE4_3_suma100numeroSiguientesNumeroEnteroPositivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		int numeroPositivo, sumaNumeros, numeroMas100Siguientes = 0;
		boolean esPositivo;

		System.out.println("Dame un número positivo: ");
		numeroPositivo = teclado.nextInt();		




		esPositivo = (numeroPositivo > 0) ? true: false;


		sumaNumeros=0;

		if (esPositivo == true) {


			for(int n=numeroPositivo+1;n<(numeroPositivo+1+100);n++) {

				sumaNumeros = sumaNumeros+n;

				System.out.println(sumaNumeros);

			}
			
			System.out.println("El numero "+numeroPositivo+ ", la suma de sus 100 siguientes es igual a: "+sumaNumeros);


		}
		else { 
			System.out.println("El número no es positivo");

		}


	}

}
