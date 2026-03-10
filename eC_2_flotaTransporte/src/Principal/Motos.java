package Principal;

import java.time.LocalDate;

public class Motos extends Vehiculo {

	private boolean llevaCasco;
	private boolean esUsoPaseo;
	
	
	
	public Motos(String codigo, String modelo, Conductor c, LocalDate fechaFabricacion, boolean llevaCasco,
			boolean esUsoPaseo) {
		super(codigo, modelo, c, fechaFabricacion);
		this.llevaCasco = llevaCasco;
		this.esUsoPaseo = esUsoPaseo;
	}



	@Override
	public String toString() {
	
		String resultado = "\n\nMoto:";
		resultado += "\nModelo= "+ super.getModelo();
		resultado += "\nIdentificador= "+ super.getCodigo();
		resultado += "\nFabricación=" + super.getFechaFabricacion();
		resultado += "\n¿Lleva casco?=" + llevaCasco;
		resultado += "\n ¿Se usa de Paseo?="+ esUsoPaseo;
		resultado += "\n"+ getC().toString();
		return resultado; 
	}

	
	
	
	
	
	
	
}
