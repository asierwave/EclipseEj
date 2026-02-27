package Principal;

import java.util.Scanner;

public class Informatico extends Trabajador {

	public Informatico(String dni, String nombre, float salarioBase, float salarioFinal, float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, complemento);
	}
	
	@Override
	public String toString() {
		return "Informático: "+super.toString();
	}
	
	
	

}
