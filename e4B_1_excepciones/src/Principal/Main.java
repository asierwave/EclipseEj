package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		int opc;
		
		do {
			opc = menu (teclado);
		
			switch (opc) {
				case 1: System.out.println("Has elegido 1"); break;
				case 2: System.out.println("Has elegido 2"); break;
				case 3: System.out.println("Has elegido 3"); break;
				case 4: System.out.println("Has salido"); break;
			}

		} while (opc != 4);		


		teclado.close();


	}


	public static int menu (Scanner sc) {

	int opcion;

	do{

		System.out.println("1 - Opción uno");
		System.out.println("2 - Opción dos");
		System.out.println("3 - Opción tres");
		System.out.println("4 - Salir");
		System.out.println("Opcion");
try 
{
		opcion = sc.nextInt();		
		System.out.println("Elija");
}
catch (InputMismatchException e)
{
	opcion = 0; //Le doy un valor de Opción incorrecta a cualquier valor introducido que produzca excepción
	sc.nextLine(); //Vaciamos el buffer para que no se quede en bucle la opción 0 para siempre
}

finally //siempre se ejecuta haya o no excepciones
{
	
	//se usa por ejemplo cerrar ejecuciones, ficheros bloqueados, para liberar una dependencia utilizada, libera recursos
	//que hemos ocupado o usado previamente
	System.out.println("Esto se ejecuta siempre");
	
}	
	
	
	
		if (opcion <1 || opcion > 4)
			System.out.println("Opcion incorrecta");
	} while (opcion <1 || opcion > 4);
	return opcion;

}

}
