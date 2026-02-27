package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = null;
		
		int op;
		Scanner sc = new Scanner (System.in);
		do {
			
			menu();
			
			System.out.println("Dame una opción: ");
			op = Integer.parseInt(sc.nextLine());
			
			switch (op)
			{
			
			
			
			case 1: 
				
				empresa= new Empresa(100);
				System.out.println("Empresa registrada correctamente");
				break;
			
			case 2: 
				if (empresa != null) {
				if (empresa.alta(new Analista("2272837", "nombre", 3000, 0, 0)))
					System.out.println("Alta de trabajador correcta");
				else
					System.out.println("No hay espacio para nuevos trabajadores en la empresa");
				} else
					System.out.println("No hay una empresa registrada todavía");
			
			break;
			case 3: 
				
	
					empresa.toString();
			
			break;
			}
			
		
		} while (op != 4);


	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1 - dar de alta una empresa");
		System.out.println("2 - dar de alta trabajador");
		System.out.println("3 - ver trabajadores de empresa");

	}

}
