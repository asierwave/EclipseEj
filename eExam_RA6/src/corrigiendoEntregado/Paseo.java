package corrigiendoEntregado;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Paseo {

	private static int secuencia=0;
	private int id;
	private String nombrePerro;
	private LocalTime horaInicio; //hora y minuto
	private float minutosPaseo;
	private boolean pagado; //true,pagado, false, no pagado
	
	
	
	//Primer constructor, con todo menos con atributo pagado
	
	public Paseo(String nombrePerro, LocalTime horaInicio, float minutosPaseo) {
		super();
		this.id = secuencia++;
		this.nombrePerro = nombrePerro;
		this.horaInicio = horaInicio;
		this.minutosPaseo = minutosPaseo;
		this.pagado = false;
 }
	
	public Paseo (Scanner sc) {
		int horaInicio, minutoInicio;
		this.id = secuencia++;

		try {
		
			System.out.println("Dame el nombre del perro: ");
			this.nombrePerro = sc.nextLine();
			
			do {
				System.out.println("Dame la hora y minuto de inicio del paseo: ");
				
				try {

				horaInicio = Integer.parseInt(sc.nextLine());
				minutoInicio= Integer.parseInt(sc.nextLine());
				
				this.horaInicio= LocalTime.of(horaInicio, minutoInicio);
				
				} catch (InputMismatchException e) {
					System.out.println("Introduzca una hora y minuto válido con el formato HH y MM");
				} catch (DateTimeException e) {
					System.out.println("Introduzca una hora y minuto válido con el formato HH y MM");

				}
			} while (this.horaInicio == null);
			
			System.out.println("¿Cuánto duró el paseo? (minutos): ");
			this.minutosPaseo= Float.parseFloat(sc.nextLine());
		
		} catch (InputMismatchException e) {
			System.out.println("Introduzca una cadena de texto");
		}
		
		this.pagado = false;
		
	}

	@Override
	public String toString() {
		
		String resultado="";
		
		resultado += "ID: "+id;
		resultado += "- "+nombrePerro;
		resultado += "- "+horaInicio;
		resultado += "- "+minutosPaseo;
		if (pagado)
		resultado += "- Pagado";
		else 
		resultado += "- Pendiente de pago";


		return resultado;
	}

	public int getId() {
		return id;
	}


	public String getNombrePerro() {
		return nombrePerro;
	}

	public void setNombrePerro(String nombrePerro) {
		this.nombrePerro = nombrePerro;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public float getMinutosPaseo() {
		return minutosPaseo;
	}

	public void setMinutosPaseo(float minutosPaseo) {
		this.minutosPaseo = minutosPaseo;
	}

	public boolean isPagado() {
		return pagado;
	}

	
	
	
	
	//Set pagado 
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
	
	
}
