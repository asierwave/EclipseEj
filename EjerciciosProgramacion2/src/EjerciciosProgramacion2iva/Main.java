package EjerciciosProgramacion2iva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float precioSinIva, precioFinal, iva;
		
		//Lectura de los datos de entrada
		
		System.out.println ("Introduzca el precio base:");
		
		precioSinIva = teclado.nextFloat();
		
		//Cálculo de las expresiones
		
		iva = precioSinIva * 0.21f;
		
		precioFinal = precioSinIva + iva;
		
		//Escritura de los resultados
		System.out.printf ("%.1f es el precio con IVA", precioFinal);
		System.out.println (" y el desglose de IVA es "+iva);
		teclado.close();
	
	}

}
