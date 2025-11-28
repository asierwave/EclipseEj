package Principal;

import java.util.Scanner;




public class menuTartas {


	public static void main(String[] args) {

		float precioTarta;
		Scanner teclado = new Scanner (System.in);
		int op;
		
		do 
		{
			op = menu(teclado);
			
			switch (op) {
			
			case 1: System.out.println("Manzana");
			op = submenuExtra(teclado);
			precioTarta =18f;

			break;
			case 2: System.out.println("Fresa");
			op = submenuExtra(teclado);
			precioTarta =16f;

			break;
			case 3: System.out.println("Chocolate");
			
			
			do {
			op = submenuChocolate(teclado);
			
			switch (op) {

			
			case 1: System.out.println("Chocolate negro");
			op = submenuExtra(teclado);
			precioTarta =14f;
			break;
			
			case 2: System.out.println("Chocolate blanco");
			op = submenuExtra(teclado);
			precioTarta =15f;
			break;
				
			}
			
			
			} while (op !=4);
			teclado.close();
			System.out.println("/////FIN/////");
			return;
				
			}
			
			
	
			
		} while (op !=4);
			teclado.close();
			System.out.println("/////FIN/////");
		
			do {
				op = submenuExtra(teclado);
				
				switch (op) {

				
				case 1: System.out.println("Añadir nata");
				precioTarta =+ 2.75f;

				break;
				case 2: System.out.println("Añadir nombre personalizado");
				precioTarta =+ 2.50f;

				break;
				case 3: System.out.println("Añadir ambas");
				precioTarta =+ 2.75f + 2.50f;

				break;
					
				}
				
				
				} while (op !=4);
				teclado.close();
				System.out.println("/////FIN/////");
				return;	
			
			
			
			
	}
	
	public static int menu (Scanner sc) {
		
		int op;
		
		do {
		System.out.println("1 - Manzana");
		System.out.println("2 - Fresa");
		System.out.println("3 - Chocolate");
		System.out.println("4 - Salir");
		op = sc.nextInt();
		
		if (op<1 || op>4)
			System.out.println("Opcion incorrecta");
		
		} while (op<1 || op>4);
	return op;
	
	
	}
	
	public static int submenuChocolate (Scanner sc) {
		
		int opcion;
		
		do {
		System.out.println("1 - Negro");
		System.out.println("2 - Blanco");
		System.out.println("5 - Volver");
		opcion = sc.nextInt();
		
		if (opcion<1 || opcion>4)
			System.out.println("Opcion incorrecta");
		
		} while (opcion<1 || opcion>4);
	return opcion;
		
	}
	
	
public static int submenuExtra(Scanner sc) {
		
		int op;
		
		do {
		System.out.println("1 - Añadir Nata");
		sc.close();

		System.out.println("/////FIN/////");
		
		System.out.println("2 - Añadir Nombre personalizado");
		sc.close();

		System.out.println("/////FIN/////");

		System.out.println("3 - Añadir ambas");
		sc.close();
		System.out.println("/////FIN/////");
	
	
		op = sc.nextInt();
		
		if (op<1 || op>4)
			System.out.println("Opcion incorrecta");
		
		} while (op<1 || op>4);
	return op;
		
	}
}
