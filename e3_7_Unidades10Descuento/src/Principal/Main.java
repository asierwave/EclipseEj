package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int unidadesCompradas;
		float precioUnidad;
		float precioFinal;
		float dto;
		
		System.out.println("Introduzca las unidades compradas: ");
		unidadesCompradas = teclado.nextInt();
		System.out.println ("Introduzca el precio de unidad: ");
		precioUnidad = teclado.nextFloat();
		
		dto = (unidadesCompradas > 10) ? 0.95f : 1; //Quiero que la variable descuento reciba uno u otro valor
		//dependiendo de si hay mas de 10 unidades compradas o no.
		
		//5% de descuento, significa que el precio descontado se hallará multiplicando por 0,95 
		
		precioFinal = unidadesCompradas * precioUnidad * dto;
		
		System.out.printf("El precio final es %.0f", precioFinal);
		
	}

}
