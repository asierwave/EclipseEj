package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int numero = 0;
		boolean esNumeroAfortunado = false;
		boolean empateAfortunado = false;

		//Digitos de la suerte 3, 7, 8 y 9
		//Digitos de la mala suerte 0, 1, 2, 4, 5 y 6

		do
		{
			try {

			muestraMenu();
			numero = input.nextInt();

			switch (numero) { 

			case 1:
				do 
				{
					System.out.println("Dame un número positivo, un numero negativo saldrá al menu principal: ");
					numero = input.nextInt();

					esNumeroAfortunado= esNumeroAfortunado(esNumeroAfortunado, numero);
					empateAfortunado= esNumeroEmpate(empateAfortunado, numero);

					
					System.out.println(mostrarMensaje(esNumeroAfortunado,empateAfortunado, numero));
					System.out.println();
					
				} while (numero >= 0);
				 
				System.out.println("--Menu principal--");
				System.out.println();
				
				break;


			case 2:
				System.out.println("//////////Has salido del programa///////////");
				System.out.println();

			default:
				System.out.println("Introduce una de las opciones especificadas");
				System.out.println();

			}
			
			} catch (InputMismatchException e) {
				System.out.println("Error: Introduce un número de los especificados");
				input.nextLine();
				System.out.println();
			}

		} while (numero != 2);


	}

	public static boolean esNumeroAfortunado(boolean numeroEsAfortunado,int numero) {

		String numeroEnCadena= null;
		int cifrasAfortunadas = 0, cifrasNoAfortunadas = 0;
		numeroEsAfortunado = false;
		
		numeroEnCadena=numeroEnCadena + numero;
		char aux;

		for (int i=0; i<numeroEnCadena.length(); i++) {

			aux = (char)i;
			
				switch (numeroEnCadena.charAt(i)) {
				case '3': 
				case '7':
				case '8': 
				case '9': cifrasAfortunadas++;;break;
	
				case '0': 
				case '1':
				case '2':
				case '4':
				case '5':
				case '6': cifrasNoAfortunadas++;; break;
		
	
				}
			


		}
		
		if (cifrasAfortunadas > cifrasNoAfortunadas) 
			numeroEsAfortunado=true;
		
		
		
		//System.out.println(numeroEsAfortunado);
		return (numeroEsAfortunado);

	}
	
	
	public static boolean esNumeroEmpate(boolean empateAfortunado, int numero) {

		String numeroEnCadena= null;
		int cifrasAfortunadas = 0, cifrasNoAfortunadas = 0;
		empateAfortunado= false;
		
		numeroEnCadena=numeroEnCadena + numero;
		char aux;

		for (int i=0; i<numeroEnCadena.length(); i++) {

			aux = (char)i;
			
				switch (numeroEnCadena.charAt(i)) {
				case '3': 
				case '7':
				case '8': 
				case '9': cifrasAfortunadas++;;break;
	
				case '0': 
				case '1':
				case '2':
				case '4':
				case '5':
				case '6': cifrasNoAfortunadas++;; break;
		
	
				}
			


		}
	
		if (cifrasAfortunadas == cifrasNoAfortunadas) {
			empateAfortunado = true;
		}
		
		

		//System.out.println(numeroEsAfortunado);
		return (empateAfortunado);

	}


	public static void muestraMenu () {
		System.out.println("Elige una opción: ");
		System.out.println("1 - Introduce un número y te diré si es afortunado");
		System.out.println("2 - Salir del programa");

	}
	
	
	public static String mostrarMensaje(boolean esNumeroAfortunado,boolean empateAfortunado, int numero) {
		
		String mensaje;
	
		if (esNumeroAfortunado) {
			mensaje= "El numero "+numero+" es afortunado, enhorabuena";
		} else if (empateAfortunado) {
				mensaje ="El numero "+numero+" no es afortunado ni no afortunado";
			} else {
			mensaje ="El numero "+numero+" no es afortunado, lo siento";
			}
		
		return mensaje;

	}

}
