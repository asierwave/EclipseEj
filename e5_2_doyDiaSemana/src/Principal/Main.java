package Principal;

import java.util.Scanner;

public class Main {
	
	//2.⁠ ⁠Desarrolle un programa que solicite un número entero del 1 al 7, y muestre por
			//pantalla el correspondiente día de la semana. Utilice la estructura if-else

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número entero entre el 1 y el 7");
		int num= teclado.nextInt();
		
			
			switch (num) {
			case 1: 
				System.out.println("Es Lunes");
				break;
			case 2: 
				System.out.println("Es Martes");
				break;
			case 3: 
				System.out.println("Es Miércoles");
				break;
			case 4: 
				System.out.println("Es Jueves");
				break;
			case 5: 
				System.out.println("Es Viernes");
				break;
			case 6: 
				System.out.println("Es Sábado");
				break;
			case 7: 
				System.out.println("Es Domingo");
				break;
			default:
				System.out.println("No es un número del 1 al 7, inténtalo otra vez");
			}

	}

}
