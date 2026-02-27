package Principal.Modelo;

public class Auxiliar extends Gestion {
	private static int complemento = 100;

	public Auxiliar(String dni, String nombre, float salarioBase, String titulacion) {
		super(dni, nombre, salarioBase, titulacion);
		this.setSalarioFinal(salarioBase+complemento);

	}
	
	public String toString() {
		String resultado = "AUXILIAR: ";
		resultado += super.toString()+ " ";
		return resultado;
		
	}
	
	
}
