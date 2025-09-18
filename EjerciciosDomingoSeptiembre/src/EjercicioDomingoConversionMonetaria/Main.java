package EjercicioDomingoConversionMonetaria;
import java.util.Scanner;

//Abrimos la clase Main
public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner (System.in); 
		
		float cantidadEuros, cantidadDolares;
		final float conversionEuroDolar = 1.11F; 
		
		System.out.println("¿Cuantos euros quieres convertir a dolar?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
		
		cantidadEuros = teclado.nextFloat();
		
		cantidadDolares = cantidadEuros * conversionEuroDolar; 
		
		//Imprimimos en pantalla con salto de línea
		System.out.printf("Tus %.0f euros son %.0f dolares", cantidadEuros, cantidadDolares);
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		
	}

}
