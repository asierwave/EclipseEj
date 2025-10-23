package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Desarrolle un programa a que solicite una nota de 0 a 10 al usuario y la transforme a la
		//forma: Insuficiente, Suficiente, Bien, Notable o Sobresaliente. Los rangos de cada
		//grupo son menor que 5 Insuficiente, menor que 7 Bien, menor que 9 Notable y en caso
		//contrario Sobresaliente.
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame una nota");
		float nota = teclado.nextFloat();
		String calificacion;
		

		if (nota < 0) calificacion = "Nota Incorrecta";
		else if (nota < 5)calificacion = "Insuficiente"; //Como solo tiene una instrucción no se ponen llaves
		else if (nota < 6)calificacion = "Suficiente";
		else if (nota < 7)calificacion = "Bien";
		else if (nota < 8)calificacion = "Notable";
		else if (nota < 9)calificacion = "Notable";
		else if (nota < 10)calificacion = "Sobresaliente";
		else calificacion = "Nota Incorrecta"; 
		
		teclado.close();
		
		System.out.println(calificacion);
		
		//Si en un rango se incluye uno de los números se pone con corchete, si no, con paréntesis [0,5) por ejemplo, el 0 si, el 5 no se incluye

		
	}

}
