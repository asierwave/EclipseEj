package Principal;

import java.util.Scanner;

public class refactorizado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeroA, numeroB;
		int a = 0,b = 0;
		String letra;
		
		System.out.println("Introduzca dos números");
		a = teclado.nextInt();
		b= teclado.nextInt();
		teclado.nextLine(); //Elimina el intro del buffer del teclado
		System.out.println("Introduzca (p)ares (i)mpares:");
		letra = teclado.nextLine();
		letra = letra.toLowerCase(); //Transformación en minúsculas
		letra = letra.substring(0,1); //Extrae la inicial
		
		
		//Para ordenar el rango de los dos números y que genere bien la secuencia de pares o impares
		
		numeroA = (a<b) ? a:b; //Menor 
		numeroB = (a>b) ? a:b; //Mayor
	
			if (letra.equals("p") || letra.equals("i")) {
				
				switch (letra) {
				case "p": numeroA = (numeroA % 2 == 0)? numeroA: numeroA+1; break;
				case "i": numeroA = (numeroA%2 != 0) ? numeroA: numeroA+1; break;
				}
				
				for (int i=numeroA; i <= numeroB; i=i+2)
					System.out.println(i);
		
			}
			
		
		teclado.close();
		
		
	}

}