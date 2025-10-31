package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final double tarifaGeneralxHora = 2.5;
		

		Scanner teclado = new Scanner (System.in);
		
		//0 y 75
		 Vehiculo v1= new Vehiculo("1234BCD", "0", 75, true);
		 Vehiculo v2= new Vehiculo (teclado);
		 
		 
		 v1.calcularImporte();
		 v2.calcularImporte();
	
		 
		// System.out.println(v2.imprimir());
		// v2.imprimirv2();
		 
		
//FUNCIONA PARA EL NORMAL
			//Casos de prueba C y abono, 60 minutos: importe total *0.8 y* 0.5 = 1 euro NO VALIDO 
		
		
	}

}
