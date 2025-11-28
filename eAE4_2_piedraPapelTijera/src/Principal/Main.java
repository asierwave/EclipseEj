package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);


		int jugadaUsuario = 0, jugadaUsuarioA = 0, jugadaUsuarioB = 0;
		int contador = 0;
		boolean sigueJugando=true;
		

		do {
			
			mostrarMenu(contador);
			jugadaUsuario=verificarInput(input,jugadaUsuario);
			//input.nextLine();
			
			
			if (jugadaUsuario != 0) { 
				contador++;
				
				//asignamos jugadas a cada usuario
				switch (contador) {
				case 1:jugadaUsuarioA =jugadaUsuario;
				case 2:jugadaUsuarioB=jugadaUsuario;
				}
			}
			
		
				

			//System.out.println(contador);

				switch (jugadaUsuario) {
				case 1: System.out.println("Has elegido Piedra");break;
				case 2: System.out.println("Has elegido Papel"); break;
				case 3: System.out.println("Has elegido Tijera"); break;
				case 4: 
					System.out.println("/////Has salido del juego////");
					sigueJugando = false;

				} 
				
			
				
			
				
				


		} while (jugadaUsuario !=4 && contador<2);
		
		
		if (sigueJugando) {
		System.out.println(jugadaUsuarioA+"+"+jugadaUsuarioB);
		calcularGanador(jugadaUsuarioA, jugadaUsuarioB);
		}
	
	} 


	public static void calcularGanador(int jugadaUsuarioA, int jugadaUsuarioB) {
		
		if (jugadaUsuarioA == jugadaUsuarioB) {
			System.out.println("¡Empate!");
		} else 
			if (jugadaUsuarioA == 1) {
			switch (jugadaUsuarioB) {
				case 2: System.out.println("¡Gana el jugador 2, el papel gana a la piedra!");
				case 3: System.out.println("¡Gana el jugador 1, la piedra gana a la tijera!");
			}
			} else 
				if (jugadaUsuarioA == 2) {
					switch (jugadaUsuarioB) {
						case 1: System.out.println("¡Gana el jugador 1, el papel gana a la piedra!");
						case 3: System.out.println("¡Gana el jugador 2, la piedra gana a la tijera!");
					}
					} else
						if (jugadaUsuarioA == 3) {
							switch (jugadaUsuarioB) {
								case 1: System.out.println("¡Gana el jugador 2, la piedra gana a la tijera!");
								case 2: System.out.println("¡Gana el jugador 1, la tijera gana al papel!");
							}
							
							
							
						
		}
		
	}

	
	
	public void asignarJugadasUsuarios (int contador, int jugadaUsuario) {
		
	}
	
	


	public static int verificarInput(Scanner input, int jugadaUsuario) {

		try {

			jugadaUsuario = input.nextInt();

			if (jugadaUsuario < 1 || jugadaUsuario > 4) {
				System.out.println("No pongas negativos o 0 o mayor que 4, cíñete a las opciones disponibles");
				System.out.println();
				jugadaUsuario = 0;
			}
		
		} catch (InputMismatchException e) {
			System.out.println("Dame un número válido entre el 1 y el 4");
			System.out.println();
			input.nextLine(); //LIMPIA BUFFER E IMPIDE BUCLE DE EXCEPCION
			jugadaUsuario = 0;
		}
		return jugadaUsuario;
		
		

	}
	
	

	public static void mostrarMenu(int contador) {

		System.out.println("Dame una opción, JUGADOR "+(contador+1)+ ", vamos a jugar (escribe el número): ");
		System.out.println("1 - Piedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tijera");
		System.out.println("4 - Salir del juego");


	}



}
