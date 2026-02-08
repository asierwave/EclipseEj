package Principal;

public class Resonancia {


	private int matriz [][][]; //Inicializamos matriz de tres dimensiones;
	private int nPuntos; 


	public Resonancia(int nPuntos)
	{
		this.nPuntos = nPuntos;
		matriz = new int [nPuntos] [nPuntos] [nPuntos];




	}


	private void inicializar()
	{
		for (int f=0; f<nPuntos; f++)
			for (int c=0; c<nPuntos; c++)
				for (int p=0;p<nPuntos;p++)
					matriz[f][c][p]= (int) (Math.random()*256); //Valores entre 0 y 255 aleatorios
	}

	
	//fila, columna y profundidad nunca serán valores límites como 0, 9 (si la matriz es de 10)
	//Un punto es sospechoso cuando todos sus vecinos tienen un valor entre 20 y 40
	public boolean sospechoso (int fila, int columna, int profundidad) 
	{
		
		
		for (int i=-1;i<2; i+=2)
		{
			v= matriz[fila+i][columna][profundidad];
			if(v>20 && v<40)
		}
		
		for (int i=-1; i<2; i+=2) 
		{
			v=matriz[fila][columna][profundidad]
					if (v>20 && V<40)
		}
	
		
		public boolean sospechosoV2(int fila, int columna, int profundidad)
		{
			boolean esSospechoso=false;
			int m[][]= {
					{-1,0,0},
					{+1,0,0},
					{0,-1,0},
					{0,+1,0},
					{0,0,-1},
					{0,0,+1}};
			int v;
			for (int f=0; f<m.length; f++)
			{
				v = matriz[fila+m[f][0]][columna+m[f][1]][profunudidad+m[f][2]];
				if (v<20 || v>40)
					return false;
			}
			return true;
		}
		

		
	


	//Vamos a imprimir las diferentes rodajas del espacio tridimensional para poderlo visionarlo en pantalla 2D

	public String toString() 
	{
		String resultado="";


		for (int p=0; p<nPuntos; p++)
		{
			for (int f=0; f<nPuntos;f++)
			{
				for (int c=0; c<nPuntos; c++) {
					
					resultado += String.format("%3d  ", matriz[f][c][p]);
					resultado += "\n";

				}
				resultado += "\n\n\n";

				return resultado;
			}
		}


	
	
}
