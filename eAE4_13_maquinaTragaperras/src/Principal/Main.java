package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int seleccion = 0;
		boolean esSegundoJuego = false;
		int saldo= 10; //saldo inicial jugador
		
		try {
		do {
		esSegundoJuego=mostrarMenu(esSegundoJuego, saldo);
		seleccion= input.nextInt();
		input.nextLine();
		saldo=menu(seleccion, saldo);
		System.out.println();
		
	
	
		} while (seleccion == 1 && saldo > 0);
		
		if (saldo < 1) {
			System.out.println("\u001B[34mTe has quedado sin saldo :(\u001B[0m");
		}
		}catch (InputMismatchException e) {
			System.out.println("---Gracias por haber jugado con nosotros, vuelve pronto---");
		}
	}
	
	
	
	
	public static boolean mostrarMenu(boolean esSegundoJuego, int saldo) {
		System.out.print("Tienes un saldo de ");
		System.out.print("\u001B[33m"+saldo+"\u001B[0m");
		System.out.println("\u001B[33m Monedas\u001B[0m");
		while (esSegundoJuego) {
			System.out.println("¿Quieres volver a tirar? ;)");
			break; 
		}
		
		if (esSegundoJuego==false) {
			System.out.println("¿Quieres tirar?");
			esSegundoJuego=true;
		} 
		System.out.println("*************************************");
		System.out.println("PRESIONA 1 EN EL TECLADO - Sí");
		System.out.println("PRESIONA CUALQUIER OTRA TECLA- Salir");
		System.out.println("*************************************");
		System.out.println("");

		
		return esSegundoJuego;
	}
	
	
	
	
	
	
	public static int menu(int seleccion, int saldo) {
		
		switch (seleccion) {
		case 1: 
			saldo=mostrarJugada(saldo); 
			break;
		case 2: System.out.println("---Gracias por haber jugado con nosotros, vuelva pronto---");
		}
		
		
		return saldo;
		
	}
	
	
	
	
	
	private static int mostrarJugada(int saldo) {
			double posibilidad = 0;
			int posibilidadEntero = 0;
			boolean posibilidadEnRango=false;
			String figura = null;
			int posibilidad1 = 0, posibilidad2 = 0, posibilidad3 = 0;
			int tirada=0;
			
			System.out.println("____________");
			System.out.println(" LUCKY SLOT ");
			System.out.println("____________");

		for (tirada=0; tirada<3; tirada++) { //tres tiradas exclusivamente
			posibilidadEntero = (int)(Math.random()*10);

			if (posibilidadEntero > 0 && posibilidadEntero <5) {
				posibilidadEnRango=true;
			} else {
				posibilidadEnRango=false;
			}
	
			
			while (posibilidadEnRango==false) 
			{
				posibilidadEntero = (int)(Math.random()*10);
				if (posibilidadEntero > 0 && posibilidadEntero <5) {
					posibilidadEnRango=true;
				}
				
			}
			
			if (posibilidadEnRango) {
				switch (tirada) {
				case 0: 
				posibilidad1=posibilidadEntero;
				mostrarFiguras(posibilidadEntero, figura);
				break;
				case 1: 
				posibilidad2=posibilidadEntero; 
				mostrarFiguras(posibilidadEntero, figura);
				break;
				case 2: 
				posibilidad3=posibilidadEntero;
				mostrarFiguras(posibilidadEntero, figura);
				break;
				
				
				default: System.out.println();

				} 
				
			
			}
			
		
			}
	
		System.out.println();
		saldo=comprobarResultado(posibilidad1, posibilidad2, posibilidad3, saldo);
		return saldo;

}
	
	public static void mostrarFiguras(int posibilidadEntero, String figura) {
		
		switch (posibilidadEntero) {
		case 1: figura ="❤️"; //Corazon
		break;
		case 2: figura = "💎"; //Diamante
		break;
		case 3: figura = "🔔"; //Campana
		break;
		case 4: figura = "🍋"; //Limón
		break;
	
	}
		System.out.print("|"+figura+"|");
	}
	
	
	public static int comprobarResultado (int posibilidad1, int posibilidad2, int posibilidad3, int saldo) {
		String resultado = null;
		
		//System.out.println(posibilidad1+" "+posibilidad2+" "+posibilidad3);
		System.out.println("_____________");

		if (posibilidad1 == posibilidad2 && posibilidad2==posibilidad3 && posibilidad1 == posibilidad2) {
			resultado = "Enhorabuena, ha ganado 10 monedas"; //texto VERDE
			saldo +=10;

		}
		
		if (posibilidad1 != posibilidad2 && posibilidad1 != posibilidad3 && posibilidad2 != posibilidad3) {
			resultado = "Lo siento, ha perdido";
			saldo -=1;
		}
		
		if (posibilidad1 != posibilidad2 && posibilidad1 == posibilidad3 && posibilidad2 == posibilidad3 || posibilidad1 == posibilidad2 && posibilidad1 != posibilidad3 && posibilidad2 == posibilidad3|| posibilidad1 == posibilidad2 && posibilidad1 == posibilidad3 && posibilidad2 != posibilidad3 || posibilidad1 != posibilidad2 && posibilidad1==posibilidad3 && posibilidad2 != posibilidad3 || posibilidad1 != posibilidad2 && posibilidad1 != posibilidad3 && posibilidad2 == posibilidad3 || posibilidad1==posibilidad2 && posibilidad1 != posibilidad3 && posibilidad2 != posibilidad3) {
			resultado = "Bien, ha recuperado su moneda";
			saldo += 0;
	
		}
		System.out.println("\u001B[35m"+resultado+"\u001B[0m");
		return saldo;
	}
}
