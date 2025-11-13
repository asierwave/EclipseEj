package Principal;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int altura;
		int espacios;
		int asteriscos;
		System.out.println("Introduzca altura impar y mayor 3");
		altura = sc.nextInt();
		espacios = 0;
		asteriscos = altura;
		for (int fila=0;fila<=altura/2;fila++)
		{
			for (int i=0;i<espacios;i++)
				System.out.print(" ");
			
			for (int i=0;i<asteriscos;i++)
				System.out.print("*");
			System.out.println();
			espacios++;
			asteriscos -= 2;
		}
		espacios -= 2;
		asteriscos = 3;
		for (int fila=1;fila<=altura/2;fila++)
		{
			for (int i=0;i<espacios;i++)
				System.out.print(" ");
			
			for (int i=0;i<asteriscos;i++)
				System.out.print("*");
			System.out.println();
			espacios--;
			asteriscos += 2;
		}

		
		
	}

}