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
			
	private int nVacios=25;
	private int nRellenos=0;
	



	
	public Tablero() {
		
		this.tablero = tablero;

		nFilas = tablero.length; //Número de filas de la matriz
		nColumnas = tablero[0].length; //Número de columnas de la matriz. Se podría utilizar cualquier fila, pero nos aseguramos que hay fila 0
		
		
		
		
		
	}

	
	public boolean encontrarSolucion() 
	{
		

//		for (int f = 0; f<tablero.length; f++) {
//			for (int c = 0; c<tablero[0].length; c++) {
//				if (tablero[f][c] == '■')
//				nRellenos++;
//			}
//		}
		
	
		while (nRellenos != 5) {
			
		int f=(int) Math.random(); 
		int c=(int) Math.random();
		
		if (f >= 0 && c>=0 && f<tablero.length && c<tablero[0].length) {
		
		if(buscarCamino(f,c)==true) {
			
			if (nRellenos == 5) 
				return true;


		}
		else {
			return false;
		
	
	}
		
		}
		}
		return false;
	}
	
	
	public boolean buscarCamino (int f1,int c1)
	{
		
		
		for (int f = 0; f<tablero.length; f++) { //Recorre filas y columnas para el máximo de espacio de 0 a 5 casillas
		
			if (f == f1) { //Saltamos la casilla rellenada
				f++;
				
			}
			
			for (int c=0; c<tablero[0].length; c++) {
				
				
				if (c == c1) { //Saltamos la casilla rellenada
					c++;
					
					
					
					if (tablero[f1-f][c] == vacio || tablero[f1+f][c] == vacio || tablero[f][c1-c] == vacio || tablero[f][c1+c] == vacio) 
					{
						
						tablero[f1][c1] = relleno;
						nRellenos++;
						return true;

					}
						
					}
				}
				
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
