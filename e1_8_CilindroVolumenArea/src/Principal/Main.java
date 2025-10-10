package Principal;

import java.util.Scanner;

public class Main {

		
		public static void main(String[] args) {


			Scanner teclado = new Scanner (System.in);
			double pi=3.141516, alturaCilindro,volumenCilindro,radioBaseCilindro;
			
			
			System.out.println("¿Cuál es el radio de la base?");
			
			radioBaseCilindro = teclado.nextFloat();
			
			System.out.println("¿Cuál es la altura del cilindro?");
		
			alturaCilindro = teclado.nextFloat();
					
			
			volumenCilindro = (pi * (radioBaseCilindro * radioBaseCilindro)) * alturaCilindro;
					
					
			System.out.printf("Esta es el volumen calculado del cilindro de altura y radio aportados:  %.1f cm cúbicos", volumenCilindro);
			
			
			teclado.close();
			
			
	}

	
	
}