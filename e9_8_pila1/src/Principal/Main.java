package Principal;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String palabra;
		char[] conjunto;
		
		Stack<Character>pila = new Stack <>();
		
		System.out.println("Indica ecuación o operación");
		palabra = sc.nextLine().trim();
		sc.nextLine();
		
		conjunto = palabra.toCharArray();
		
		for (char e : conjunto) { // con el forEach sacamos directamente el caracter, no al posición
			
			if (e =='(')
			pila.push(e);
			
			if (pila.size()==0 && e ==')')
				System.out.println("No va a estar nunca equilibrado");
			
			if (e == ')')
				pila.pop();
			
			
		}
		
		if (pila.size()==0)
			System.out.println("Pila equilibrada ");
			
		System.out.println(pila);
		
		
		
	}

}
