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
		
		
		//Lo he hecho con GPT porque no tenía ni idea
		System.out.printf("Tu fecha de nacimiento es el %02d/%02d/%d\n", diaNacimiento, mesNacimiento, anoNacimiento);

		

	}

}
