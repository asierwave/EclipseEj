package Principal;

import java.util.Scanner;

public class Vehiculo {

	private String matricula, etiquetaAmbiental;
	private int minutosEstacionado;
	private boolean tieneAbono = true;
	private float importeTotal = -1.0f;

	private String mensajeAbono;

	public Vehiculo(String matricula, String etiquetaAmbiental, int minutosEstacionado, boolean tieneAbono) {
		super();
		this.matricula = matricula;
		this.etiquetaAmbiental = etiquetaAmbiental;
		this.minutosEstacionado = minutosEstacionado;
		this.tieneAbono = tieneAbono;
		this.mensajeAbono = (tieneAbono == true) ? "si" : "no";

	}

	public Vehiculo(Scanner teclado) {
		super();
		System.out.println("Escribe la matrícula de tu coche: ");
		this.matricula = teclado.nextLine();
		System.out.println(this.matricula);
		System.out.println("Escribe la etiqueta ambiental de tu coche: ");
		this.etiquetaAmbiental = (teclado.nextLine()).toUpperCase();
		System.out.println(this.etiquetaAmbiental);
		System.out.println("Indica los minutos que has estado estacionado: ");
		this.minutosEstacionado = teclado.nextInt();
		System.out.println(this.minutosEstacionado);
		System.out.println("Dime si tienes abono (Sí: Escribe True / No: Escribe False) ");
		this.tieneAbono = teclado.nextBoolean();
		teclado.nextLine();
		System.out.println(this.tieneAbono);
		this.mensajeAbono = (tieneAbono == true) ? "si" : "no";

	}

	public float calcularImporte() {

		final double tarifaGeneralxHora = 2.5;

		// Calculo de importe por minuto estacionado
		importeTotal = (float) ((minutosEstacionado / 60f) * tarifaGeneralxHora);

		// System.out.println("A"+importeTotal);

		// Descuento por etiqueta ambiental
		importeTotal = (float) ((etiquetaAmbiental == "B") ? (float) importeTotal * 0.9f
				: ((etiquetaAmbiental == "C") ? (float) importeTotal * 0.8f
						: ((etiquetaAmbiental == "0") ? (float) importeTotal * 0.5f : importeTotal)));

		// System.out.println("B"+importeTotal);

		// Descuento por abono, evitar que importe quede negativo

		importeTotal = (tieneAbono == true && importeTotal > 3f) ? importeTotal - 3f : importeTotal;

		System.out.println(imprimir());
		imprimirv2();

		// Imprimir el resto
		// System.out.println("\n \n Vehiculo [matricula="+getMatricula()+ ",
		// etiquetaAmbiental=" +getEtiquetaAmbiental()+ ", minutosEstacionado="
		// +getMinutosEstacionado()+ ", tieneAbono=" +getMensajeAbono()+"]");

		// Imprimir importe total float 2 decimales
		// System.out.printf("\n tiene un importe total de %.2f", importeTotal);

		return importeTotal;

	}

	public String imprimir() {
		String mensaje;
		mensaje = "\n \n Vehiculo [matricula=" + matricula + ", etiquetaAmbiental=" + etiquetaAmbiental
				+ ", minutosEstacionado="
				+ minutosEstacionado + ", tieneAbono=" + mensajeAbono + "]";
		return mensaje;
	}
	
	
	
	//GETTERS & SETTERS
	

	public void imprimirv2() {
		System.out.printf("%.2f", importeTotal);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEtiquetaAmbiental() {
		return etiquetaAmbiental;
	}

	public void setEtiquetaAmbiental(String etiquetaAmbiental) {
		this.etiquetaAmbiental = etiquetaAmbiental;
	}

	public int getMinutosEstacionado() {
		return minutosEstacionado;
	}

	public void setMinutosEstacionado(int minutosEstacionado) {
		this.minutosEstacionado = minutosEstacionado;
	}

	public boolean isTieneAbono() {
		return tieneAbono;
	}

	public void setTieneAbono(boolean tieneAbono) {
		this.tieneAbono = tieneAbono;
	}

	public float getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(float importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getMensajeAbono() {
		return mensajeAbono;
	}

	public void setMensajeAbono(String mensajeAbono) {
		this.mensajeAbono = mensajeAbono;
	}

}
