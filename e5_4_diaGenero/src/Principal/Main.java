package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String momentoDia, genero, mensaje = null;

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿Es mañana (m), tarde (t) o noche (n)? Introduzca la letra correspondiente: ");
		momentoDia = teclado.nextLine();
		System.out.println("¿Cuál es tu sexo, masculino (m) o femenino (f)? Introduzca la letra correspondiente: ");
		genero = teclado.nextLine();
		
		momentoDia = (momentoDia.toLowerCase()).substring(0,1);
		genero = (genero.toLowerCase()).substring(0,1);
		
		switch (momentoDia) {
		case "m": mensaje = "Buenos días, "; break;
		case "t": mensaje = "Buenas tardes, "; break;
		case "n": mensaje = "Buenas noches, "; break;
		default: mensaje = "Datos no válidos, "; 

		
		}
		
		switch (genero) {
		case "m": mensaje += "señor"; break;
		case "f": mensaje += "señora"; break;
		case "n": mensaje += "señore"; break;
		default: mensaje = "Datos no válidos";
		
		}
		
		System.out.println(mensaje);
		
		
	}

}
