package Principal;

public class Main {

	public static void main(String[] args) {

		//Dibujamos un laberinto en una matriz
		//Algoritmo de backtracking
		//Vamos a encontrar un camino de salida del laberinto
		
		Laberinto laberinto1 = new Laberinto();
		
		System.out.println(laberinto1);
		
		laberinto1.encontrarSalida();

		System.out.println(laberinto1);
		
		
		
	}

}
