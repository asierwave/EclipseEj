package Principal;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int op;
		Contacto c;
		Agenda agenda = new Agenda();
		agenda.recuperar(); //Recuperamos los datos del fichero donde guardamos
		
		do {
			
			op = menu(sc);
			
			switch (op) {
			
			case 1: 
				c = new Contacto();
				sc.nextLine();
				System.out.println("Nombre");
				c.setNombre(sc.nextLine());
				System.out.println("Teléfono");
				c.setTelefono(sc.nextLine());
				System.out.println("Edad");
				c.setEdad(Integer.parseInt(sc.nextLine()));
				System.out.println("Salario: ");
				c.setSalario(Double.parseDouble(sc.nextLine()));
				
				if (agenda.alta(c)) {
				agenda.guardar(); // se guarda contact a contacto, esto es lo seguro
				System.out.println("Contacto añadido");
				}
				else
					System.out.println("No se ha podido añadir el contacto");
				break;
				
			case 2: 
				System.out.println(agenda);
				break;
				
			case 3: agenda.guardar(); //se guardan todos los contactos de golpe, pero si se va la luz y no se llega aqui se pierde todo. 
			//Se sobreescribe todo lo que antes se había guardado, hay metodos para evitar que se sobreescirba todo y que se acumulativo
			//Con una llamada al método guardar valdría
			
			break;
			}
			
			
		} while (op != 3);
		
	}


	public static int menu (Scanner sc) {
		int op;
		
		do {
			
			System.out.println("MENU");
			System.out.println("====");
			System.out.println("1 - Alta de contacto");
			System.out.println("2 - Ver contactos");
			System.out.println("3 - Salir");
			
			op = sc.nextInt();
			
			if (op < 1 || op > 3) 
				System.out.println("Opción incorrecta");
		
			
		} while (op < 1 || op > 3);
		
		return op;
	}
	
	
	
	

}
