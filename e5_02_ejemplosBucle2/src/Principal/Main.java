package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int numeroSecreto;
		int numeroUsuario;
		int intentos = 0;
		
		numeroSecreto = (int) (Math.random()* 101); //Números entre 50 y 150, aleatorios pero siempre va a empezar por el primer número de la secuencia aleatoria
		System.out.println(numeroSecreto);
		
		do //aquí empieza el bucle de nuevo si no has adivinado el bucle
		{

			System.out.println("Adivina el número (0-100):");
			numeroUsuario = teclado.nextInt();
			intentos++;
			



			if (numeroUsuario == numeroSecreto) System.out.println("Acertaste!");
			else //el else if, mejor entenderlo como que es un if dentro del else
				if (numeroUsuario < numeroSecreto)
					System.out.println("El número buscado es mayor");
				else 
					System.out.println("El número buscado es menor");

		} while (numeroUsuario != numeroSecreto); // Condición de fin de bucle es que adivines el número

		
		
		System.out.println("Has necesitado "+intentos+" intentos");
		teclado.close ();

	}

}
