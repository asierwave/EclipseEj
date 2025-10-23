package Principal;

import java.util.Scanner;

public class alternativaSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner (System.in);
		
		int numero; 
		
		System.out.println("introduzca un digito");
		numero = teclado.nextInt();
		
		if(numero > 0)
		{
			System.out.println("es positivo");
		}
		
		
		if (numero < 0){
			System.out.println("negativo");
		}
		else
			System.out.println("neutro");
			
	
		teclado.close();
	}
}