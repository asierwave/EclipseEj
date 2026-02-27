package Principal.Modelo;

public class Informatico extends Trabajador {
	
	private String titulacion;

	public Informatico(String dni, String nombre, float salarioBase, String titulacion) {
		super(dni, nombre, salarioBase);
		this.titulacion = titulacion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	
	public String toString() {
		String resultado = "";
		resultado += super.toString()+ " ";
		resultado += this.titulacion;
		return resultado;
		
	}
	
	

}
