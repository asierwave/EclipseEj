package Principal;

import java.time.LocalDate;

public class Piano extends Instrumento {

	
	private int nTeclas;
	private boolean deCola;
	
	
	
	public Piano(String marca, String nombre, LocalDate fechaAdquisicion, Profesor p, int nTeclas, boolean deCola) {
		super(marca, nombre, fechaAdquisicion, p);
		this.nTeclas = nTeclas;
		this.deCola = deCola;
	}



	@Override
	public String toString() {
		String resultado = getMarca().toUpperCase()+" - "+getNombre()+ " "+getFechaAdquisicion().getDayOfMonth()+"/"+getFechaAdquisicion().getMonthValue()+"/"+getFechaAdquisicion().getYear()+" - ";
		resultado += nTeclas+" teclas. ("+(deCola ? "De Cola": "No es De Cola, es de Pared")+") --> "+getP().toString();
		return resultado;
	}

	


	@Override
	public double calcularCosteMantenimiento() {
		
		double costeMantenimiento = 150+(nTeclas*(double)0.5);
		
		if (deCola) 
			costeMantenimiento *= (double)1.2;

		return costeMantenimiento;
	}


}
