package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		Movil movil1 = new Movil("637101282",Tarifa.GATO);
		Movil movil2 = new Movil("619593934",Tarifa.TIGRE);
		
		int opcion, duracion;
		
		do {
			opcion = menu(teclado);
			switch (opcion)
			{
			case 1:
				System.out.println("duracion de llamada");
				duracion = teclado.nextInt();
				movil1.llamar(duracion);
				break;
			case 2:
				System.out.println("duracion de la llamada");
				duracion = teclado.nextInt();
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
				for(Tarifa s : Tarifa.values())
					System.out.println(s.name()+" "+s.getCosteMinuto());
				break;
			}
		} while(opcion!=7);
		teclado.close();

	}
	public static int menu(Scanner teclado)
	{
		int opcion;
		
		do
		{
			System.out.println("1- Hacer una llamada con el movil 1 ");
			System.out.println("2- Hacer una llamada con el movil 2 ");
			System.out.println("3- Reiniciar factura del movil 1 ");
			System.out.println("4- Reiniciar factura del movil 2 ");
			System.out.println("5- Ver factura de moviles ");
			System.out.println("6- Ver tarifas ");
			System.out.println("7- salir");
			System.out.println("Opcion");
			try
			{
				opcion = teclado.nextInt();
			}
			catch (InputMismatchException e)
			{
				opcion = 0;
				teclado.nextLine();
			}
			if (opcion<1 || opcion>7)
				System.out.println("Opción incorrecta");
		} while (opcion<1 || opcion>7);
		return opcion;
	}

}