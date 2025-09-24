package Principal;

import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int diaNacimiento, mesNacimiento, anoNacimiento, fechaNacimiento;
		
		
		System.out.println ("Dime tu dia de nacimiento: ");
		diaNacimiento = teclado.nextInt();
		
		System.out.println ("Dime tu mes de nacimiento: ");
		mesNacimiento = teclado.nextInt();
		
		System.out.println ("Dime tu año de nacimiento: ");
		anoNacimiento = teclado.nextInt();
		
		
		//Forma 2 de capturar información de una tacada
		System.out.println("Dime tu dia mes y año de nacimiento para recogerlo de un tirón:");
		diaNacimiento = teclado.nextInt();
		mesNacimiento = teclado.nextInt();
		anoNacimiento = teclado.nextInt();

		
		//Todo lo que no guardemos se quede almacenado en buffer hasta que finaliza el programa

		//Imprimir en con salto de línea
		System.out.println("Tu fecha de nacmiento es el (v1) "+diaNacimiento+"/"+mesNacimiento+"/"+anoNacimiento);
		
		
		//Imprimir con mas versatilidad (con formato), no salta al final de línea porque no es printf, se necesitaría un simbolo de salto de línea: \n, \\n (salta dos líneas), \r también válido.
		System.out.printf("Tu fecha de nacimiento es el %02d/%02d/%d\n (v2)", diaNacimiento, mesNacimiento, anoNacimiento);

		teclado.close();
	}

}
