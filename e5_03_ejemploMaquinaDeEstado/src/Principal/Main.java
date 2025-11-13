package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String frase;
		String fraseInvertida= " ";
		String palabra = " ";
		char letra;
		int estado = 0;
		
		System.out.println("Introduzca una frase: ");
		frase = sc.nextLine();
		
		for (int pos = 0; pos <frase.length(); pos++)
		{
			letra = frase.charAt(pos);
			switch (estado)
			{
			case 0:
				if (letra !=' ')
				{
					palabra = letra+""; //convertir char a String
					estado = 1;
				}
				break;
				
			case 1: 
				if (letra !=' ')
					palabra +=letra;
				else {
					fraseInvertida = palabra +" "+fraseInvertida;
					estado = 0;
				}
				break;
				
				
			} 
		}
		
		if (estado ==1) {
			
			fraseInvertida = palabra +" "+fraseInvertida;

		
			
			
		}
		System.out.println(fraseInvertida);
		sc.close();
	}

}
