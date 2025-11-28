package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int decimal = 0,cociente = 0, resto, opcion;
		int acumuladorResto;
		Scanner input = new Scanner (System.in);
		
		do {
			System.out.println("Dame un número por encima de cero para pasar a binario, cualquier otro número abortará el programa: ");
			opcion = input.nextInt();
			decimal=opcion;
			System.out.println(decimal);

		
			while (decimal/2 != 0){
			
			resto=decimal%2;
			acumuladorResto =+resto;
			cociente=decimal/2;
			System.out.print(resto+" ");
			decimal = decimal/ 2;
			
		} 
			System.out.print(cociente);
			System.out.println();

		} while (opcion > 0);
	}

	
	//falta invertirlos
}
