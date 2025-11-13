package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int lado,disH, disV;

		System.out.println("Introduzca el lado: ");
		lado= sc.nextInt();

		for (int fila=0; fila<lado;fila++) {


			for (int columna=0; columna < lado; columna++)
				
			{
				disH = Math.min(columna, lado-1-columna);
				disV = Math.min(fila, lado-1-fila);
				
				if (Math.min(disH, disV)%2==0)
				
				System.out.print("*");
				
				else System.out.print(" ");
			}
			
			
			
			System.out.println(); //Salto de línea


		}

		sc.close();


	}


}
