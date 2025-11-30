package Principal;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int n,m;
		
		n = leerEnteroUltimo(teclado,"Introduce una frase te leo el último entero que introduzcas si introduces mas que uno");
		m = leerEnteroPrimero(teclado,"Introduce una frase te leo el primer entero");
		
		System.out.println("El valor leído es "+n);
		System.out.println("El valor leído es "+m);
		
	}
	
	public static int leerEnteroUltimo (Scanner sc,String mensaje)
	{
		int numero = 0;
		String cadena;
		int estado = 0;
		char letra;
		
		System.out.println(mensaje);
		cadena = sc.nextLine();
		for (int pos=0;pos<cadena.length();pos++)
		{
			letra = cadena.charAt(pos);
			switch (estado)
			{
			case 0:
				if (letra>='0' && letra<='9')
				{
					numero = letra - '0';
					estado = 1;
				}
				break;
			case 1:
				if (letra>='0' && letra<='9')
					numero = numero * 10 + letra -'0';
				else
					estado = 0;
				break;
			}
		}
		
		
		return numero;
	}
	
	public static int leerEnteroPrimero(Scanner sc,String mensaje)
	{
		int numero = 0;
		String cadena;
		int estado = 0;
		char letra;
		
		System.out.println(mensaje);
		cadena = sc.nextLine();
		for (int pos=0;pos<cadena.length();pos++)
		{
			letra = cadena.charAt(pos);
			switch (estado)
			{
			case 0:
				if (letra>='0' && letra<='9')
				{
					numero = letra - '0';
					estado = 1;
				}
				break;
			case 1:
				if (letra>='0' && letra<='9')
					numero = numero * 10 + letra -'0';
				else
					return numero;
				break;
			}
		}
		
		
		return numero;
	}


}

