package Principal;

public class Main {

	public static void main(String[] args) 
	{
		int base=8, altura=8;
		rectangulo(base,altura);
		
		
	}
	
	public static void rectangulo (int base, int altura)
	{
		if (altura == 0) 
			return;
		else 
		{	
			linea (base);
			System.out.println();
			rectangulo(base, altura-1);
		}
	}
	
	public static void linea (int longitud) 
	{
		if (longitud ==1)
			System.out.println("*");
		else 
		{
			System.out.print("*");
			linea(longitud-1);
		}
	}

}
