package Principal;
enum Tipo { // creamos el valor Tipo, con los siguientes valores:
	CRECIENTE,
	DECRECIENTE,
	VARIANTE
}


public class Main {

	public static void main(String[] args) {
	
	//Declaramos variables	
		
	// 1 // LLAMA A METODO RECURSIVO SIN ENUMERADO
	int n = 425;
	boolean resultado;
	///////////
	// 2 // LLAMA A MÉTODO ENUMERADO TIPO
	int g= 1234;
	Tipo resultado2;
	////////
	// 3 // LLAMA A MÉTODO INTERFAZ (GET)
	int s= 123;
	Tipo resultado3;
	/////
	
	
	//Llamamos a cada método e imprimimos
	

	//1
	resultado = esCreciente(n);
	System.out.println(n+" "+resultado);
	///////
	//2 
	resultado2 = queTipoTiene(g, '>');
	if (resultado2 == Tipo.VARIANTE)
		resultado2 = queTipoTiene(g, '<');
	System.out.println(g+" es "+resultado2);
	///////
	// 3
	resultado3 = getTipo(s);
	System.out.println(s+" "+resultado3);
	/////
	
	
	}

		///////MÉTODO 1////////
		
		public static boolean esCreciente (int n) {
			// Lo reducimos al caso base, que es de una cifra, osea que es menor de 10
			
			boolean creciente;
			int digito;
			if (n<10) 
				creciente = true;
			
			else 
			{
				digito = n%10;
				n = n/10;
				
				if (digito >= n%10) 
					creciente = esCreciente(n/10);
				 else 
					creciente = false;
				
				}
			return creciente;	
		
	}
		
		
		///////MÉTODO 2////////

		
		public static Tipo queTipoTiene (int g, char operador) {
			Tipo resultado2;
			int digito;
			
			if (g<10)
				//Hacemos un ternario en el que da un valor a la variable tipo dependiendo del signo que pongamos > o < u otro
				resultado2 = (operador == '>') ? Tipo.DECRECIENTE : Tipo.CRECIENTE;
			else 
			{
				digito = g%10;
				g= g/10;
				if ((digito >= g%10 && operador == '<') || (digito <= g%10 && operador == '>'))
					resultado2 = queTipoTiene(g, operador);
				else
					resultado2 = Tipo.VARIANTE;
					}
			return resultado2;
		}

		
		///////MÉTODO 3////////

		
		public static Tipo getTipo (int s)
		{
			Tipo resultado3;
			resultado3 = queTipoTiene(s, '>');
			if (resultado3 == Tipo.VARIANTE)
				resultado3 = queTipoTiene(s, '<');
			return resultado3;
		}
		
		
}

