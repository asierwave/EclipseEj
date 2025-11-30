package Principal;

import java.util.Scanner;

public class Vehiculo 
{
	private String matricula;
	private String etiquetaAmbiental;
	private int minutosEstacionado;
	private boolean tieneAbono;
	private float importeTotal;
	
	public Vehiculo(String matricula, String etiquetaAmbiental, int minutosEstacionado, boolean tieneAbono) {
		super();
		this.matricula = matricula;
		this.etiquetaAmbiental = etiquetaAmbiental;
		this.minutosEstacionado = minutosEstacionado;
		this.tieneAbono = tieneAbono;
		this.importeTotal = -1.0f;
	}
	
	public Vehiculo (Scanner sc)
	{
		System.out.println("Introduzca matrícula");
		this.matricula = sc.nextLine();
		System.out.println("Introduzca etiqueta ambiental");
		this.etiquetaAmbiental = sc.nextLine();
		System.out.println("Introduzca minutos");
		this.minutosEstacionado = sc.nextInt();
		System.out.println("¿Tiene abono?");
		this.tieneAbono = sc.nextBoolean();
		sc.nextLine();
		this.importeTotal = -1.0f;
	}

	public void calcularImporte (float tarifa)
	{
		float descuento = 0 ;
		this.importeTotal = (this.minutosEstacionado / 60.0f) * tarifa;
		
		this.etiquetaAmbiental = this.etiquetaAmbiental.toUpperCase();
		/*
		descuento = this.etiquetaAmbiental.equals("B")?0.1f:descuento;
		descuento = this.etiquetaAmbiental.equals("C")?0.2f:descuento;
		descuento = this.etiquetaAmbiental.equals("0")?0.5f:descuento;

		*/
		descuento = this.etiquetaAmbiental.equals("B")?0.1f:
					this.etiquetaAmbiental.equals("C")?0.2f:
					this.etiquetaAmbiental.equals("0")?0.5f:0;

		importeTotal = importeTotal * (1-descuento);
		
		importeTotal -= (this.tieneAbono)?3:0;
		importeTotal = (importeTotal <0)? 0:importeTotal;
	}

	@Override
	public String toString() 
	{
		String resultado ="";
		resultado += matricula + ", etiqueta Ambiental=" + etiquetaAmbiental;
		resultado += " tiempo:" + minutosEstacionado+"min";
		resultado += ", tieneAbono=" + tieneAbono + "\n Importe: ";
		resultado += (importeTotal==-1.0f)? "No se ha calculado": importeTotal;
	return resultado;
	}
}
