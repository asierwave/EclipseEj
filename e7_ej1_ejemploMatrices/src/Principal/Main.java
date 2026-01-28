package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		 //double matriz [][] = {{1,2,3,4,5},{9,8,7,6,5},{5,4,5,6,8}};
		 
		 double matriz [][];
		 
		 matriz = new double [4][5];
		 
		 //pedir matriz, leemos matriz
		 
		 System.out.println("Introduzca una matriz de 4x5");
		 for (int f=0;f<matriz.length;f++) //leemos las filas
			 for (int c=0; c< matriz [0].length; c++) //leemos las columnas, es decir, la longitud de la primera fila
				 matriz [f][c] = sc.nextDouble();
		
		 
		 /////////////////
		 
		 //declaramos vector de suma
		 
		 double vector[];
		 vector = new double [matriz.length];
		 
		 //calculamos las sumas
		 
		 for (int f=0; f<matriz.length; f++)
		 {
			 vector [f]=0;
			 for (int c=0; c<matriz[0].length; c++)
				 vector [f] = vector [f] + matriz [f][c];
		 }
		 
		  
		 ////////////////////
		 
		 
		 //Imprimir matriz
		 for (int f=0; f<matriz.length; f++)
		 {
			 for (int c=0; c<matriz[0].length;c++)
				 System.out.printf("%4.0f", matriz[f][c]); //no quiero decimales y quiero que ocupe 4 espacios a la hora de dibujar "%4.0f"
			 
			 
		//imprimimos el resultado de la suma 
			 System.out.println(" "+ vector [f]);
			 
			 
			 
		 }
		
		sc.close();
	}

}
