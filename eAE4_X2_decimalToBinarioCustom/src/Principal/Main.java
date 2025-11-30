package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numeroDecimal = 0;
		int cociente = 0;
		int resto;
		String binarioAlReves;
		String binario;
		Scanner input = new Scanner (System.in);
		
		do {
			System.out.println("Dame un número por encima de cero para pasar a binario, cualquier otro número abortará el programa: ");
			numeroDecimal = input.nextInt();
			
			System.out.println(numeroDecimal);

			
			binarioAlReves = pasarABinarioReves(numeroDecimal);
			binario =invertirCadena(binarioAlReves);
			
			System.out.println(binarioAlReves + "+"+binario);
	

		} while (numeroDecimal > 0);
	}

	
	   public static String pasarABinarioReves(int numero) {
	        String binario = "";
	        while (numero > 0) {
	            binario = binario + (numero % 2);  
	            numero = numero / 2;
	        }
	        return binario;
	    }
	
	
	
	   public static String invertirCadena(String texto) {
		    String binarioInvertido = "";
		    for (int i = texto.length() - 1; i >= 0; i--) {
		        binarioInvertido = binarioInvertido + texto.charAt(i);
		    }
		    return binarioInvertido;
		}

}
