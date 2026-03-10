package Principal;

import java.time.LocalDate;

public class Refrigerado extends Producto {

	private String codOSA;
	private float temperaturaMantenimiento;
	
	
	
	public String getCodOSA() {
		return codOSA;
	}



	public void setCodOSA(String codOSA) {
		this.codOSA = codOSA;
	}



	public float getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}



	public void setTemperaturaMantenimiento(float temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}



	public Refrigerado(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado,
			String codOSA, float temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
		this.codOSA = codOSA;
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	
	
	
	
	
}
