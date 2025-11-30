package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int op;
		
		do 
		{
			op = menu(teclado);
			
			switch (op) {
			
			case 1: System.out.println("Saca dinero");
			break;
			case 2: System.out.println("Ingresa dinero");
			break;
			case 3: System.out.println("Consulta saldo");
			break;
				
			}
			
		} while (op !=4);
			teclado.close();
			System.out.println("/////FIN/////");
		
	}
	
	public static int menu (Scanner sc) {
		
		int opcion;
		
		do {
		System.out.println("1 - Reintegro");
		System.out.println("2 - Ingreso");
		System.out.println("3 - Ver Saldo");
		System.out.println("4 - Salir");
		opcion = sc.nextInt();
		
		if (opcion<1 || opcion>4)
			System.out.println("Opcion incorrecta");
		
		} while (opcion<1 || opcion>4);
	return opcion;
		
	}

}




