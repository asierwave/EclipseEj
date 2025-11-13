package eAE4_5_piramideConNumeroIntroducido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int altura;
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Introduzca altura: ");
		altura = sc.nextInt();
		
		
		for (int fila = 1; fila <= altura; fila ++)
		{
		for (int i=1; i<=fila; i++) //bucle ascendente
			System.out.print(i);
		for (int i=fila-1; i>0; i--) //bucle descendente
			System.out.print(i);
		System.out.println();
		}
		sc.close();
		
		
		
	}

}
