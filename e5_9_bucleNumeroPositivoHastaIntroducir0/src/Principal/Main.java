package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero;
		String mensaje;
		
		Scanner teclado = new Scanner (System.in);

		
		
		do {
			
			System.out.println("Dame un número, si escribes 0, te dejo de pedir");
			numero= teclado.nextInt();
			mensaje = (numero > 0) ? " Es positivo" : ((numero < 0) ? " Es negativo" : "\n ///////////Fin del programa ////////////");
			System.out.println(numero + mensaje);
			
		} while (numero !=0);
		
		
	}

}
