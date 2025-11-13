package e5_18b_trianguloAsteriscos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		int altura;
		
		
		System.out.println("Altura");
		altura = sc.nextInt();
		
		for (int fila = 0; fila<altura; fila++)
		{
			for (int columna=0; columna <= fila; columna++)
				if(fila==0 || fila == altura-1 || columna== 0|| columna == fila)
				System.out.print("*");
			
				else System.out.print(" ");
			System.out.println();
		}
		
		sc.close();
		
		
		
		
	}

}
