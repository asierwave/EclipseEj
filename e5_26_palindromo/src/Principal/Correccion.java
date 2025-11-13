package Principal;

import java.util.Scanner;

public class Correccion {

	public void correccion()  {
	
	Scanner sc = new Scanner (System.in);
	String frase;
	boolean esPalindromo = true;
	int longitud;
	
	System.out.println("Introduzca una frase: ");
	frase = sc.nextLine();
	longitud = frase.length();
	
	for (int pos=0; pos <longitud; pos++)
		if (frase.charAt(pos)!= frase.charAt(longitud-1-pos))
			esPalindromo = false;
	
	if (esPalindromo)
		System.out.println(frase+ " es un palindromo");
	else
	System.out.println(frase + " no es un palindromo");
	
	
	sc.close();
	}
	
	
}
