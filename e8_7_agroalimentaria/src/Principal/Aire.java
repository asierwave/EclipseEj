package Principal;

import java.time.LocalDate;

public class Aire extends Congelado {

	private float porcNitrogeno;
	private float porcVaporAgua;
	private float porcCO2;
	private float porcOxigeno;
	
	
	public float getPorcNitrogeno() {
		return porcNitrogeno;
	}


	public void setPorcNitrogeno(float porcNitrogeno) {
		this.porcNitrogeno = porcNitrogeno;
	}


	public float getPorcVaporAgua() {
		return porcVaporAgua;
	}


	public void setPorcVaporAgua(float porcVaporAgua) {
		this.porcVaporAgua = porcVaporAgua;
	}


	public float getPorcCO2() {
		return porcCO2;
	}


	public void setPorcCO2(float porcCO2) {
		this.porcCO2 = porcCO2;
	}


	public float getPorcOxigeno() {
		return porcOxigeno;
	}


	public void setPorcOxigeno(float porcOxigeno) {
		this.porcOxigeno = porcOxigeno;
	}


	public Aire(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado,
			float temperaturaMantenimiento, float porcNitrogeno, float porcVaporAgua, float porcCO2,
			float porcOxigeno) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado, temperaturaMantenimiento);
		this.porcNitrogeno = porcNitrogeno;
		this.porcVaporAgua = porcVaporAgua;
		this.porcCO2 = porcCO2;
		this.porcOxigeno = porcOxigeno;
	}
	
	
	
}
