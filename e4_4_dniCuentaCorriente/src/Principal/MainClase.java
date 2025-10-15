package Principal;

import java.util.Scanner;

public class MainClase {

	public static void main(String[] args) {
	
		String nom, dni, mensaje;
		boolean exito;
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		cuentaCorrienteClase cuenta;
		
		System.out.println("Int. el nombre");
		nom = teclado.nextLine();
		
		System.out.println("Int. el dni");
		dni = teclado.nextLine();
		
		cuenta = new cuentaCorrienteClase (dni, nom);
		
		
		
		System.out.println ("Voy a ingresar 100 euros");
		cuenta.ingresar(100);
		
		double saldo = cuenta.getSaldo(); //Recojo el saldo

		mensaje = "Has ingresado correctamente 100 euros, tu saldo actualmente es de "+saldo;
		
		System.out.println(mensaje);

		
		System.out.println ("Voy a sacar 200 euros");
		exito = cuenta.sacar(200);
		
		
		mensaje = (exito)? "////////////// Operación autorizada //////////////////": "///////////////////Operación denegada////////////////////";
		
		System.out.println(mensaje);
		System.out.println(cuenta);


	}

}
