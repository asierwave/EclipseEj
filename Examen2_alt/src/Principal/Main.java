package Principal;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		float tarifaGeneralHora = 2.50f;
		
		Vehiculo v1 = new Vehiculo ("1234BCD","B",120,true);
		Vehiculo v2 = new Vehiculo (teclado);
		
		v1.calcularImporte(tarifaGeneralHora);
		v2.calcularImporte(tarifaGeneralHora);
		
		System.out.println(v1);
		System.out.println(v2);
		teclado.close();
	}
}
