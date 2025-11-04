package e5_18_todosLosDivisoresDeNumero;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int numero;
		
		//Y además dime si es primo, es decir, solo tiene dos divisores, el 1 y el mismo número. 
		//Para ello contamos los divisores

		int contadorDivisores= 0;
		
		System.out.println("Introduzca un entero positivo");
		numero = sc.nextInt();
		for (int i=1; i<=numero; i++)
			if (numero % i == 0)
				
			{
				contadorDivisores++;
				System.out.println("El "+i+" es divisor de "+numero);

			}
		
		if (contadorDivisores == 2) {
			System.out.println("El numero "+numero+" es primo");
		}
				
				sc.close();	
	}

}
