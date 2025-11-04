package Principal;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero=0;
		int numeroCifras=0;
		
		
		//Terminal
		int seleccion;
		System.out.println("¿Quieres hacer este programa con dowhile o con while? Escribe (1) para while y (2) para doWhile");
		seleccion = sc.nextInt();
		sc.nextLine();
		//-
		
	


		System.out.println("Introduzca un entero:");
		numero = sc.nextInt();


		
		switch (seleccion) {
		
		
		case 1: 
		
			
			
			
		if (numero == 0)
			numeroCifras = 1;
		else {
			while (numero !=0) {
				numeroCifras++;
				numero = numero /10;
				}
		}
		
		break;
		
		case 2:
			
			
		
		do 
		{
			numeroCifras++;
			numero = numero/10;
			
		} while (numero != 0);
		
		
		
		}
		
		System.out.println("El número tiene "+numeroCifras+" cifras.");
		sc.close();
		
		
	}

}
