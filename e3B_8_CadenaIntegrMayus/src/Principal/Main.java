package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		String cadena;
		String cadenaMayus;
		String cadenaMinus;
		String resultado;
		
		System.out.println("Introduzca una cadena de caracteres: ");
		cadena=teclado.nextLine();
		cadenaMayus =cadena.toUpperCase();
		cadenaMinus = cadena.toLowerCase();
		
		//Se utiliza una expresión regular para aislar solo cadenas que tengan letras y rechazar las que sean cualquier tipo de números
		resultado = (cadena.matches("^[a-zA-z]*$")) ? ((cadena.equals(cadenaMayus)) ? "Está integramente en mayúsculas" : ((cadena.equals(cadenaMinus)) ? "Está integramente en minúsculas" : "Está tanto en Mayúsculas como en Minúsculas" )) : "No hay letras"; //Para comparar valores de objetos cadena es con equals no con ==
		
		System.out.println(resultado);
		teclado.close();
		
	}

}
