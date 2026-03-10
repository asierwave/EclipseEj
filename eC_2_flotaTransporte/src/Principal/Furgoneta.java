package Principal;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo {

	public Furgoneta(String codigo, String modelo, Conductor c, LocalDate fechaFabricacion) {
		super(codigo, modelo, c, fechaFabricacion);
	}
	
	
	@Override
	public String toString() {
	
		String resultado = "\n\nFurgoneta:";
		resultado += "\nModelo= "+ super.getModelo();
		resultado += "\nIdentificador= "+ super.getCodigo();
		resultado += "\nFabricación=" + super.getFechaFabricacion();
		resultado += "\n"+ getC().toString();
		return resultado; 
	}

	
	
	
}
