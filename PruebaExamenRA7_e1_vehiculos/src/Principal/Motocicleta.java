package Principal;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
	
	private int cilindrica;

	public Motocicleta(String matricula, String modelo, LocalDate fechaMatricula, Conductor conductor, int cilindrica) {
		super(matricula, modelo, fechaMatricula, conductor);
		this.cilindrica = cilindrica;
	}
	
	
	
	
	public int getCilindrica() {
		return cilindrica;
	}




	public void setCilindrica(int cilindrica) {
		this.cilindrica = cilindrica;
	}




	@Override
	public float calcularCosteMantenimiento() {
		float mantenimiento;
		mantenimiento = (this.cilindrica>50)?120:60;
		return mantenimiento;
	}
	
	public String toString() {
		String respuesta = "";
		respuesta += super.toString();
		respuesta += this.cilindrica+" cc.  ---> "+this.getConductor();
		return respuesta;
	}

}
