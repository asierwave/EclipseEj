package Principal;

import java.util.Scanner;

public class Main {

	
public static void main(String[] args) {
		

float valorX, resultadoPolinomio;
		
Scanner teclado = new Scanner (System.in);	

System.out.println("Dame el valor de X:");
valorX = teclado.nextFloat();

resultadoPolinomio=valorX*2+3*valorX+5;

System.out.println("El resultado del poliniomio es: "+(int)resultadoPolinomio);
//Con (int) se convierte el valor a entero 

teclado.close();

	}

}