package Principal;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		final double entradaInfantil= 15.5;
		final float entradaAdulto = 20;
		final int importeMinimoDescuento = 100;
		final double descuento = 5;
		int cantidadEntradasInfantiles, cantidadEntradasAdultos;
		
		double totalConDesc, totalSinDesc = 0;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Dime la cantidad de entradas infantiles que quieres: ");
		cantidadEntradasInfantiles = teclado.nextInt();
		
		System.out.println("Dime la cantidad de entradas de adultos que quieres: ");
		cantidadEntradasAdultos = teclado.nextInt();


		totalSinDesc = cantidadEntradasInfantiles * entradaInfantil + cantidadEntradasAdultos * entradaAdulto;
		
		
		System.out.printf ("La suma total de las entradas sin descuento es %.1f€ ", totalSinDesc);
		
		totalConDesc = (totalSinDesc > importeMinimoDescuento) ? totalSinDesc - (totalSinDesc * (descuento/100)) : totalSinDesc; 

		System.out.printf ("y la suma total de las entradas con descuento es %.1f€", totalConDesc);

	}

}
