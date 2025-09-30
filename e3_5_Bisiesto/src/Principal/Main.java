package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int anio;
		String resultado;
		
		System.out.println("Dime un año: ");
		
		anio= teclado.nextInt();
		
		resultado = (anio % 4 == 0 && anio % 100 != 0) || anio % 100 == 0 ? "Es bisiesto" : "No es bisiesto";
		
		System.out.println (resultado);
	}

}
