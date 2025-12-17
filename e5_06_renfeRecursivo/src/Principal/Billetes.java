package Principal;

import java.time.LocalDateTime; //Se tiene que cargar LocalDateTime
import java.util.Scanner;

public class Billetes {

	private String origen;
	private String destino;
	private LocalDateTime fSalida; //Para llamar a la fecha o a la hora
	private LocalDateTime fLlegada;
	private double precio;
	private Asientos asiento; //Clase Asiento 
	
	public Billetes (Scanner sc) 
	{
		
		boolean ventana, sentidoMarcha;
		int fila;
		
		System.out.println("Introduzca Origen: ");
		origen = sc.nextLine();
		System.out.println("Introduzca Desinto: ");
		destino = sc.nextLine();
		fSalida= LocalDateTime.now(); //Consulta en el reloj del sistema la hora y la fecha actual
		// Para dar un objeto una fecha y hora LocalDateTime.of(0, 0, 0, 0, 0), por ejemplo LocalDateTime.of(año, mes, dia, hora, min)
		fLlegada= fSalida.plusHours(2);
		
		System.out.println("¿Desea ventana?");
		ventana = sc.nextBoolean();
		System.out.println("¿Desea sentido de la marcha?");
		sentidoMarcha = sc.nextBoolean();
		System.out.println("Seleccione fila");
		fila = sc.nextInt();
		sc.nextLine(); //Limpiar buffer de teclado
		asiento = new Asientos(ventana, sentidoMarcha, fila);
		calcularPrecio();
		
		
	}
	
	private void calcularPrecio()
	{
		precio = 200;
	}
	
	public String toString() {
		String resultado = "";
		int longitudL1, longitudL2, longitud;
		resultado += "Origen:  "+origen;
		resultado += String.format("      Hora de salida: %02d:%02d\n",fSalida.getHour(),fSalida.getMinute());
		
		longitudL1 = resultado.length();
		
		
		resultado += "Destino:  "+destino;
		resultado += String.format("     Hora de llegada: %02d:%02d\n",fLlegada.getHour(),fLlegada.getMinute());
		
		longitudL2 = resultado.length()-longitudL1;
		
		longitud = Math.max(longitudL1, longitudL2);
		
		for (int i=0; i<=longitud; i++) 
			resultado += "-";
		resultado += "\n";
		
		resultado += String.format("Fecha: %02d/%02d/%02d",fSalida.getDayOfMonth(), fSalida.getMonthValue(), fSalida.getYear());
		resultado += String.format("    Precio con IVA %.2f\n",precio);
		
		//longitud = resultado.length()-longitudL1-longitudL2-longitud; 
		//Realmente da igual porque la longitud de arriba siempre será mas larga que la parte de fecha y precio
		
		for (int i=0; i<=longitud;i++) 
			resultado +="-";
		resultado +="\n";
		resultado += asiento; //agregación, estamos añadiendo un atributo de otra clase
		
		return resultado;
	}
	
	
}
