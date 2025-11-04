package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int i;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame un número entre 0 y 99 y te lo muestro en letras:");
		int numero = teclado.nextInt();
		
			String numeroLetra;
		
			switch (numero) {
				case 1: numeroLetra = "Uno";
				case 2: numeroLetra ="Dos";
				case 3: numeroLetra ="Tres";
				case 4: numeroLetra ="Cuatro";
				case 5: numeroLetra ="Cinco";
				case 6: numeroLetra ="Seis";
				case 7: numeroLetra ="Siete";
				case 8: numeroLetra ="Ocho";
				case 9: numeroLetra ="Nueve";
				case 10: numeroLetra ="Diez";
				case 11: numeroLetra ="Once";
				case 12: numeroLetra ="Doce";
				case 13: numeroLetra ="Trece";
				case 14: numeroLetra ="Catorce";
				case 15: numeroLetra ="Quince";
				
			while (numero>=16 && numero < 20) {
				numeroLetra = ("Dieci"+numeroLetra);
				break;
			}
			
			System.out.println(numeroLetra);

			}
	}
}
				
				
			



			
			
			
		
		
		
	


