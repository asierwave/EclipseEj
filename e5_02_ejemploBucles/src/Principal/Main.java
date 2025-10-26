package Principal;

public class Main {

	public static void main(String[] args) {
		
		for (int i=20; i<= 30; i++)  //Se ejecuta desde el valor de i 20 hasta el valor de i 30
			System.out.println(i);

		for (int i=10; i>=0; i--)   //Cuenta atrás desde 10 hasta 0
			System.out.println(i);
	
		int i;
		for (i=10; i>=1; i-=2) {  //Cuenta atrás desde 10 hasta 0 de dos en dos i= i-2
			System.out.println(i);
		System.out.println("Otro más");
			System.out.println("Ahora es: "+i);
		}
		System.out.println("El último valor registrado es: "+i); //El valor final , ya que el bucle acaba en 1, sería 0, si fuese el valor final 0, el valor final sería -2 porque se ejecuta esa última vez y el valor de i toma -2 porque se reduce

		
	}		
}
