package Principal;

import java.time.LocalDate;

public class Producto {

	private LocalDate fechaCaducidad;
	private int numeroLote;
	private String paisOrigen;
	private LocalDate fechaEnvasado;
	
	
	
	public Producto(LocalDate fechaCaducidad, int numeroLote, String paisOrigen, LocalDate fechaEnvasado) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}



	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}



	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}



	public int getNumeroLote() {
		return numeroLote;
	}



	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}



	public String getPaisOrigen() {
		return paisOrigen;
	}



	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}



	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}



	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + ", paisOrigen="
				+ paisOrigen + ", fechaEnvasado=" + fechaEnvasado + "]";
	}
	
	
	
	
	
	
	
	
	
}
