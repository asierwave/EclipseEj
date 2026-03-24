package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	/**
	 *Desarrolle un programa que solicite números enteros al usuario y los almacene en una
	 *lista (ArrayList). Cuando el usuario introduzca el número cero, el programa debe
	 *mostrar la suma de todos los números, la media aritmética, la cantidad de números
	 *que superan la media y finalmente mostrar la lista de números ordenada.
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=-1;
		double media = 0;
		int sum = 0;
		
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> listaMasMedia = new ArrayList<>();
		
		Set <Integer> conjunto = new HashSet <>();

		System.out.println("Dame números enteros, cuando me des el 0, paro y \n 1. te calculo la media aritmética \n 2. te digo la cantidad de números que superan la media \n 3. te muestro la lista de números ordenada");

		while (n!=0) {
			n = sc.nextInt();
			if (n!=0) {
			conjunto.add(n);
			sum+=n;
			media = (double)(sum / conjunto.size());
					
		}
			}

		
		for (Integer e : lista ) {
			if (e > media) {
				listaMasMedia.add(e);
			}
		}
			System.out.println("La media de la lista es: "+media);
			System.out.println("La cantidad de números que superan la media son: "+listaMasMedia.size());
			
			
			// Collections.sort(lista); utiliza el orden natural, en el caso de los enteros creciente
			System.out.println(conjunto);
		}
		
	
	
}