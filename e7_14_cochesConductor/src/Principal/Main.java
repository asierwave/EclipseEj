package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		repositorioConductores repositorio = new repositorioConductores(4);
		int opcion,km;
		boolean exito;
		Conductor c;
		do
		{
			opcion = menu(sc);
			switch (opcion)
			{
			case 1:
				exito = repositorio.alta(sc);
				if (exito==false)
					System.out.println("El repositorio está lleno");
				else
					System.out.println("Alta realizada con éxito");
				break;
			case 2:
				exito = repositorio.baja(sc);
				if (exito==false)
					System.out.println("El conductor no existe");
				else
					System.out.println("Baja realizada con éxito");
				break;
			case 3:
				c = repositorio.buscarXnombre(sc);
				if (c==null)
					System.out.println("Ese conductor no existe");
				else
					System.out.println(c);
				break;
			case 4:
				System.out.println("Opción en desarrollo.");
				break;
			case 5: 
				System.out.println(repositorio);
				break;
			case 6: 
				c = repositorio.buscarXnombre(sc);
				if (c==null)
					System.out.println("El conductor no existe");
				else
				{
					System.out.println(c);
					System.out.println("¿Cuántos km ha realizado?");
					km = sc.nextInt();
					c.addKm(km);
					System.out.println(c);
				}
				break;
			case 7:
				km= repositorio.getTotalKm();
				System.out.println("Total de kilómetros: "+km);
				break;
			}
		} while (opcion!=8);
		sc.close();
	}
	
	public static int menu(Scanner sc)
	{
		int opcion;
		do
		{
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1 - Alta de conductores");
			System.out.println("2 - Baja de conductores");
			System.out.println("3 - Consulta de conductores");
			System.out.println("4 - Modificación de conductores");
			System.out.println("5 - Listado de conductores");
			System.out.println("6 - Añadir km a un conductor");
			System.out.println("7 - Mostrar total de kilómetros");
			System.out.println("8 - Salir");
			System.out.println("Opción:");
			try
			{
				opcion = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				opcion = 0;
			}
			sc.nextLine();
			if (opcion<1 || opcion>8)
				System.out.println("Opción incorrecta");
		} while (opcion<1 || opcion>8);
		return opcion;
	}

}