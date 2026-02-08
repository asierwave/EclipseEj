package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		RepositorioClientes repositorio = new RespositorioClientes(10);
		
		System.out.println(repositorio);
		
		
	}
	
	
	public static int menu (Scanner sc)
	{
		int opcion;
		do
		{
			System.out.println("MENU PRINCIPAL");
			System.out.println("==============");
			System.out.println("1 - Alta de cliente");
			System.out.println("2 - Baja de cliente");
			System.out.println("3 - Modificar cliente");
			System.out.println("4 - Buscar cliente");
			System.out.println("5 - Estadísticas");
			System.out.println("6 - Listado de clientes");
			System.out.println("7 - Salir");
			System.out.println(" Opcion: ");
		
		try
		{
			opcion = sc.nextInt();
		
		} catch (InputMismatchException e) {
			
			
			
			//vector
		}
	} while (opcion <1 || opcion > 7);
}
