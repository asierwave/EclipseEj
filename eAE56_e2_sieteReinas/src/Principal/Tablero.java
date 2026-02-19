package Principal;

import java.util.Arrays;
import java.util.Vector;

public class Tablero {


	private char tablero [][]= {

			"□□□□□".toCharArray(), //Convierte una fila de caracteres en un array de caracteres osea [#,#,...]
			"□□□□□".toCharArray(), //Convierte una fila de caracteres en un array de caracteres osea [#,#,...]
			"□□□□□".toCharArray(), //Convierte una fila de caracteres en un array de caracteres osea [#,#,...]
			"□□□□□".toCharArray(), //Convierte una fila de caracteres en un array de caracteres osea [#,#,...]
			"□□□□□".toCharArray() 

			// 5x5 tablero

	};



	private int nFilas;
	private int nColumnas;

	private char vacio = '□';
	private char relleno = '■';

	private int nRellenos=0;





	public Tablero() {

		this.tablero = tablero;

		nFilas = tablero.length; //Número de filas de la matriz
		nColumnas = tablero[0].length; //Número de columnas de la matriz. Se podría utilizar cualquier fila, pero nos aseguramos que hay fila 0



	}


	public boolean encontrarSolucion() 
	{
		int contador=0;
		boolean solucion = false;

		 do {

			int f = (int)(Math.random() * 5);
			int c = (int)(Math.random() * 5);
			

			if (buscarPosicionValida(f,c))  {
				tablero[f][c]=relleno;
				nRellenos++;
			}
					
			
		
			
		} while (nRellenos < 5);
		 
		 
		 
			//Verificador de desfase nRellenos
		 
		 
			for (int f2 = 0; f2 < tablero.length; f2++) {
				for (int c2 = 0; c2 < tablero.length; c2++) {
					if(tablero[f2][c2]==relleno)
					contador++;
				}
			}
			
			
			if (nRellenos != contador && nRellenos == 5) {
						
						try {
							nRellenos = contador;
							encontrarSolucion();
						
						}
						catch (StackOverflowError e) {
							for (int f2 = 0; f2 < tablero.length; f2++) {
								for (int c2 = 0; c2 < tablero.length; c2++) {
									tablero[f2][c2]=vacio;
									nRellenos = 0;
								}
							}
							

						}
						
						encontrarSolucion();

					
					}
		 
		 
		 solucion = true;
		
			
			

			
		
			
		return solucion;
	}


	public int getnRellenos() {
		return nRellenos;
	}


	public void setnRellenos(int nRellenos) {
		this.nRellenos = nRellenos;
	}


	public boolean buscarPosicionValida (int f1,int c1)
	{
		//SUPONEMOS QUE ES TRUE, pero luego verificamos
		boolean exitoColumna = true;
		boolean exitoFila = true;
		boolean exitoDiagonal = true;




			for (int f=0; f<tablero.length; f++) {

				//Si la posición es donde vamos a poner la reina, la salta

				if (f==f1) continue;


				//Si encuentra alguna otra reina en la columna, false

				if (tablero[f][c1]==relleno) {
					exitoColumna= false;
					break; //Ya sabemos que este bucle no es válido y salimos porque ha encontrado una reina
				}


			}
			
			
			


			//Ahora la fila

			for (int c=0; c<tablero[f1].length; c++) {

				//Si la posición es donde vamos a poner la reina, la salta

				if (c==c1) continue;

				//Si encuentra alguna otra reina en la columna, false

				if (tablero[f1][c]==relleno) {
					exitoFila= false;
					break; //Ya sabemos que este bucle no es válido y salimos porque ha encontrado una reina
				}

			}
			
			
			

			//Ahora la diagonal


			for (int f = 0; f < tablero.length; f++) {
				for (int c = 0; c < tablero.length; c++) {

					if (f == f1 && c == c1) continue;

					if (Math.abs(f - f1) == Math.abs(c - c1)) {
						if (tablero[f][c] == relleno) {
							exitoDiagonal = false;
							break;
						}
					}
				}
				if (!exitoDiagonal) break;
			}

	
		
		if (exitoDiagonal && exitoColumna && exitoFila) {
		
		return true;
		
		}

	
		
		return false;
			
		}
		





	public String toString() {

		String resultado="";


		for (int f=0; f<nFilas; f++) {

			for (int c=0; c<nColumnas; c++) {
				resultado += tablero[f][c]; 
			}

			resultado += '\n';
			//System.out.printf("%4.0f", marco[f][c]); 


		}


		return resultado;
	}
	
}
