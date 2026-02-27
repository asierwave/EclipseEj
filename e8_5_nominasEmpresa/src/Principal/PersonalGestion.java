package Principal;

public class PersonalGestion extends Trabajador {
	
	private int antiguedad;

	public PersonalGestion(String dni, String nombre, float salarioBase, float salarioFinal, int antiguedad, float complemento) {
		super(dni, nombre, salarioBase, salarioFinal, complemento);
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "PersonalGestion:" + antiguedad + "]";
	}
	
	
	
	
	
	
}
