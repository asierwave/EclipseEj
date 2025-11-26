package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.security.auth.login.AccountException;

public class Main {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		int opcion = 0;
		
		
		menu(input);
		
	
		
		
	}

	
	public static void menu (Scanner input) {
		int opcion = 0; 
		int ladoA, ladoB, ladoC;
		double resultadoPerimetro = 0;
		double resultadoArea = 0;


		do {
			
			try {
		System.out.println();
		System.out.println("Elige una opción");
		System.out.println("1 - Triángulo equilátero");
		System.out.println("2 - Triángulo isósceles");
		System.out.println("3 - Triángulo escaleno");
		System.out.println("4 - Salir");
		
		opcion = input.nextInt();

		if (opcion > 0 && opcion <= 4) {

		switch (opcion) {
			case 1: System.out.println("Dame el valor del lado");
			ladoA = input.nextInt();
			resultadoPerimetro = calcularPerimetro (ladoA, ladoA, ladoA);
			resultadoArea= calcularArea (ladoA, ladoA, ladoA);
			
			System.out.println(toString(resultadoPerimetro,resultadoArea));

			break;
			
			case 2: System.out.println("Dame el valor de los dos lados diferentes del triángulo");
			ladoA= input.nextInt();
			ladoB= input.nextInt();
			
			resultadoPerimetro = calcularPerimetro (ladoA, ladoA, ladoB);
			resultadoArea= calcularArea (ladoA, ladoA, ladoB);
			input.nextLine();
			System.out.println(toString(resultadoPerimetro,resultadoArea));

			break;
			case 3: System.out.println("Dame el valor de los tres lados del triángulo");
			ladoA= input.nextInt(); 
			ladoB= input.nextInt();
			ladoC= input.nextInt();
			
			resultadoPerimetro = calcularPerimetro (ladoA, ladoB, ladoC);
			resultadoArea= calcularArea (ladoA, ladoB, ladoC);

			System.out.println(toString(resultadoPerimetro,resultadoArea));
			

			break;
			
			case 4: System.out.println("///// Adiós ////");

			}
		
		} else {
			System.out.println("Introduce un número dentro del rango");
		}
		
		} catch (InputMismatchException e) {
			System.out.println("Introduce un número válido");
			input.nextLine();
		} 
		
		} while (opcion != 4);
		
		
			
	}
	
	
	
	
	
	public static String toString(double resultadoPerimetro, double resultadoArea) {
		return ("El perímetro del tríangulo será "+resultadoPerimetro+" m y el area: "+resultadoArea+" m2");
	}


	public static int calcularPerimetro (int ladoA,int ladoB, int ladoC)
	{
		int perimetro = 0;
		
		perimetro = ladoA+ladoB+ladoC;
		
		return perimetro;
		
	}
	
	
	public static double calcularArea (int ladoA,int ladoB, int ladoC)
	{
		double area = 0;
		double p;
		
		p= (ladoA+ladoB+ladoC)/2;
		
		area = Math.sqrt(p-(p-ladoA)*(p-ladoB)*(p-ladoC));
		
		return area;
		
	}
	
	
	
}
