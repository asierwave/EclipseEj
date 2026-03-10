package Principal;

import java.time.LocalDate;

public class Agua extends Congelado {

	
	private float salinidad;

	public Agua(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado,
			float temperaturaMantenimiento, float salinidad) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado, temperaturaMantenimiento);
		this.salinidad = salinidad;
	}

	public float getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(float salinidad) {
		this.salinidad = salinidad;
	}
	
	
	
	
}
