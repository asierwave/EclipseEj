package Principal;

import java.util.Scanner;


public class Main {

	//Escriba un programa que cuente el número de vocales en una cadena de texto proporcionada por el usuario.

	public static void main(String[] args) {

		String frase;
		int contador = 0;
		char caracterFrase;
		
		Scanner teclado = new Scanner (System.in);

		System.out.println("Dame una frase y te digo cuantas vocales tienes en ella: ");
		frase = teclado.nextLine();
				frase = frase.toLowerCase();

		int longitudFrase= frase.length();

		for (int i=0; i<=longitudFrase-1; i++) { //Siempre uno menos porque el index va de 0 a length-1, porque empieza en 0
			

			caracterFrase = frase.charAt(i);


			switch (caracterFrase)
			{
			case 'a':
			case 'i':
			case 'e':	
			case 'o':	
			case 'u':contador++; break;

			}

		}

		System.out.println("La palabra tiene "+contador+" vocales");
teclado.close();
	}

}
