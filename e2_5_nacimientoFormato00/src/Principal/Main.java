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
		
		
		//Para imprimir enteros con formato es con printf pero %d, si quieremos meter un cero antes del entero %02d, si queremos imprimir decimal podemos modificar la cantidad de ceros en con %.3f, que serían 3 ceros.
		System.out.printf("Tu fecha de nacimiento es el %02d/%02d/%d\n", diaNacimiento, mesNacimiento, anoNacimiento);


	}

}
