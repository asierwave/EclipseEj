package Principal.Modelo;

public class Analista extends Informatico {

	private static float complemento=0.30F; //static porque es igual para todos los analistas que se creen

	public Analista(String dni, String nombre, float salarioBase, String titulacion) {
		super(dni, nombre, salarioBase, titulacion);
		this.setSalarioFinal((float)salarioBase*(1+complemento));
	}
	
	
	public String toString() {
		//StringBuilder resultado = new StringBuilder("");  A diferencia del toString, es mutable
		
		String resultado=""; 
		resultado+= "ANALISTA: "+super.toString()+ this.getSalarioFinal();
		return resultado;
		
	}
}


