package EjercicioDomingoHoraActual;

//importamos el Scanner de la librería java.util

import java.util.Scanner;

//Abrimos la clase Main
public class Hora {

	public static void main(String[] args) {
		
		
		//Definimos teclado como variable de Scanner, System.in es la entrada estándar
		
		Scanner teclado = new Scanner (System.in); 
		
		float segundosDesdeMedianoche, horaActual, medianocheEnSegundos = 24 * 60 * 60;
		//Declaramos la variable pi para no tener que cambiarla cada vez abajo. Si pones "final" al principio de la declaración, el valor de la variable nunca se va a poder modificar, es como el "const" en javascript 
		
		System.out.println("¿Cuántos segundos han pasado desde medianoche?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
		
		segundosDesdeMedianoche = teclado.nextFloat();
		
		horaActual = 24-((medianocheEnSegundos - segundosDesdeMedianoche) / 60 / 60);
		
		
		if (horaActual < 24)
		{
		//Imprimimos en pantalla con salto de línea
		System.out.printf("Ahora mismo son las %.4f", horaActual);
		} else {
			//Imprimimos en pantalla con salto de línea
			System.out.printf("No es posible que hayan pasado tantos segundos desde esta medianoche");
		}
	
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		


	}

}