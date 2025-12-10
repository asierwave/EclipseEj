package e5_R_ejemploRecursividad;

public class Main {

	public static void main(String[] args) {

		int numero1 = 0, numero2 = 0, numero3;
		numero3 = metodoA(numero1, numero2);
		System.out.println(numero3);
	}

	
	public static int metodoA(int a, int b) {
		int resultado;
		resultado = metodoB(a);
		resultado = resultado + metodoB(b);
		return resultado;
	}

	public static int metodoB(int c) {
		c++;
		return c;
	}
	
}
