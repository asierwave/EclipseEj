package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int numero = 0;
		int seleccion;
		int numeroCeros = 0;
		int sumaDigitosBinario = 0;
		boolean existeCadena = false;
		String binario = "";


		do 
		{
			
			menu();
			seleccion = input.nextInt();

			switch (seleccion) {

			case 1:

				do 
				{
					try {
					System.out.println("Introduce un número decimal mayor que cero y te lo paso a binario: ");
					numero = input.nextInt();

					if (numero >= 0) {
				
					binario= DecimalParaBinarioInvertido(numero, binario);
					binario = invertirParaBinario (binario);
					
					numeroCeros = 0; //Inicializamos a cero, cada vez que pedimos un nuevo número decimal
					numeroCeros = calcularCerosBinario (numeroCeros, binario);
					
					sumaDigitosBinario = 0;//Inicializamos a cero, cada vez que pedimos un nuevo número decimal
					sumaDigitosBinario = sumarDigitosBinario(sumaDigitosBinario, binario);
					
					
					System.out.println("El numero decimal "+numero+" en binario es: "+binario+" y la cadena tiene "+numeroCeros+" ceros");
					System.out.println("La suma de las cifras del binario es "+sumaDigitosBinario);
					if (verificarBinario(binario,existeCadena)) {
						System.out.println("En esta cadena la cadena 101 existe");
					}
					System.out.println();
					
					}
					else {
					System.out.println("Error: El número es menor que cero");
					System.out.println();
					}

					
					} catch (InputMismatchException e) {
						System.out.println("Error: Introduce un número");
						System.out.println();
						input.nextLine();
					}

				} while (numero > 0);

				break;
				
			case 2: 
				System.out.println("///////////Has salido del programa/////////");
				

			}

			} while (seleccion != 2);

		}





		public static String DecimalParaBinarioInvertido (int numero, String binario) {

			binario = ""; //Para inicializar la cadena cada vez que se llame al método para que no se empalmen cadenas guardads

			do {

				if (numero == 1) {
					binario = binario + numero % 2;
				} else {
					binario = binario + numero % 2;
					numero = numero/2;

					if (numero/2 == 0) {
						binario = binario + numero % 2;
					}
				}

				// Para checkear las cifras a invertir:
				// System.out.println(binario);

			} while (numero/2 != 0);
			return binario;
		}


		public static void menu() {

			System.out.println("Selecciona una opción");
			System.out.println("1- Calcular binario a partir de decimal");
			System.out.println("2- Salir del programa");

		}



		public static String invertirParaBinario (String binario) {

			String aux= "";


			int caracteresTotales=binario.length();
			// System.out.println(caracteresTotales); //Para comprobar cantidad de carácteres que está cogiendo

			for(int i=(caracteresTotales-1); i!=-1; i--) 
			{

				aux = aux + binario.charAt(i);


			}
			return aux;


		}
		
		
		public static boolean verificarBinario (String binario, boolean existeCadena) {
			
			if (binario.substring(0,binario.length()) =="101") {
				return true;
			}
		return false;
			
		}
		
		
		public static int calcularCerosBinario (int numeroCeros, String binario) {
			
			
			for(int i=0; i< binario.length(); i++) {
				
				if (binario.charAt(i)== '0') 
					numeroCeros++;
				
			}
			return numeroCeros;
			
		}
		
		
		public static int sumarDigitosBinario (int sumaDigitosBinario, String binario) {
			int cifraBinario;
			for(int i=0; i< binario.length(); i++) {
				
			cifraBinario = (int)binario.charAt(i)-'0'; // para pasar de caracter a binario hay que restarle el caracter 0
			sumaDigitosBinario=sumaDigitosBinario+cifraBinario;
				
			}
			return sumaDigitosBinario;
		}
		
		
		//Casos de prueba 2: 11000, 3 ceros, suma de digitos = 2
		//Caso de prueba 1: 1, 0 ceros, suma de digitos = 1



	}
