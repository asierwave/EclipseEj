package angel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		Scanner teclado=new Scanner(System.in);
		RepositorioPaseos repositorio=new RepositorioPaseos(5);
		int op;
		int id;
		String nombre;
		boolean exito;
		Paseo p;
		do {
		op=menu(teclado);
		switch(op) 
		{
		case 1: 
			exito=repositorio.alta(teclado);
			if (exito)
				System.out.println("alta realizada");
			else
				System.out.println("repositorio lleno");
		break;
		case 2:System.out.println("introduce un id");
		id=teclado.nextInt();
			exito=repositorio.baja(id);
			if (exito)
				System.out.println("baja realizada");
			else
				System.out.println("el paseo no existe");
			break;
		case 3:
			System.out.println("introduce el nombre del perro");
			teclado.nextLine();
			nombre=teclado.nextLine();
			p=repositorio.buscarXnombre(nombre);
			if(p==null)
				System.out.println("no existe ese paseo");
			else
				System.out.println(p);
			break;
		case 4:System.out.println(repositorio);
		break;
		}
		}while(op!=5);
		
		teclado.close();
		

	}
	
	
	
	
	
	public static int menu(Scanner sc) 
	{
		int op;
		do {
		System.out.println("menu");
		System.out.println("==========");
		System.out.println("opcion 1: alta de un paseo");
		System.out.println("opcion 2: baja de un paseo");
		System.out.println("opcion 3: consultar paseo");
		System.out.println("opcion 4: listado de paseos");
		System.out.println("opcion 5: salir");
		System.out.println("opcion:");
		try 
		{
			op=sc.nextInt();
		}
		catch(InputMismatchException e) 
		{
			op=0;
			sc.nextLine();
		}
		if (op<1||op>5)
			System.out.println("introduce una opcion correcta");
		}while(op<1||op>5);
		
		return op;
		
	}

}
