package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean exito; // Almacena el resultado de las operaciones sobre el repositorio
		// Creamos el repositorio de empleados con capacidad para 4 empleados
		RepositorioEmpleados repositorio = new RepositorioEmpleados(4);
		do
		{
			opcion = menu(sc);
			switch (opcion)
			{
			case 1:// Alta de empleados
				exito = repositorio.alta(sc);
				if (exito == true)
					System.out.println("Alta realizada");
				else
					System.out.println("El alta ha fallado (Repositorio lleno).");
				break;
			case 2:// Baja de empleados
				exito = repositorio.baja(sc);
				if (exito == true)
					System.out.println("Se ha borrado correctamente");
				else
					System.out.println("El empleado no existe");
				break;
			case 3 : // Consulta por DNI de empleados
				exito = repositorio.consultarXdni(sc);
				if (exito == false)
					System.out.println("El empleado no existe");
				break;
			case 4:// Modificación por DNI de empleados
				exito = repositorio.modificaXdni(sc);
				if (exito == false)
					System.out.println("El empleado no existe");
				break;
			case 5:// Listado de empleados
				repositorio.listado();
				break;
			}
		} while (opcion!=6);
		sc.close();
	}
	
	// Menú de opciones con control de excepción
	public static int menu(Scanner sc)
	{
		int opcion;
		do
		{
			System.out.println("MENU PRINCIPAL");
			System.out.println("==============");
			System.out.println("1 - Alta de empleado");
			System.out.println("2 - Baja de empleado");
			System.out.println("3 - Consulta de empleado");
			System.out.println("4 - Modificación de empleado");
			System.out.println("5 - Listado de empleados");
			System.out.println("6 - Salir");
			System.out.println("Opción:");
			try
			{
				opcion = sc.nextInt();
				sc.nextLine(); // Eliminar el intro
			} catch (InputMismatchException e)
			{
				sc.nextLine(); // Eliminamos el texto que ha escrito
				opcion = 0;
			}
			if (opcion<1 || opcion>6)
				System.out.println("Opción incorrecta");
			
		} while (opcion<1 || opcion>6);
		return opcion;
	}
}