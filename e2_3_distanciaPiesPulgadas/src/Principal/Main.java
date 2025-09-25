package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		float distanciaEnPies, distanciaEnPulgadas, distanciaEnCm;
		
		System.out.println ("¿Cuál es la distancia en pies?");
		distanciaEnPies = teclado.nextFloat();
		
		System.out.println ("¿Y queda algo en pulgadas?");
		distanciaEnPulgadas = teclado.nextFloat();
		
		
		distanciaEnCm = (distanciaEnPies*12*2.54f) + (distanciaEnPulgadas*2.54f); 
		
		
		System.out.println ("La distancia en cm de la distancia que me diste en pies y pulgadas es:" +distanciaEnCm);
		
		teclado.close();
	
	}

}