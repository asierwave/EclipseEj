package Principal;

public class Programador extends Informatico {

	
	
	public Programador(String dni, String nombre, float salarioBase, float salarioFinal, float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, complemento);
		complemento = (float) 0.15;
		salarioFinal = salarioBase + salarioBase+(salarioBase*complemento);
	}

	@Override
	public String toString() {
		return "Programador:"+super.toString();
	}
	
	
	
	
	
}
