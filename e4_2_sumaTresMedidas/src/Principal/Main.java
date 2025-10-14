package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		float mmMedida, cmMedida, mMedida, sumaMedidas;

		System.out.println ("Dame una medida en mm: ");
		mmMedida = teclado.nextFloat();
		System.out.println ("Dame una medida en cm: ");
		cmMedida = teclado.nextFloat();
		System.out.println ("Dame una medida en metros: ");
		mMedida = teclado.nextFloat();
		
		
		sumaMedidas = (mmMedida/10f) + cmMedida + (mMedida*100f);
		
		System.out.printf("La suma de las medidas en cm será de %.2f cm", sumaMedidas);
		

	}

}
