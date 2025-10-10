package Principal;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		String frase;
		String char1="a";
		String char2="-";
		String char1A="A";
		
	
		
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Dame una frase: ");
		frase = teclado.nextLine();
		

		
		frase= frase.replace(char1A,char1);
		frase= frase.replace(char1,char2);
		
		System.out.println(frase);
	}

}
