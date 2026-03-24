package Principal;

public abstract class Empleado implements Comparable<Empleado> {

	private String nombre;
	private String nSegSocial;
	private double sueldoBase;
	
	
	public Empleado(String nombre, String nSegSocial, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.nSegSocial = nSegSocial;
		this.sueldoBase = sueldoBase;
	}


	public abstract String toString();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getnSegSocial() {
		return nSegSocial;
	}


	public void setnSegSocial(String nSegSocial) {
		this.nSegSocial = nSegSocial;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	

	
}

