package Principal;

import java.util.Scanner;

public class Analista extends Informatico {

	public Analista(String dni, String nombre, float salarioBase, float salarioFinal, float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, complemento);
		complemento = (float) 0.3;
		salarioFinal = salarioBase + salarioBase+(salarioBase*complemento);
	}
	
	
	@Override
	public String toString() {
		return "Analista []"+super.toString();
	}
	
	
	
	
	
	

}
