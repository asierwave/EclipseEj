package Principal;

import java.time.LocalDate;

public class Camion extends Vehiculo {

	private int capacidadCarga;
	
	
	public Camion(String codigo, String modelo, Conductor c, LocalDate fechaFabricacion, int capacidadCarga) {
		super(codigo, modelo, c, fechaFabricacion);
		this.capacidadCarga = capacidadCarga;
	}
	


	@Override
	public String toString() {
	
		String resultado = "\n\nCamión:";
		resultado += "\nModelo= "+ super.getModelo();
		resultado += "\nIdentificador= "+ super.getCodigo();
		resultado += "\nFabricación=" + super.getFechaFabricacion();
		resultado += "\nCapacidad de carga=" +capacidadCarga+" TN";
		resultado += "\n"+ getC().toString();

		return resultado; 
	}

	
	
	
	
}
