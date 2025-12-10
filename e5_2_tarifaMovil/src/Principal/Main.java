package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Movil movil1 = new Movil ("123456",Tarifa.GATO);
		Movil movil2 = new Movil ("789456",Tarifa.TIGRE);
		int opcion,duracion;
		
		do
		{
			opcion = menu(sc);
			switch (opcion)
			{
			case 1:
				System.out.println("Duración de la llamada: ");
				duracion = sc.nextInt();
				movil1.llamar(duracion);
				break;
			case 2:
				System.out.println("Duración de la llamada: ");
				duracion = sc.nextInt();
				movil2.llamar(duracion);
				break;
			case 3:
				movil1.reiniciarFactura();
				break;
			case 4:
				movil2.reiniciarFactura();
				break;
			case 5:
				System.out.println(movil1);
				System.out.println(movil2);
				break;
			case 6:
				for (Tarifa t : Tarifa.values())
					System.out.println(t.name()+" "+t.getCosteMinuto());
				break;
			}
		} while (opcion!=7);
		sc.close();
	}
	
	public static int menu(Scanner sc)
	{
		int opcion;
		
		do
		{
			System.out.println("1 - Hacer una llamada con el móvil 1");
			System.out.println("2 - Hacer una llamada con el móvil 2");
			System.out.println("3 - Reiniciar factura de movil 1");
			System.out.println("4 - Reiniciar factura de movil 2");
			System.out.println("5 - Ver factura de móviles");
			System.out.println("6 - Ver tarifas");
			System.out.println("7 - Salir");
			System.out.println("Opcion:");
			try
			{
				opcion = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				opcion = 0;
				sc.nextLine();
			}
			if (opcion<1 || opcion>7)
				System.out.println("Opción incorrecta");
		} while (opcion<1 || opcion>7);
		return opcion;
	}

}
