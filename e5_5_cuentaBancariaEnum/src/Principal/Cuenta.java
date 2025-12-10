package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

class Cuenta {

	private String titular;
	private String iban;
	private double saldo;
	private int contadorMov;
	private String movimientos;
	private boolean imprimeMov =false;
	

	Scanner input = new Scanner (System.in);
	private double saldoFinal;
	private double saldoInicial;

	public Cuenta (Scanner input) 
	{	

		System.out.println("Indiqueme su nombre");
		this.titular = input.nextLine().toUpperCase();
		do 
		{
			
			try 
			{
				
				System.out.println("Indíqueme su IBAN: ");
				iban = input.nextLine();
				
				//System.out.println(iban.substring(0,1));
				//System.out.println(iban.substring(1,2));

				if (iban.length()!=24) {
					System.out.println("La cuenta bancaria debe tener 24 dígitos");

				}

					if (!iban.substring(0,1).equals("E") && !iban.substring(1,2).equals("S")) 
						System.out.println("La cuenta bancaria debe empezar con ES");



			} catch (InputMismatchException | IllegalArgumentException e) {
				System.out.println("Valor incorrecto, introducelo de nuevo");
				input.nextLine();
			}

		}
	while (!iban.substring(0,1).equals("E") || !iban.substring(1,2).equals("S") || iban.length() != 24);

		this.saldo = 0;
	}

	
	
	
	

	@Override
	public String toString() {
		return "Los datos de su cuenta en LibreCoders \n Titular= " + titular + "\n IBAN: " + iban + "\n saldo= " + saldo + "€ \n";
	}
	
	

	
	public double ingresarDinero(double cantidadIngresar) 
	{
		
		
		this.saldo= saldo;
		this.saldoInicial = saldo;
		this.imprimeMov=imprimeMov;
			saldo += cantidadIngresar;
			contadorMov++;
			this.saldoFinal= saldo;

			
			if (cantidadIngresar > 3000) {
				System.out.println("Estas jodido, notificaremos a hacienda\n");
				imprimeMov=true;

			
			}
			toStringMovimientos();
			imprimeMov=false;


		return saldo;
	}
	
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public String getIban() {
		return iban;
	}


	public void setIban(String iban) {
		this.iban = iban;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void menu () {
		int opcion = 0;
		double cantidadIngresar=0;
		double cantidadRetirar=0;

		do {

		 System.out.println("Bienvenido a LibreCoders. Elige una opción: ");
		 System.out.println("1- Datos de la cuenta");
		 System.out.println("2- IBAN");
		 System.out.println("3- Titular");
		 System.out.println("4- Saldo");
		 System.out.println("5- Ingreso");
		 System.out.println("6- Retirada");
		 System.out.println("7- Movimientos");
		 System.out.println("8- Salir");
		 System.out.println("Su opción: ");
		
		 try {
		 opcion = input.nextInt();
		 
		switch (opcion) {
		case 1: System.out.println(toString());break;
		case 2: System.out.println("El IBAN de la cuenta es: "+getIban()+"\n");
			break;
		case 3: System.out.println("El titular de la cuenta es: "+getTitular()+"\n"); break;
		case 4: System.out.println("El saldo de tu cuenta es: "+getSaldo()+"\n");
			break;
			
		case 5: 
			
			try {
			System.out.println("Inserte la cantidad a ingresar: ");
			cantidadIngresar= input.nextDouble();
			ingresarDinero(cantidadIngresar);
			
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Introduce un número");
				input.nextLine();

			}
			
			break;
			
		case 6: 
			try {
			System.out.println("Inserte la cantidad a retirar: ");
			cantidadRetirar= input.nextDouble();
			retirarDinero(cantidadRetirar);
			
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Introduce un número");
				input.nextLine();

			}
		
			break;
		case 7: 
		System.out.println("Los últimos movimientos de su cuenta son:\n");
	 
		System.out.println("MOV. | ORIG. | DIF. | SALDO \n");
		
			System.out.println(toStringMovimientos());; break;
		case 8: System.out.println("**** Gracias por utilizar LibreCoders, ¡hasta la próxima! ****");break;
		default: System.out.println("\n Introduce una opción válida\n");
		} 
		 }catch (InputMismatchException e) {
			System.out.println("Introduce una de las opciones indicadas");
			input.nextLine();
		}
		
		}while (opcion != 8);
		 
		 
	}
	
	
	
	
	public String toStringMovimientos(){
		this.saldo = saldo;
		this.contadorMov = contadorMov;

		
		if (contadorMov == 0) {
		movimientos = "No tiene movimientos actualmente\n";
		} else {
			if(this.imprimeMov == true) {
		movimientos+="00"+contadorMov+"  | "+saldoInicial+"  | "+(saldoFinal-saldoInicial)+ " |  "+saldoFinal+"\n";
			}
			}
		return movimientos;
	}
	
	public double retirarDinero(double cantidadRetirar) 
	{
		
		this.saldo= saldo;
		this.saldoInicial = saldo;
		this.contadorMov=contadorMov;
		this.imprimeMov= imprimeMov;
		
		if (saldo-cantidadRetirar >= -50) {
			saldo -= cantidadRetirar;
			contadorMov++;
			this.saldoFinal = saldo;


			if (saldo < 0) {
				System.out.println("AVISO: saldo negativo");
				imprimeMov=true;


			}
			
			if (cantidadRetirar > 3000) {
				System.out.println("Estas jodido, notificaremos a hacienda");
				imprimeMov=true;


			}
			
		} else {
			System.out.println("No tienes fondos suficientes");
			imprimeMov=false;
		}
		toStringMovimientos();
		imprimeMov=false;


		
		return saldo;
	}
	


}
