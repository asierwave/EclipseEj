package Principal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Detecta el primer numero entero en una frase o una cadena
		
		
		Scanner sc = new Scanner (System.in);
		int numero;
		String cadena;
		char letra;
		System.out.println("Introduzca un entero: ");
		cadena = sc.nextLine();
		numero = 0;
		boolean numeroEncontrado = false;
		
		for (int i=0; i<cadena.length(); i++)	
		{
			
			letra = cadena.charAt(i);
			if (letra >='0' && letra <= '9') 
			{
				numero = 10 * numero + (letra -'0');  //Le restas el símbolo del 0, que es el 48
				numeroEncontrado = true;
				
			}
			else 
				
				if (numeroEncontrado ==true) {
					break;
		        }


	    }
		
        if (numeroEncontrado) {
            System.out.println("El primer número encontrado es: " + numero);
        } else {
            System.out.println("No se encontró ningún número.");
        }

        sc.close();
	}
	
	}