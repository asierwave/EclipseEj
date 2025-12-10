package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int opcion;
		
		//No se necesita ahora porque lo hacemos con un forEach
//		Zona zona1 = Zona.PRINCIPAL;
//		Zona zona2 = Zona.VENTA;
//		Zona zona3 = Zona.VIP;
		
		String nombreZona;
		int n;
		do 
		{
			opcion = menu (input);
			switch (opcion)
			{
			case 1:
				
				for (Zona z: Zona.values())
					System.out.println(z+ " "+ z.getEntradasDisponibles());
				break;
			case 2: 
				System.out.println("Indica la zona");
				nombreZona= input.nextLine().toUpperCase();
				System.out.println("En la zona "+nombreZona);
				
				try {
				System.out.println("quedan "+Zona.valueOf(nombreZona).getEntradasDisponibles());
				
				System.out.println("¿Cuántas entradas deseas?");
				n = input.nextInt();
				if (Zona.valueOf(nombreZona).comprar(n))
					System.out.println("Entradas vendidas");
				else 
					System.out.println("No hay entradas suficientes");
				
				
				
				
				} catch (IllegalArgumentException e) {
					System.out.println("Esa zona no existe");
				}
				
				//Si quisiesemos otra excepción con la misma salida o tratamiento (el sysout), el or con un solo |  ( Excepcion 1 | Excepcion 2 e)
				//La e siempre al final
				catch (InputMismatchException e)
				{
					System.out.println("No ha introducido un número válido");
				}
			
				break;
			}
			
			
		} while (opcion !=3);
		
	}
	
	public static int menu (Scanner input) 
	{
		int opcion;
		
	do 
	{
		
		System.out.println("1- Mostrar número de entradas: ");
		System.out.println("2- Vender entradas");
		System.out.println("3- Salir");
		System.out.println("Elige una opción:");
		
		try {
			
	
		opcion = input.nextInt();
		input.nextLine();
		
		} catch (InputMismatchException e) {
			opcion = 0;
			input.nextLine();
			System.out.println("Introduce un valor real");
		}
		if (opcion <1 || opcion > 3 ){
			System.out.println("Opcion incorrecta");
		}
		
		
	} while (opcion <1 || opcion > 3);
	return opcion;
	
	}
}