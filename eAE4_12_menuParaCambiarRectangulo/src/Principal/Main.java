package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int op; //
		int ancho, alto; 
		
		ancho =3;
		alto = 4;
		String caracter = "*";

		
		do 
		{			
			
			dibujarRectangulo(ancho,alto,caracter); //Dibuja la interfaz del menú con los parámetros del método le damos el valor inicial

			op = menu(teclado); //devuelve la opción escogida por el usuario en el metodo de abajo. 
			//y ahora lo pasamos para que triggeree los distintos casos. Se llama al método menu y su resultado (en el return)
			switch (op)
			{
			case 1: 
				ancho++;
				alto++;
				break;
			case 2:
				if (ancho >2 && alto >2) {
				ancho--;
				alto--;
				}
				break;
			case 3:
				int auxiliar= ancho;
				ancho = alto;
				alto = auxiliar;
				break;
				
			case 4:
				
				System.out.println("Dame otro caracter para dibujar");
				caracter = teclado.next();
				teclado.nextLine();

				break;
				
			case 5: 
				System.out.println("//////////////////// bye ////////////////////////");

			}

		} while (op!=5); //mientras no sea el caso 4
		teclado.close();

	}
	
	////////////////////////////////////////////
	//Declaramos con el valor que se mete arriba en el main en los parametros las variables locales ancho y altura
	public static void dibujarRectangulo (int ancho, int altura, String caracter) //ahora son parametros, no variables locales, por lo que se pueden introducir desde fuera y declarar desde fuera
	{


		
		for (int fila=0; fila < altura; fila++) {
	for (int columna=0; columna < ancho; columna++)
		if (fila == 0 || columna == 0 || columna == ancho-1 || fila == altura-1)
			System.out.print(caracter);
		else 
			System.out.print(" "); //dibuja espacio en blanco vacio
	
	System.out.println();
		
		}
	}
	
	public static int menu (Scanner sc) { 
		//todo lo que se declara dentro de aquí, solo existe dentro de aquí, como opcion...
		
		int opcion; //variable local es exclusiva de este sitio
		
		do 
		{
			System.out.println("1 - Agrandarlo");
			System.out.println("2 - Achicarlo");
			System.out.println("3 - Cambiar la orientación");
			System.out.println("4 - Cambiar el caracter que dibuja");
			System.out.println("5 - Salir");

			System.out.println("Opción: ");
			opcion = sc.nextInt();


			if (opcion <1 || opcion >5) 

				System.out.println("Opcion incorrecta");

		} while (opcion<1 || opcion >5);
		return opcion; //devolvemos al usuario la opción que ha elegido, devuelves solo el valor de la variable no la variable con el valor
	}
		
	
	

}
