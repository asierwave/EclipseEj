package Principal;

public class Auxiliares extends PersonalGestion {
	
	
	public Auxiliares(String dni, String nombre, float salarioBase, float salarioFinal, int antiguedad,
			float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, antiguedad, complemento);
		complemento = 100;
		salarioFinal = salarioBase+complemento;
		
	}


	@Override
	public String toString() {
		return "Auxiliares: "+super.toString();
	}

	
	
	
	
	
}

