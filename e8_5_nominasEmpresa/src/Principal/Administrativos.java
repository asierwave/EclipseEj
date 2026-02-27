package Principal;

public class Administrativos extends PersonalGestion {
	
	
	public Administrativos(String dni, String nombre, float salarioBase, float salarioFinal, int antiguedad,
			float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, antiguedad, complemento);
		complemento = 20;
		salarioFinal = salarioBase+(complemento*antiguedad);
		
	}


	@Override
	public String toString() {
		return "Administrativos: "+super.toString();
	}

	
	
	
}
