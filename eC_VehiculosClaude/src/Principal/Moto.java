package Principal;

public class Moto extends Vehiculo {
	private int cilindrada;
	
	
	
	public Moto(String marca, int anyo, int cilindrada) {
		super(marca, anyo);
		this.cilindrada = cilindrada;
	}



	@Override
	public String describir() {
		String mensaje = "Moto:"+getMarca()+" "+getAnyo();
		mensaje+=", "+this.cilindrada+"cc";
		return mensaje;
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
