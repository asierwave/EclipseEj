package Principal;

//importamos el Scanner de la librería java.util

import java.util.Scanner;

//Abrimos la clase Main
public class Main {

	public static void main(String[] args) {
		
		
		//Definimos teclado como variable de Scanner, System.in es la entrada estándar
		
		Scanner teclado = new Scanner (System.in); 
		
		float radio,longitud,area;
		//Declaramos la variable pi para no tener que cambiarla cada vez abajo. Si pones "final" al principio de la declaración, el valor de la variable nunca se va a poder modificar, es como el "const" en javascript 
		final float pi = 3.14159F; 
		
		System.out.println("Introduzca el radio:"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
		
		radio = teclado.nextFloat();
		
		longitud = 2 * pi * radio;
		area = pi * radio * radio;
		
		//Imprimimos en pantalla con salto de línea
		System.out.println("El area vale "+area);
		System.out.println("La longitud vale "+longitud);
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		

		//Tipos de comentario
		
		// 1 Esto es un comentario de una línea. Primer tipo de comentario
		
		/*
		 * 2 Esto es un comentario de varias líneas, los asteriscos en medio son decorativos. (2º tipo de comentario)
		 * 
		 */
		
		
		/**
		 * 3 Comentarios de java DOC, que generan automáticamente documentación en java docs (3er tipo de comentario)
		
		 */

	}

}
