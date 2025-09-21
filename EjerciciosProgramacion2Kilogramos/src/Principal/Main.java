package Principal;

import java.util.Scanner;

public class Main {

		
		public static void main(String[] args) {


			Scanner teclado = new Scanner (System.in);
			double kilogramos, altura,imc;
			
			System.out.println("¿Cuántos kilos pesas?");
			
			kilogramos = teclado.nextFloat();
			
			System.out.println("¿Cuál es tu altura?");
			
			altura = teclado.nextFloat()/100;
			
			imc = (double) kilogramos / Math.pow (altura,2);
			
			System.out.printf("Este es tu IMC: %.2f",imc);
			

	}

	
	
}
