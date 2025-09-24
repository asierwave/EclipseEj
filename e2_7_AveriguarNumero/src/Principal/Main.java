package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		float numeroSolicitado, numeroCorrecto;
		String resultado; //Hay que declarar la variable con String en mayúsculas siempre
		
		numeroCorrecto=(52-12)*8; //320
		
		System.out.println("Averigua el número que al dividirlo entre 8 y sumarle 12, el resultado que se obtiene es 52. Prueba aquí: ");
		numeroSolicitado= teclado.nextFloat();
		
		resultado = (numeroSolicitado == numeroCorrecto) ? "¡Has acertado! El número sí era "+(int)numeroSolicitado : "No has acertado :(, prueba otra vez";		
		
		System.out.println (resultado);
				
		
	}

}
