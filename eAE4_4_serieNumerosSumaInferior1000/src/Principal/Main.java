package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numIntroducido, contador = 0, sumatorio = 0;

		Scanner input = new Scanner (System.in);
		
		while (sumatorio < 1000 ) {
			System.out.println("Introduzca valores y pararé de pedírtelos cuando sumen mas de 1000: ");
			numIntroducido = input.nextInt();
			sumatorio = sumatorio +numIntroducido;
			contador++;
			System.out.println(sumatorio);
		}
		
		System.out.println("Te pasaste de 1000 en el sumatorio");
		System.out.println("El total sumado es hasta la ruptura es: "+sumatorio+" y has sumado "+(contador-1)+" numeros");
		System.out.println("La media de todos los números introducidos es: "+calcularMedia(contador,sumatorio));
	}
	
	
	public static float calcularMedia (int contador, int sumatorio) {
		float media = sumatorio / contador;
		return media;
	}

}
