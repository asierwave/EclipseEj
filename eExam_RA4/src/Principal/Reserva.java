package Principal;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Scanner;

public class Reserva {

	LocalDate fecha;
	int mes;
	int dia;
	int horas;
	int minutos;
	LocalTime hora;
	String nombre;
	String tlfno;
	int nComensales;
	float coste;
	

	
	
	
	public Reserva(int mes, int dia, int horas, int minutos, String nombre, String tlfno, int nComensales) {
		super();
		this.fecha = fecha;
		this.horas = horas;
		this.mes = mes;
		this.dia = dia;
		this.fecha = LocalDate.of(2026, mes, dia);
		this.minutos = minutos;
		this.hora = LocalTime.of(horas, minutos);
		this.nombre = nombre;
		this.tlfno = tlfno;
		this.nComensales = nComensales;
		
	
	}
	
	
	
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public int getnComensales() {
		return nComensales;
	}



	public void setnComensales(int nComensales) {
		this.nComensales = nComensales;
	}



	public Reserva (Scanner teclado) {
		System.out.println("Introduzca el mes en el que quiera reservar: ");
		this.mes = teclado.nextInt();
		System.out.println("Introduzca el día en el que quiera reservar: ");
		this.dia = teclado.nextInt();
	/////
		this.fecha = LocalDate.of(2026, mes, dia);
		
	
		
		System.out.println("Introduzca la hora en la que quiera reservar: ");
		this.horas = teclado.nextInt();
		System.out.println("Introduzca los minutos exactos: ");
		this.minutos = teclado.nextInt();
		
		this.hora = LocalTime.of(horas, minutos);
		teclado.nextLine();
		
		System.out.println("Introduzca el nombre al que quiera hacer la reserva: ");
		this.nombre = teclado.nextLine();
	
		
		
		System.out.println("Introduzca un teléfono de contacto: ");
		this.tlfno = teclado.nextLine();
		
		System.out.println("Introduzca el número de comensales para la reserva: ");
		this.nComensales = teclado.nextInt();

		
	}
	
	
	public float setCoste (int nComensales, int horas, int dia) {
		
		float coste = 0;
		coste = 15 * nComensales;
		
		//Me invento horas puntas y dias clave 
		
		
		//Aumentamos coste un 20% en horas punta
		if (horas > 21) {
			coste= coste * (float) 1.2;
			
			
			//Aumentamos un 10 % en dias clave
			if (dia == 23 && dia == 14) {
				coste = coste * (float) 1.1;
			}
		}
		
		
		return coste;
	}
	
	
	@Override
	public String toString() {
		
		String mensajeCoste;
		
		if (coste == 0) {
			mensajeCoste = "Coste: No ha sido calculado aún.";
		} else {
			mensajeCoste= coste + " euros.";
		}
		return "Fecha: " + fecha + " - Hora: " + hora + " - Nombre; " + nombre + " (" + tlfno + ") - " + nComensales + " comensales"
				+ ". "+mensajeCoste;
	}
	
	
	
}
