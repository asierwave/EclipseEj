package EjercicioDomingoMediaDesviacion;


import java.util.Scanner;

//Abrimos la clase Main
public class MediaDesviacion {

	public static void main(String[] args) {
		
		
		//Definimos teclado como variable de Scanner, System.in es la entrada estándar
		
		Scanner teclado = new Scanner (System.in); 
		
		float numero1, numero2, numero3, numero4, mediaAritmetica, DesviacionTipica;
		//Declaramos la variable pi para no tener que cambiarla cada vez abajo. Si pones "final" al principio de la declaración, el valor de la variable nunca se va a poder modificar, es como el "const" en javascript 
		
		System.out.println("Dame el primer número?");
		
		numero1 = teclado.nextFloat();
		
		System.out.println("Dame el segundo número?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
				
		numero2 = teclado.nextFloat();
		
		System.out.println("Dame el segundo número?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
				
		numero3 = teclado.nextFloat();
		
		System.out.println("Dame el segundo número?"); //sysout (CTRL + BARRA ESPACIADORA + INTRO para crear este comoando)
				
		numero4 = teclado.nextFloat();
		
		mediaAritmetica = (numero1 + numero2 + numero3 + numero4)/4;
		
		
		
		System.out.printf("La media aritmétic es %.0f", mediaAritmetica);
	
	
		
		//Cierras la introducción de datos con esta expresión para evitar consumos absurdos. Última instrucción que debería tener un programa
		teclado.close(); 
		


	}

}