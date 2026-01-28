package ResueltoClase;

public class Tablero {

	
	private char tablero [][];
	private boolean ganador;
	
	public Tablero() 
	{
		tablero = new char[3][3];
		inicializar();
	}
	
	
	public void inicializar()
	{
		for (int f=0; f<tablero.length; f++)
			for (int c=0; c<tablero[0].length; c++)
				tablero [f][c]='-';
				
				
	}
	
	
	
	//método para imprimir matriz
	public String toString()
	{
		String resultado = "";
		resultado += "TABLERO\n";
		resultado += "=======\n";
		
		
	for (int f=0; f<tablero.length; f++) {

		for (int c=0; c<tablero[0].length; c++) 
			resultado += " "+tablero[f][c];
		
		
		resultado += "\n";
		
		
	}
		
		return resultado;
	}	//toString()

	
	
	
	
	public boolean mover (int fila, int columna, char ficha) {
		
		boolean exito = true;
		
		//evitamos que la introducción de fila y columna esté fuera de los límites de tamaño de la matriz
		if (fila <0 || fila >= 3 || columna <0 || columna >= 3)
			exito = false;
		else
		{
			if (tablero [fila][columna] == '-') {
				tablero [fila] [columna] = ficha;
				ganador = hayGanador(fila,columna,ficha); //verificador de haber ganado
			}
			else 
				exito = false;
		}
		
		
		return exito;
	}
	
	
	public boolean moverIA (char ficha) {
		
		boolean exito = false;
		for (int f=0; f<tablero.length; f++)
			for (int c=0; c<tablero[0].length; c++)
				if (tablero [f][c]=='-')
				{
					tablero [f][c] = ficha;
					exito=true;
					hayGanador(f,c,ficha); //verificador de haber ganado

					return exito;
				}
		
		return exito;
		
		
	}
	
	
public boolean moverIARandom (char ficha) {
		
	
		int f,c;
		boolean exito;
		
		do
		{
	
		f = (int)(Math.random()*3);
		c = (int)(Math.random()*3);

		if (tablero [f][c]=='-')
		{
			tablero [f][c]= ficha;
			exito = true;
			
			hayGanador(f,c,ficha); //verificador de haber ganado
		}
		else
			exito = false;
		
		}while (exito == false);

		return exito;
		
		
	}


public boolean completo() {
		
	
	for (int f=0; f<tablero.length; f++)
		for (int c=0; c<tablero.length; c++)
			if (tablero [f][c]=='-')
				return false;
			
	return true;
	
}


///???????????
public boolean hayGanador (int fila, int columna, char ficha) {
	//Comentamos las salidas de los booleanos verificadores
	//System.out.println(hayGanadorH (fila,columna,ficha));
	//System.out.println(hayGanadorV (fila,columna,ficha));
	//System.out.println(hayGanadorD(fila, columna,ficha));
	//System.out.println(hayGanadorS(fila,columna,ficha));
	
	return hayGanadorH (fila,columna,ficha)|| hayGanadorV (fila,columna,ficha)||hayGanadorD(fila, columna,ficha)||hayGanadorS(fila,columna,ficha);
}




public boolean hayGanadorH (int fila, int columna, char ficha){
	
	//verificar hacia la izquierda
	int contador;
	contador = 1; //la ficha desde la que se empieza a verificar, siempre habrá uno porque es la jugada
	
	for (int c=columna-1; c>= 0; c--) //verificamos la anterior posición en la fila respecto a la posición en que ponemos la ficha (columna)
		if (tablero [fila][c]==ficha)
			contador ++;
		else
			break;
	
	
	//verificar hacia la derecha
	for (int c=columna+1; c<tablero[0].length; c++) 
		
		if (tablero [fila][c]==ficha)
			contador ++;
		else
			break;
	
	
	
	if (contador == 3) //si el contador es 3, gana juego
		return true;
	else
		return false;
		
		
}


public boolean hayGanadorD(int fila, int columna, char ficha) { //verificamos diagonal principal
	int contador = 1;
	
	for (int f = fila-1, c=columna-1; f>=0&&c>=0; f--,c--) //el operador , sirve para hacer varias cosas en un solo,ugar
		if (tablero [f][c]==ficha)
			contador ++;
		else
			break;
	
	
	for (int f = fila+1, c=columna+1;  f < tablero.length && c < tablero[0].length; f++,c++) //el operador , sirve para hacer varias cosas en un solo,ugar
		if (tablero [f][c]==ficha)
			contador ++;
		else
			break;
	
	
	
	if (contador ==3)
		return true;
	else
		return false;
}


public boolean hayGanadorS(int fila, int columna, char ficha) { //verificamos diagonal secundaria
	int contador = 1;
	
	for (int f = fila+1, c=columna-1; f < tablero.length && c >= 0; f++,c--) //el operador , sirve para hacer varias cosas en un solo,ugar
		if (tablero [f][c]==ficha)
			contador ++;
		else
			break;
	
	
	for (int f = fila-1, c=columna+1; f >= 0 && c < tablero[0].length; f--,c++) //el operador , sirve para hacer varias cosas en un solo,ugar
		if (tablero [f][c]==ficha)
			contador ++;
		else
			break;
	
	
	
	if (contador ==3)
		return true;
	else
		return false;
}





public boolean hayGanadorV (int fila, int columna, char ficha){ //verificamos vertical
	
	//verificar hacia la izquierda
	int contador;
	contador = 1; //la ficha desde la que se empieza a verificar, siempre habrá uno porque es la jugada
	
	for (int f=fila-1; f>= 0; f--) //verificamos la anterior posición en la fila respecto a la posición en que ponemos la ficha (columna)
		if (tablero [f][columna]==ficha)
			contador ++;
		else
			break;
	
	
	//verificar hacia la derecha
	for (int f=fila+1; f<tablero.length; f++)
		
		if (tablero [f][columna]==ficha)
			contador ++;
		else
			break;
	
	if (contador == 3) //si el contador es 3, gana juego
		return true;
	else
		return false;
		
		
}




//retornamos ganador para acceder desde la clase MAIN
public boolean getGanador() {
	return this.ganador;
}
	
	
}
