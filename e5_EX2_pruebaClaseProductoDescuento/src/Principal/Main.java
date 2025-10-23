package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		producto p1 =  new producto(teclado);
		producto p2 =  new producto("Lapiz",12, 10.5, false);

		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}

//Desarrollar un método llamado calcularTotal, no tiene argumentos, devuelve un double y lo que devuelve es
//el precio unitario multiplicado por la cantidad y restándole un 10% si aplica descuento