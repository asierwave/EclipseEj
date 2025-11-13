package Principal;

import java.util.Scanner;

//Realizar un programa que pida al usuario un número y presetnte los números del 1 al número que 
//introdujo el usuario. Repetir este ejercicio con todos los tipos de bucles (for, while y do-while) 


public class Main {

	public static void main(String[] args) {


		String seleccion;
		int numero=0;
		int n = 0;

		Scanner sc = new Scanner (System.in);


		System.out.println("Dame una forma de resolver el problema,escribe: for, while o do while");
		seleccion = sc.nextLine().toLowerCase();



		switch (seleccion) {

		case "for":


			System.out.println("Dame un número y te doy los números hasta ese número desde el 1: ");
			numero = sc.nextInt();
			sc.nextLine();


			for (n=1; n<numero; n++) {
				System.out.println(n);	
			}


			break;

		case "while":


			System.out.println("Dame un número y te doy los números hasta ese número desde el 1: ");
			numero = sc.nextInt();
			sc.nextLine();


			while (numero > n) {
				System.out.println(n);
				n++;

			}

			break;



		case "do while":

			n=1;

			System.out.println("Dame un número y te doy los números hasta ese número desde el 1: ");
			numero = sc.nextInt();
			
			

			do {
				
				System.out.println(n);
				n++;

			

			} while (n < numero);


			break;

		}

		sc.close();
	}

}
