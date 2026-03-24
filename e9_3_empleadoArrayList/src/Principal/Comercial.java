package Principal;

public class Comercial extends Empleado {
	private double comision;
	
	
	
	
	
	public Comercial(String nombre, String nSegSocial, double sueldoBase, double comision) {
		super(nombre, nSegSocial, sueldoBase);
		this.comision = comision;
	}





	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
