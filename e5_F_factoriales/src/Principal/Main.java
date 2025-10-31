package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		
		int n,k;
		int combinatorio;
		int factorialN, factorialK, factorialNK;
		boolean esNPrimo;
		
		
		System.out.println("Número para calcula la combinatoria: ");
		n= teclado.nextInt();

		System.out.println("Tomandos de cuántos en cuántos: ");
		k = teclado.nextInt();
		
		
		esNPrimo= esPrimo(n); //llama al método de cálculo de primos 
		
		
		factorialN = factorial(n); //llama al método de cálculo de factoriales 
		factorialK = factorial(k);
		factorialNK = factorial(n-k);
		combinatorio = factorialN/ (factorialK*factorialNK);
		System.out.println("El combinatorio es "+combinatorio);
		
	}
		
	
		
		
		public static int factorial (int a) 
		{
			int resultado;
			resultado = 1; //Si vamos a multiplicar, hay que inicializar a 1, si hay que sumar a 0
			for (int i = 1; i<=a; i++)
				resultado = resultado *i;
			return resultado;
		}

		
		public static boolean esPrimo(int n)
		{
			
			//Método de bandera porque solo avisa (entra en el bucle) cuando hay un divisor y entonces no es primo
			
			boolean resultado= true; // será primo hasta que entre en el bucle
			//Un número es primo cuando el número es divisible por i
			
			for (int i=2; i<n; i++) //recorre todos los números que hay entre 2 y n
				if (n % i == 0)
					resultado= false;
					
			
			//Con que haya un divisor entre el número entre 2 y n y entra en el bucle, no es primo
			return resultado;
		
		
		}
		
		
}
