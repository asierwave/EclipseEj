package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=-1;
		double media = 0;
		int sum = 0;
		
		ArrayList<Integer> lista = new ArrayList<>();
		ArrayList<Integer> listaMasMedia = new ArrayList<>();

		System.out.println("Dame números enteros, cuando me des el 0, paro y \n 1. te calculo la media aritmética \n 2. te digo la cantidad de números que superan la media \n 3. te muestro la lista de números ordenada");

		while (n!=0) {
			n = sc.nextInt();
if (n!=0) {
		lista.add(n);
		sum+=n;
		media = (double)(sum / lista.size());
				
}
			}

		
		for (Integer e : lista ) {
			if (e > media) {
				listaMasMedia.add(e);
			}
		}
			System.out.println("La media de la lista es: "+media);
			System.out.println("La cantidad de números que superan la media son: "+listaMasMedia.size());
			
			
			Collections.sort(lista); //utiliza el orden natural, en el caso de los enteros creciente
			System.out.println(lista);
		}
		
	
	
}
