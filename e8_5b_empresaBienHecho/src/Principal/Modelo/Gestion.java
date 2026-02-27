package Principal.Modelo;

public class Gestion extends Trabajador {

	
	private String antiguedad;


	public Gestion(String dni, String nombre, float salarioBase, String antiguedad) {
		super(dni, nombre, salarioBase);
		this.antiguedad = antiguedad;
	}

	public String getTitulacion() {
		return antiguedad;
	}

	public void setTitulacion(String antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	public String toString() {
		String resultado = "";
		resultado += super.toString()+ " ";
		resultado += this.antiguedad;
		return resultado;
		
	}
	
	
	
	
}
