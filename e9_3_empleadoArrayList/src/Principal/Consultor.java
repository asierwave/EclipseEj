package Principal;

public class Consultor extends Empleado {

	private double precioHora;
	private int numHoras;
	

	public Consultor(String nombre, String nSegSocial, double sueldoBase, double precioHora, int numHoras) {
		super(nombre, nSegSocial, sueldoBase);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}
	
	



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
