package EjercicioDomingoCalculoPerimetroAreaVolumen;

//importamos el Scanner de la librería java.util

import java.util.Scanner;

//Abrimos la clase Main
public class Superficie {

	public static void main(String[] args) {
		
		
		//Definimos teclado como variable de Scanner, System.in es la entrada estándar
		
		Scanner teclado = new Scanner (System.in); 
		
		float radio, perimetro,area,volumen;
		//Declaramos la variable pi para no tener que cambiarla cada vez abajo. Si pones "final" al principio de la declaración, el valor de la variable nunca se va a poder modificar, es como el "const" en javascript 
		final float pi = 3.14159F; 
		
		System.out.println("Introduzca el radio:"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
		
		radio = teclado.nextFloat();
		
		perimetro = 2 * pi * radio;
		area = pi * (radio * radio);
		volumen = (4 * pi * (radio *radio * radio))/ 3;
		
		//Imprimimos en pantalla con salto de línea
		System.out.printf("El perímetro del círculo es %.0f, el area del círculo es %.0f y el volumen de la esfera derivada es %.0f", perimetro, area, volumen);
		
	
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		


	}

}
