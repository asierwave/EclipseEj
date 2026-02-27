package angel;

import java.time.LocalTime;
import java.util.Scanner;

public class Paseo 
{
	private static int secuencia=1;
	private int id;
	private String nombrePerro;
	private LocalTime horaInicio;
	private float minutosPaseo;
	private boolean pagado;
	
	public Paseo( String nombrePerro, LocalTime horaInicio, float minutosPaseo) {
		
		this.id = secuencia++;
		this.nombrePerro = nombrePerro;
		this.horaInicio = horaInicio;
		this.minutosPaseo = minutosPaseo;
		this.pagado=false;
	}
	
	public Paseo(Scanner sc) 
	{
		int hora,minuto;
		System.out.println("introduce un nombre");
		sc.nextLine();
		this.nombrePerro=sc.nextLine();
		System.out.println("introduce la hora y minuto");
		hora=sc.nextInt();
		minuto=sc.nextInt();
		this.horaInicio=LocalTime.of(hora, minuto);
		System.out.println("introduce el tiempo del paseo");
		this.minutosPaseo=sc.nextFloat();
		this.pagado=false;
		this.id=secuencia++;
		sc.nextLine();
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getNombrePerro() {
		return nombrePerro;
	}

	public String toString() 
	{
		String resultado="";
		 resultado+="ID: "+this.id +"-"+this.nombrePerro +"-"+
		String.format("%02d:%02d", this.horaInicio.getHour(),this.horaInicio.getMinute())+"-"
				+this.minutosPaseo+ "min"+ "-";
		 resultado+=(this.pagado)?"Pagado":"Pendiente de pago";
		 return resultado;
			 
	}
	
	
	


}
