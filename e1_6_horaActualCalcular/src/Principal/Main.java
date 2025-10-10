package Principal;

//importamos el Scanner de la librería java.util

import java.util.Scanner;

//Abrimos la clase Main
public class Main {

	public static void main(String[] args) {
		
		
		//Definimos teclado como variable de Scanner, System.in es la entrada estándar
		
		Scanner teclado = new Scanner (System.in); 
		
		double segundosDesdeMedianoche, horaActual, minutoActual, segundoActual;
		
		System.out.println("¿Cuántos segundos han pasado desde medianoche?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
		
		segundosDesdeMedianoche = teclado.nextFloat();
		
		horaActual =Math.floor(segundosDesdeMedianoche/60/60);
		minutoActual = Math.floor((segundosDesdeMedianoche/60) - (60*horaActual)); 
		segundoActual = Math.floor(segundosDesdeMedianoche-(60*60*horaActual)-(60*minutoActual));
		
		
		if (horaActual < 24)
		{
		//Imprimimos en pantalla con salto de línea
		System.out.printf("Ahora mismo son las %.0f:%.0f:%.0f", horaActual, minutoActual, segundoActual);
		} else {
			//Imprimimos en pantalla con salto de línea
			System.out.printf("No es posible que hayan pasado tantos segundos desde esta medianoche");
		}
	
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		


	}

}