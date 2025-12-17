package Principal;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		LocalDate fecha1;
		LocalDate fecha2;
		int ano2 = 0, mes2 = 0,dia2 = 0;
		boolean ano2Valido = false, mes2Valido=false, dia2Valido=false;
		
		fecha1 = LocalDate.of(2012, 11, 8);
		
		
		
		Scanner input = new Scanner (System.in);
		

			
			
		do {
			
			try {
		System.out.println("Dame el año");
		ano2=input.nextInt();
		
		
		if (ano2>-1) {
			ano2Valido = true;

		} else {
			System.out.println("El año no puede ser negativo");
			ano2Valido = false;

		}
		
			} catch (InputMismatchException e) {
			System.out.println("Introduce un número entero");
			input.nextLine();
			ano2Valido = false;

		}
			

		
		} while (!ano2Valido);
		
		
		

		
		do {
			
			try {
		System.out.println("Dame el mes");
		mes2=input.nextInt();
		
		if (mes2 >0 && mes2<13) {
			mes2Valido=true;

		} else {
			System.out.println("Introduce un mes válido (1-12)");
			mes2Valido=false;

		}
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número entero");
				input.nextLine();
				mes2Valido=false;

			}
			
		
		
		}while (!mes2Valido);
		
		
		
	
		do 
		{
			
			try {
		System.out.println("Dame el dia");
		dia2=input.nextInt();
		
		
		if (dia2 > 0 && dia2<32) {
			dia2Valido=true;

		} else {
			System.out.println("Introduce un mes válido (1-12)");
			dia2Valido=false;
		}

			} catch (InputMismatchException e) {
				System.out.println("Introduce un número entero");
				input.nextLine();
				dia2Valido=false;

			}
		} while (!dia2Valido);
		
		
	
		
		fecha2 = LocalDate.of(ano2, mes2, dia2);

		
		
		System.out.println(fecha2+ " menos "+fecha1);
	
		
		
		System.out.println(Fecha.tiempoTranscurrido(fecha1, fecha2));
		
	

		
		
	}

}
