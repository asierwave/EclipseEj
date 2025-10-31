package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numeroA, numeroB;
		String letra;
		
		System.out.println("Introduzca dos números");
		numeroA = teclado.nextInt();
		numeroB= teclado.nextInt();
		teclado.nextLine(); //Elimina el intro del buffer del teclado
		System.out.println("Introduzca (p)ares (i)mpares:");
		letra = teclado.nextLine();
		letra = letra.toLowerCase(); //Transformación en minúsculas
		letra = letra.substring(0,1); //Extrae la inicial
		
		if (letra.equals("p")) {
		
			numeroA = (numeroA % 2 == 0)? numeroA : numeroA +1; //Verificamos si número A es par y si no, sumamos 1 para conseguirlo
			for (int i=numeroA; i<= numeroB; i=i+2)
				System.out.println(i);
		}
		
		else
			if (letra.equals("i")) {
				
				numeroA = (numeroA % 2 != 0)? numeroA : numeroA +1; //Verificamos si número A es impar y si no, sumamos 1 para conseguirlo
				for (int i=numeroA; i <= numeroB; i=i+2)
					System.out.println(i);
		
			}
			
		
		teclado.close();
		
		
	}

}
