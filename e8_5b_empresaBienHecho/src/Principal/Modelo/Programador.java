package Principal.Modelo;

public class Programador extends Informatico {

	private static float complemento = 0.15F;

	public Programador(String dni, String nombre, float salarioBase, String titulacion) {
		super(dni, nombre, salarioBase, titulacion);
		this.setSalarioFinal(salarioBase*(1+complemento));
	
	}
	
	public String toString() {
		//StringBuilder resultado = new StringBuilder("");  A diferencia del toString, es mutable
		
		String resultado=""; 
		resultado+= "PROGRAMADOR"+super.toString();
		return resultado;
		
	}
	
	
}
