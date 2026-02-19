package Principal;

public class Laberinto {

	
	// # esto representa un muro
	
	private char laberinto [][] = {
			"##########".toCharArray(), //Convierte una fila de caracteres en un array de caracteres osea [#,#,...]
			"# # #    #".toCharArray(),
			"# # #  # #".toCharArray(),
			"# # #  # #".toCharArray(),
			"#   # #  #".toCharArray(),
			"# # #   ##".toCharArray(),
			"#     #  #".toCharArray(),
			"##########".toCharArray()
	};
	
	

	//Si hubiesemos querido dibujar el laberinto sin el charArray, tendríamos que haberlo hecho así
//	private char l[][]= {
//			{'#','#'},
//			{},
//			{},
//	}
	
	// (...)
	
	//Definimos la entrada y la salida del laberinto
	private int filaEntrada=1;
	private int columnaEntrada=1;
	private int filaSalida=6; 
	private int columnaSalida= 8;
	
	private int nFilas;
	private int nColumnas;
	private char direccion;
	
	
	public Laberinto() {
		nFilas = laberinto.length; //Número de filas de la matriz
		nColumnas = laberinto[0].length; //Número de columnas de la matriz. Se podría utilizar cualquier fila, pero nos aseguramos que hay fila 0
		
		laberinto[filaEntrada][columnaEntrada] = 'E';
		laberinto[filaSalida][columnaSalida]='S';
		
	}
	
	
	public boolean encontrarSalida() 
	{
		//Se define que la salida es un camino que parte de la entrada
		if(buscarCamino(filaEntrada,columnaEntrada,'*')==true) //Busca un camino que parte de la coordenada filaEntrada,columnaEntrada
			return true;
		else
			return false;
		
	
	}
	
	
	public boolean buscarCamino (int f, int c, char direccion)
	{
		
		//Caso base, si estas fuera 
		
		if (f<0 || f>=nFilas || c<0 || c>=nColumnas) 
			return false;
		
		//Caso base, Si hay muro, no se avanza
		if (laberinto [f][c]=='#') 
			return false;
		
		if(laberinto[f][c]=='*' ||
				laberinto[f][c]=='^' ||
				laberinto[f][c]=='<' ||
				laberinto[f][c]=='>' ||
				laberinto[f][c]=='v' )
			return false;
		//Caso base, repetir la posición
		if (laberinto[f][c]=='*') 
			return false;
		
		//Caso base, LA SALIDA
		
		if (laberinto[f][c]=='S')
			return true;
		
		
		laberinto[f][c]=direccion;
		
		//buscarCamino(f-1,c); Movimiento hacia arriba
		//buscarCamino(f+1,c); Movimiento hacia derecha
		//buscarCamino(f,c-1); Movimiento hacia izquierda
		//buscarCamino(f,c+1); Movimiento hacia derecha
		
		if (buscarCamino(f-1,c,'^') || buscarCamino(f+1,c,'v') || buscarCamino(f,c-1, '<') || buscarCamino(f,c+1,'>'))
			return true; //Si encuentra camino
			
			
		
		laberinto [f][c]=' '; //Si no se encuentra camino 
		return false;

		
	}
	
	
	
	public String toString() {
		
		String resultado="";
		
		
		for (int f=0; f<nFilas; f++) {
			
			for (int c=0; c<nColumnas; c++) {
				resultado += laberinto[f][c]; //Añadimos al resultado cada casilla y así rellenamos el laberinto con lo que hemos dibujado arriba y con el bucle for
			}
			
			resultado += '\n';
			 //System.out.printf("%4.0f", marco[f][c]); 

			
		}
		
		
		return resultado;
	}
	
}
