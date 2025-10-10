package Principal;

import java.util.Scanner;

public class Main {

		
		public static void main(String[] args) {

					
			Scanner teclado = new Scanner (System.in);
			float examenTeo1,examenTeo2,examenTeo3, examenLab;
			
			
			System.out.println("¿Qué sacaste en el primer examen teórico?");
			
			
			examenTeo1 = teclado.nextFloat();
			
			System.out.println("¿Qué sacaste en el segundo examen teórico?");
		
			examenTeo2 = teclado.nextFloat();
					
			
			System.out.println("¿Qué sacaste en el examen de laboratorio?");
			
			examenLab = teclado.nextFloat();
			
			//Entradas verificación
			if (examenTeo1 < 0 || examenTeo1 > 10 || examenTeo2 < 0 || examenTeo2 > 10 || examenLab < 0 || examenLab > 10) {
				System.out.println("Error. Introduce notas en el rango de 0 a 10");
			} else {
				examenTeo3 = (((5 - (examenLab * 0.3f))/0.7f) * 3f) - examenTeo1 - examenTeo2;
			
			// Salidas verificación
		    
		    if (examenTeo3 > 10) {
				System.out.println("No puedes aprobar, tendrías que sacar mas de un 10 en el tercer parcial");

			} else if (examenTeo3 < 0) {
				System.out.println("Saques la nota que saques, estás aprobado, incluso con un 0 ");

			} else {
				System.out.printf("Esta es la nota que tienes que sacar en el tercer parcial teórico apra aprobar: %.1f", examenTeo3);

			}
					
			}
			
			teclado.close();
			
			
	}

			
		}

	
	
