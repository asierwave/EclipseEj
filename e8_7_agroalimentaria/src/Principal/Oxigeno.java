package Principal;

import java.time.LocalDate;

public class Oxigeno extends Congelado {
	
	private String metodoCongelacio;
	private int tiempoExposicion;
	
	
	
	public Oxigeno(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado,
			float temperaturaMantenimiento, String metodoCongelacio, int tiempoExposicion) {
		super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado, temperaturaMantenimiento);
		this.metodoCongelacio = metodoCongelacio;
		this.tiempoExposicion = tiempoExposicion;
	}



	public String getMetodoCongelacio() {
		return metodoCongelacio;
	}



	public void setMetodoCongelacio(String metodoCongelacio) {
		this.metodoCongelacio = metodoCongelacio;
	}



	public int getTiempoExposicion() {
		return tiempoExposicion;
	}



	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	
	
	

}
