package Principal;

public class Main {

	public static void main(String[] args) {
		
		int r,e;
		r = suma(3);
		e= potencia(2,4);
		System.out.println(r+" "+e);
		
	}
	
	public static int suma (int n) {
		int resultado;
		if (n==0) 
			resultado = 0;
		else
			resultado = suma(n-1)+n;
		return resultado;
	}
	
	public static int potencia(int base, int exponente) {
		int resultado;
		
		if (exponente == 0) {
			resultado = 1;
		} else {
			resultado = potencia(base,exponente-1)*base;
		}
		
		return resultado;
	}

}
