package Principal.Modelo;

public class Administrativo extends Gestion {

	private static int complemento=20;

	public Administrativo(String dni, String nombre, float salarioBase, String titulacion) {
		super(dni, nombre, salarioBase, titulacion);
		setSalarioFinal(salarioBase*(1+complemento));
	
	}
	
	public String toString() {
		String resultado = "ADMIN: ";
		resultado += super.toString()+ " ";
		return resultado;
		
	}
	


	
	
	
}
