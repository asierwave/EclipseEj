package Principal;

public class Conductor {

	private static int secuencia = 1;
	private String nombre;
	private int identificador;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
		this.identificador = this.secuencia++;
	}
	
	
	
	@Override
	public String toString() {
	
		String resultado = "\n\nConductor:";
		resultado += "\nNombre= "+ nombre;
		resultado += ", Identificador= "+this.identificador;
		return resultado; 
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public static int getSecuencia() {
		return secuencia;
	}



	public int getIdentificador() {
		return identificador;
	}



	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}



	public static void setSecuencia(int secuencia) {
		Conductor.secuencia = secuencia;
	}

	
	

	
	
}
