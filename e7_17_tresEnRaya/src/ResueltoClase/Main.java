package ResueltoClase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Tablero tablero = new Tablero();
		boolean exito;
		int fila, columna;
		boolean turnoIA = true;
		
		do {
		
		System.out.println(tablero);
		
		if (turnoIA)  //turnoIA
		{
			
			tablero.moverIARandom('x');
			
			
		} else  //turno de jugador
		{
		
			do 
			{
			//pedimos al usuario la fila y columna en la que quiere insertar
			System.out.println("Indique fila y columna del movimiento: ");
			fila = sc.nextInt();
			columna = sc.nextInt();
			
			//utilizamos fila, columna, el insertamos el símbolo (o o x)
			exito = tablero.mover (fila,columna,'o');
			
			if (exito == false)
				System.out.println("La posición no es correcta");
			
			
			} while (exito == false);
			
		
		}
		
		if (tablero.getGanador()==true)
			System.out.println("\nHa ganado"+((turnoIA)?" la IA\n": " usted\n"));
		
		//negacion, cuando valor vale 1, pasa a valer 0, así se alternan los turnos jugador o IA
		turnoIA = !turnoIA;
		
	} while (!tablero.getGanador() && tablero.completo() == false); // se acaba el juego cuando haya ganador o el tablero esté completo
		
		
		if (!tablero.getGanador()) {
			System.out.println("Empate. El tablero está completo");
		}
		
		//imprimimos el resultado final del tablero
		System.out.println(tablero);
		
		sc.close();
	}

}
