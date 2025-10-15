package Principal;

import java.util.Scanner;

class cuentaCorriente {

	
	private String dni; 
	private String nombre; 
	private double saldo = 0;
	private String mensaje;
	public double dinero;
	
	Scanner teclado = new Scanner (System.in);



	public cuentaCorriente (Scanner teclado, double saldo) { //Ya no podría crear un constructor que reciba un Scanner, porque ya lo hecho, no puede haber métodos iguales
		this.saldo = 0;
		System.out.println ("Introduzca el dni");
		this.dni = teclado.nextLine(); //Hace salto de línea y no queda nada en el buffer del teclado
		System.out.println("Introduzca el nombre");
		this.nombre = teclado.nextLine();
		teclado.nextLine(); //Con esto evitamos que el intro se quede en el buffer
		
		
		System.out.println ("Bienvenido a tu cuenta, "+nombre+" "+dni+", este es tu saldo actual: "+(int)saldo);
		this.sacarDinero();

	}

	
	



	private void ingresarDinero(){
		
	System.out.println("¿Cuánto dinero quieres ingresar?");
	dinero = teclado.nextDouble(); //Hace salto de línea y no queda nada en el buffer del teclado
	saldo += dinero;
		
		
	mensaje = "Has ingresado " +dinero+ " y tu saldo actual es de " +saldo;
		
	System.out.println (mensaje);
	
	System.out.println("¿Quieres ingresar mas dinero? Pulsa 1 y entrar para INGRESAR, pulsa 2 y entrar para SACAR DINERO o pulsa cualquier otro número para acabar la sesión");
	int entrada = teclado.nextInt();
	
	
	if (entrada == 1) {
		this.ingresarDinero();

	} else if (entrada ==2) {
		
	this.sacarDinero();
	
	} else {
		this.despedida();

	}
	}
	
	
	private void sacarDinero(){
		
	System.out.println("¿Cuánto dinero quieres sacar?");
	dinero = teclado.nextDouble(); //Hace salto de línea y no queda nada en el buffer del teclado
	mensaje = (dinero <= saldo) ? "Has sacado " +dinero+ " y tu saldo actual es de " +(saldo-dinero) : "No tienes saldo suficiente para retirar esa cuantía, tu saldo es de "+saldo+"€";
	saldo = (dinero <= saldo) ? (saldo - dinero) : saldo;
		
	System.out.println (mensaje);
	

	System.out.println("¿Quieres ingresar mas dinero? Pulsa 1 y entrar para INGRESAR, pulsa 2 y entrar para SACAR DINERO o pulsa cualquier otro número para acabar la sesión");
	int entrada = teclado.nextInt();
	
	
	if (entrada == 1) {
		this.ingresarDinero();

	} else if (entrada ==2) {
		
	this.sacarDinero();
	
	} else {
		this.despedida();

	}
	}
	
	
	

	private void despedida () {
		System.out.println ("Gracias por usar este cajero, ¡Hasta pronto!");

	}
	
		

		public String toString() {
			String extracto;
			extracto = "La cuenta cuyo DNI es "+dni+" tiene actualmente "+saldo+" de saldo";
			return extracto;
		}
		
		
		
	}

	

