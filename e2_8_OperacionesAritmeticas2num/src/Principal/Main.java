package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2, suma,resta12,resta21, multi, division12, division21, resto12, resto21;
		double elevado12, elevado21, raiz1, raiz2, cuadrado1, cuadrado2, cubo1, cubo2;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame dos números y te calculo todas las operaciones aritméticas posibles con ellos");
		num1= teclado.nextInt();
		num2= teclado.nextInt();
		
		suma= num1 + num2;
		resta12= num1 - num2;
		multi = num1 * num2;
		division12 = num1 / num2;
		resto12 = num1 % num2;
		resta21= num2 - num1;
		division21 = num2 / num1;
		resto21 = num2 % num1;
		elevado12 = Math.pow(num1, num2);
		elevado21 = Math.pow(num2, num1);
		cuadrado1 = Math.pow(num1, 2);
		cuadrado2 = Math.pow(num2, 2);
		cubo1 = Math.pow(num1, 3);
		cubo2 = Math.pow(num2, 3);
		raiz1 = Math.sqrt(num1);
		raiz2 = Math.sqrt(num2);
		
		System.out.println("Esta es la suma de ambos números: "+suma);
		System.out.printf("Esta es la resta del número %.0f, menos el número %.0f: %.0f\n", (float)num1, (float)num2, (float)resta12);
		System.out.printf("Esta es la resta del número %.0f, menos el número %.0f: %.0f\n", (float)num2, (float)num1, (float)resta21);
		System.out.println("Esta es la suma de ambos números: "+multi);
		System.out.printf("Esta es el cociente de la división del número %.0f, entre el número %.0f: %.0f y este es su resto %.0f\n", (float)num1, (float)num2, (float)division12, (float)resto12);
		System.out.printf("Esta es el cociente de la división del número %.0f, entre el número %.0f: %.0f y este es su resto %.0f\n", (float)num2, (float)num1, (float)division21, (float)resto21);
		System.out.printf("Esta es el número %.0f, elevado al número %.0f: %.0f\n", (float)num1, (float)num2, (float)elevado12);
		System.out.printf("Esta es el número %.0f, elevado al número %.0f: %.0f\n", (float)num2, (float)num1, (float)elevado21);
		System.out.printf("Esta es la raiz cuadrada del número %.1f\n", raiz1);
		System.out.printf("Esta es la raiz cuadrada del número %.1f\n", raiz2);
		System.out.println("Esta es el cuadrado del número "+num1+": "+(int)cuadrado1);
		System.out.println("Esta es el cuadrado del número "+num2+": "+(int)cuadrado2);
		System.out.println("Esta es el cubo del número "+num1+": "+(int)cubo1);
		System.out.println("Esta es el cubo del número "+num2+": "+(int)cubo2);
	}

}
