package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float precioTarta;
		/* Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El
programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o
chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la
tarta de chocolate, el programa debe preguntar además si el chocolate es negro o
blanco; la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se
añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del
nombre 2.75. */
		
		String sabor,extra, tipoChocolate = null;
		float precio=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿De qué sabor quieres la tarta? ");
		sabor = sc.nextLine();
		
		switch (sabor) {
		
		case "manzana": 
			precio = 18f;
			break;
		case "fresa":
			precio = 16f;
			break;
		case "chocolate":
		System.out.println("¿Chocolate negro o blanco?");
		tipoChocolate = sc.nextLine();
		
		switch (tipoChocolate) {
		
		case "negro":
			precio = 14f;
			break;
		case "blanco":
			precio = 15f;
		}
		}
		
		System.out.println("¿Lo quieres con nata y nombre personalizado? Escribe ambas, nata o nombre: ");
		extra = sc.nextLine();
		
		switch (extra) {
		case "ambas":
			precio += (2.75f + 2.50f);
			break;
		case "nata":
			precio += 2.50f;
			break;
		case "nombre":
			precio += 2.75f;
			
		}
		
		System.out.println("El precio de la tarta es de "+precio);
		
		Scanner teclado = new Scanner (System.in);
		
	/*	calcularPrecioTarta(teclado);
		
		System.out.println("El precio de la tarta es"+precioTarta);*/
		
		
		
		
		
	}

		
		
		
		
		

}
