package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int hora;
		String resultado;
		
		System.out.println("¿Qué hora es? Introduce máximo dos dígitos en formato 24h: ");
		
		hora = teclado.nextInt();
		
		resultado = (hora > 0 && hora < 24) ? ((hora < 8) ? "Es de noche" : ((hora < 21 && hora > 13) ? "Es por la tarde" : ((hora < 21) ? "Es por la mañana" : "Es de noche"))) : "Hora no válida";
		
		System.out.println (resultado);
		
	}

}
