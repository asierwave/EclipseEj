package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		 
		 int marco [][];
		 
		 //Reservamos los espacio
		 marco = new int [5][15];
		 
		 for (int f=0;f<marco.length;f++) //leemos las filas
			 
			 
			 for (int c=0; c< marco[0].length; c++) //leemos las columnas, es decir, la longitud de la primera fila
			 { 
				 if (f==0 || f==marco.length-1) 
					 // marco [f] [c] = n  >>> indica la celda de la matriz con coordenada fila (f) y columna (c)
					 marco [f][c] = 1;
				 	
				 else if (c==0 || c==marco[0].length-1) 
				 marco [f][c] = 1;
				 
				 else
				 marco [f][c] = 0;
				 
			 }
		 
		 
		 //Imprimir matriz
		 for (int f=0; f<marco.length; f++)
		 {
			 for (int c=0; c<marco[0].length;c++)
				 System.out.printf("%4.0f", marco[f][c]); //no quiero decimales y quiero que ocupe 4 espacios a la hora de dibujar "%4.0f"
			 
			 
			 System.out.println(" ");
			 
			 
			 
		 }

				 
		
		
	}

}
