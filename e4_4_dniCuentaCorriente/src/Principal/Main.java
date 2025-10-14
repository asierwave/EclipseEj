package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		cuentaCorriente c1 = new cuentaCorriente(teclado, 0);
		teclado.nextLine(); //Con esto evitamos que el intro se quede en el buffer

		System.out.println(c1);
		
	}
	

}
