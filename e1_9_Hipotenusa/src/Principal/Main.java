package Principal;

import java.util.Scanner;

public class Main {

		
		public static void main(String[] args) {


			Scanner teclado = new Scanner (System.in);
			double catetoA, catetoB,hipotenusaC;
			
			System.out.println("¿Cuántos cm mide el cateto A del triángulo?");
			
			catetoA = teclado.nextFloat();
			
			System.out.println("¿Cuántos cm mide el cateto B del triángulo?");
			
			catetoB = teclado.nextFloat();
						
			hipotenusaC = Math.sqrt((Math.pow(catetoA, 2))+(Math.pow(catetoB, 2)));
			
			System.out.printf("Esta es la longitud de la hipotenusa:  %.1fcm",hipotenusaC);
			
			
			teclado.close();
			
			
	}

	
	
}
