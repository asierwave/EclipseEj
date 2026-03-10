package Principal;

import java.time.LocalDate;

public class Congelado extends Producto {

	private float temperaturaMantenimiento;

	public Congelado(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado, float temperaturaMantenimiento) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}

	@Override
	public String toString() {
		return "Congelado [temperaturaMantenimiento=" + temperaturaMantenimiento + "]"+super.toString();
	}

	public float getTemperaturaMantenimiento() {
		return temperaturaMantenimiento;
	}

	public void setTemperaturaMantenimiento(float temperaturaMantenimiento) {
		this.temperaturaMantenimiento = temperaturaMantenimiento;
	}
	
	
	
	
	
}
