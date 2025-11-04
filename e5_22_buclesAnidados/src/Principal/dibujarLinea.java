package Principal;

public class dibujarLinea {

	
	public static void dibujaLinea(int longitud) {
		for (int i=0; i<longitud; i++)
			System.out.println("*");
		System.out.println(" ");
	}
	
	
	public static void dibujaCuadrado(int lado)
	{
		for (int fila=0; fila<lado; fila++)
		{
			dibujaLinea(lado);
		}
	}
	
	
	
}
