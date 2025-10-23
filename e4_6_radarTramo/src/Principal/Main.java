package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int metrosEntreRadaresTramo, velocidadMaximaPermitida=0, segundosParaRecorrerTramo;
		double velocidadMediaTramo=0;
	
		
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Dame la distancia entre los radares en metros: ");
		metrosEntreRadaresTramo = teclado.nextInt(); 
		
		System.out.println ("Dime la velocidad máxima permitida en esa vía en Km/h: ");
		velocidadMaximaPermitida = teclado.nextInt();
	

		System.out.println ("Dime los segundos que ha tardado el coche en recorrer el tramo: ");
		segundosParaRecorrerTramo = teclado.nextInt();
		

		
		velocidadMediaTramo = Math.abs(((double)metrosEntreRadaresTramo/1000) * 1) / ((double)segundosParaRecorrerTramo/3600);
		
		
		
		
		float velocidadMaximaPermitidaRangoMulta = velocidadMaximaPermitida + (velocidadMaximaPermitida * (20f/100f)); //Hay que ponerlo así para que no redondee a 0 y no se sume
		
		boolean conllevaMulta =  (velocidadMediaTramo < velocidadMaximaPermitidaRangoMulta) && (velocidadMediaTramo > velocidadMaximaPermitida);
		boolean conllevaPuntos = velocidadMediaTramo > velocidadMaximaPermitidaRangoMulta;
		boolean esVelocidadPositiva = velocidadMediaTramo > 0 && velocidadMediaTramo <= velocidadMaximaPermitida;
		
		//Casos de prueba: 9165 110 300 (OK). 9165 110 299 (MULTA). 12000 100 433 (OK).
		//12000 100 431 (MULTA). 12000 100 359 (PUNTOS). -1000 -50 -100 (ERROR).
		
		String mensaje = conllevaMulta ? "MULTA" : (conllevaPuntos ? "PUNTOS" : (esVelocidadPositiva ? "OK" : "ERROR"));
		
		mensaje = (metrosEntreRadaresTramo < 0 || velocidadMaximaPermitida < 0  || segundosParaRecorrerTramo <0) ? "ERROR" : mensaje; //Validamos que no es negativo

		
		
		System.out.println((int)velocidadMediaTramo+" KM/H");
		
		System.out.println("MAX.VELOCIDAD "+(int)velocidadMaximaPermitidaRangoMulta+" KM/H");

		
		System.out.println(conllevaMulta+" "+conllevaPuntos+" "+esVelocidadPositiva);
		
		System.out.println(mensaje);
		
	}

}
