package Principal;

import java.time.LocalDate;

public class Tambor extends Instrumento {

	private float diametro; //en cm
	
	
	
	
	
	public Tambor(String marca, String nombre, LocalDate fechaAdquisicion, Profesor p, float diametro) {
		super(marca, nombre, fechaAdquisicion, p);
		this.diametro = diametro;
	}





	@Override
	public String toString() {
		String resultado = getMarca().toUpperCase()+" - "+getNombre()+ " "+getFechaAdquisicion().getDayOfMonth()+"/"+getFechaAdquisicion().getMonthValue()+"/"+getFechaAdquisicion().getYear()+" - "+diametro+ " cm --> "+getP().toString();
		return resultado;
	}



	@Override
	public double calcularCosteMantenimiento() {
		double costeMantenimiento = 50+(diametro*(double)0.3);
		
		return costeMantenimiento;
	}

}
