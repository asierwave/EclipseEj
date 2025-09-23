package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero;
		String resultado; 
		
		System.out.println ("Introduzca un número:");
		numero = teclado.nextInt();
		
		//Tengo que determinar si numero es par o impar
		
		// resultado =(numero % 2 == 0) ? "PAR" : "IMPAR";
		
		resultado = (numero==0)? "CERO":(numero%2==0)? "PAR":"IMPAR";
		
		System.out.println("El número "+numero+" es "+resultado);
		teclado.close(); 
		
		
		
	}

}
