package Principal;

public class Coche extends Vehiculo {
	
	private int numeroPuertas;



	public Coche(String marca, int anyo, int numeroPuertas) {
		super(marca, anyo);
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String describir() {
		
		String mensaje = "Coche:"+getMarca()+" "+getAnyo();
		mensaje+=", "+this.numeroPuertas+" puertas";
		return mensaje;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
