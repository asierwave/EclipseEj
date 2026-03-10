package Principal;

import java.time.LocalDate;

public class Guitarra extends Instrumento {

	
	private int nCuerdas;
	private boolean esElectrica;
	
	
	
	public Guitarra(String marca, String nombre, LocalDate fechaAdquisicion, Profesor p, int nCuerdas,
			boolean esElectrica) {
		super(marca, nombre, fechaAdquisicion, p);
		this.nCuerdas = nCuerdas;
		this.esElectrica = esElectrica;
	}



	@Override
	public String toString() {
		String resultado = getMarca().toUpperCase()+" - "+getNombre()+ " ";
		resultado+=getFechaAdquisicion().getDayOfMonth()+"/"+getFechaAdquisicion().getMonthValue()+"/"+getFechaAdquisicion().getYear();
		resultado += " - " +nCuerdas+" cuerdas. ("+(esElectrica ? "Eléctrica": "Acústica")+") --> "+getP().toString();
		return resultado;
	}



	@Override
	public double calcularCosteMantenimiento() {
	
		double costeMantenimiento = 80+(nCuerdas*(double)8);
		
		if (esElectrica) 
			costeMantenimiento *= (double)1.1;
	
		return costeMantenimiento;
	}


}
