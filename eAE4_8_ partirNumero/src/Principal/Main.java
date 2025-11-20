package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int numero;
		int nCifras;
		
		int mitadInferior;
		int mitadSuperior;
		
		do 
		{
			System.out.println("Introduzca un entero de al menos dos dígitos");
			numero = sc.nextInt();
			
			if (numero < 10) {
				System.out.println("El número debe tener dos cifras");
			}

		} while (numero < 10);   // ← aquí está el while correcto del menú
		
		// Cálculo de cifras
		nCifras = calcularCifrasEntero(numero);
		System.out.println("El número " + numero + " tiene " + nCifras + " cifras");
		
	
		
		////////////////////////////////////////
		//Método alternativo mas rápido
		System.out.println("La mitad inferior vale "+((int)(numero/Math.pow(10, nCifras/2))));
		System.out.println("La mitad superior vale "+((int)(numero%Math.pow(10, nCifras/2))));
///////////////////////////////
		
		// Valores iniciales
		mitadInferior = 0;
		mitadSuperior = 0;
		int auxInf = 1, auxSup = 1;

		// Guardamos el número original porque lo vamos dividiendo
		int copia = numero;
		
		for (int i = 0; i < nCifras; i++) 
		{
			if (i < nCifras / 2) {
				mitadInferior = mitadInferior + (copia % 10) * auxInf;
				auxInf *= 10;
			} else {
				mitadSuperior = mitadSuperior + (copia % 10) * auxSup;
				auxSup *= 10;
			}
			
			copia /= 10;
		}

		System.out.println("Mitad inferior: " + mitadInferior);
		System.out.println("Mitad superior: " + mitadSuperior);
		
		sc.close();
	}

	
	// Función para calcular cuántas cifras tiene un entero
	public static int calcularCifrasEntero(int n)
	{
		int contador = 0; 

		do {
			n = n / 10;
			contador++;
		} while (n != 0);
		
		return contador;
	}

}

