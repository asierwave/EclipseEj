package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float temperaturaCelsius, sensacionTermica, sensacionTermicaKelvin;
		int humedadRelativa; 
		final int umbral_inf= 285;
		final int umbral_sup= 308;
		String resultado;
	

		
	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println ("Dame la temperatura en grados Celsius:");
		temperaturaCelsius = teclado.nextFloat();	
		
		System.out.println ("Dame la humedad relativa:");
		humedadRelativa = teclado.nextInt();	
		
		
		sensacionTermica = temperaturaCelsius + (humedadRelativa / 100f)*(temperaturaCelsius*0.1f);
		
		sensacionTermicaKelvin = sensacionTermica + 273.15f;
		
		resultado= (sensacionTermicaKelvin > umbral_inf && sensacionTermicaKelvin < umbral_sup) ? "Condiciones normales" : ((sensacionTermicaKelvin < umbral_inf)? "ALERTA: Riesgo por temperaturas bajas" : "ALERTA: Riesgo por temperaturas altas");
		
		System.out.printf( "La sensación térmica en Celsius será %.2f, en Kelvin %.2f: ",sensacionTermica, sensacionTermicaKelvin);
		System.out.println(resultado);
	}
	
	
	//Caso de prueba 1 Temperatura Celsius 69, humedad relativa 69: Riesgo temperaturas altas OK
	//Caso de prueba 2 Temperatura Celsius 23, humedad relativa 80: Condiciones normales OK
	//Caso de prueba 3 Temperatura Celsius -4, humedad relativa 34: Riesgo temperaturas bajas OK

}
