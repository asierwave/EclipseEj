package Principal;

import java.util.Scanner;

public class Main {

	
	
	
	
	public static void main(String[] args) {
 
		int tablero [][] = new int [3][3];

		 
		
		
		 Scanner sc = new Scanner (System.in);
		 
		 
		 dibujarMatriz(tablero);
		 imprimirMatriz(tablero);
		 verificarJuego(tablero);
		 
		 
		 
	}
		 
		 
		 
		 public static int[][] dibujarMatriz(int[][] tablero) {
			
			 
			 //Todo con 0 al principio (tablero vacío)
			 
			 for (int f=0;f<tablero.length;f++) //leemos las filas
				 
				 
				 for (int c=0; c< tablero[0].length; c++) //leemos las columnas, es decir, la longitud de la primera fila
				 { 
					 tablero [f][c] = 0; 
				 }
			 return tablero;
			 
		 }
		 
		 
		 
		 public static int [][] jugada (Scanner sc, int [][] tablero, boolean finJuego) {
			
			 int jugadaA;
			 int jugadaB;
			 
			 do {
				 System.out.println("Dame una jugada");
				 jugadaA = sc.nextInt();
				 
				 
				 
			 } while (finJuego != true);
			 
			 
			 
			 return tablero;
			  
		 }
		 
		 
		 public static void imprimirMatriz(int tablero[][]) {
				
			 
			 //Imprimir matriz
			 for (int f=0; f<tablero.length; f++)
			 {
				 for (int c=0; c<tablero[0].length;c++)
					 System.out.printf("%4.0f", tablero[f][c]); 
				 
				 
				 System.out.println(" ");
				 
				 
				 
			 }
			
			 
			 
			 }
		 
		 
		 

			public static boolean verificarJuego (int [][] tablero) {
				boolean finJuego = false;

				
				 // Verificamos si el tablero está lleno
				 
			 for (int f=0;f<tablero.length;f++) //leemos las filas
					 
					 
					 for (int c=0; c< tablero[0].length; c++) //leemos las columnas, es decir, la longitud de la primera fila
					 { 
						 
						 if (tablero [f][c] != 0) {
							 finJuego = true;
							 
						 }
						 
						 
						 
					 }
			 return finJuego;
		 
	
	}

}
