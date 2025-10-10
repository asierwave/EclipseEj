package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		String tabla ="TRWAGMYFPDXBNJZSQVHLCKE"; //Tabla de equivalencias para recuperar la letra desde el resto de la división
		
		
		String nif; 
		int numero, resto;
		String numerosNif;
		char letraNif, letraCorrecta; //Declaramos variable carácter
		
		String resultado;
		
		System.out.println( "Introduzca su NIF: ");
		nif = (teclado.nextLine()).toUpperCase(); //Se pasa todo a mayúsculas para no diferenciar la letra en mayus o minus
		
		
		
	letraNif = nif.charAt(8);
	
	numerosNif = nif.substring(0,8); //El último que ponga no lo coge, osea que coge del 0 hasta la posición 7, incluída
	numero = Integer.parseInt(numerosNif);
	resto = numero % 23;
	
	letraCorrecta = tabla.charAt(resto);
	resultado = (letraCorrecta == letraNif) ? "El nif es correcto" : "El nif tiene errores";
	
	System.out.println("La letra es "+letraNif);
	System.out.println("Los dígitos son "+numerosNif);
	System.out.println("El número es "+numero+" y el resto "+resto);
	System.out.println(resultado);
	
	teclado.close();
	
	

	}


}
