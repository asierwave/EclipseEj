package Principal;

public class Main {

	public static void main(String[] args) {
		
			for (int i=2; i<=150; i++)
				if (esPrimo(i))
					System.out.println(i+ " es primo");
		}
		
		//primos gemelos de 2 a 150??
		
	
	
	
		
		public static boolean esPrimo(int n)
		{
			
			//Método de bandera porque solo avisa (entra en el bucle) cuando hay un divisor y entonces no es primo
			
			boolean resultado= true; // será primo hasta que entre en el bucle
			//Un número es primo cuando el número es divisible por i
			
			for (int i=2; i<n; i++) //recorre todos los números que hay entre 2 y n
				if (n % i == 0)
					resultado= false;
					
			
			//Con que haya un divisor entre el número entre 2 y n y entra en el bucle, no es primo
			return resultado;
		
		
		}
		
	}


