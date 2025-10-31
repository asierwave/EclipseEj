package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float mediaPositivos;
		float mediaNegativos;
		int contadorCeros=0;
		int sumaPositivos=0;
		int sumaNegativos=0;
		int contadorPositivos=0;
		int contadorNegativos=0;
		int numero;

		System.out.println("Introduzca 10 números");

		Scanner teclado = new Scanner(System.in);

		for (int i=0; i<10; i++)
		{
			numero = teclado.nextInt();
				if (numero == 0)
					contadorCeros++;
				else 
					if (numero>0)
					{
						sumaPositivos = sumaPositivos + numero;
						contadorPositivos++;

					}
					else 
					{
						sumaNegativos = sumaNegativos + numero;
						contadorNegativos++;
					}
		}

				if (contadorPositivos > 0) {
						mediaPositivos = (float)sumaPositivos / contadorPositivos;
						System.out.println("La media de positivos es "+mediaPositivos);

					} else System.out.println("No hay números positivos");

					if (contadorNegativos > 0) 
					{
						mediaNegativos = (float) sumaNegativos / contadorNegativos;
						System.out.println("La media de negativos es "+mediaNegativos);
					}

		mediaPositivos = (float) sumaPositivos / contadorPositivos;
		System.out.println("La cantidad de ceros es "+contadorCeros);

		teclado.close();
		
	}

}
