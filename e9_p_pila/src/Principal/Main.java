package Principal;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> pila = new Stack <>();
		
		int n;
		int posicion;
		
		pila.push(5);
		pila.push(12);
		pila.push(8);
		pila.push(67);
		
		System.out.println(pila);
		n = pila.pop();
		System.out.println(n);
		System.out.println(pila);
		
		posicion = pila.search(12);
		System.out.println(posicion);
		System.out.println(pila);
		
		System.out.println("La pila actualmente tiene: "+pila.size());
		
		// Se puede meter mas elementos en la pila por delante y por detrás pero la estaríamos utilizando como lista y no como pila
		
		
		
		
	}

}
