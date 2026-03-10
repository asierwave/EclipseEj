package Principal;

import java.util.Objects;

public abstract class Vehiculo implements Cloneable, Comparable<Vehiculo> {

	private String marca;
	private int anyo;
	
	
	public Vehiculo(String marca, int anyo) {
		super();
		this.marca = marca;
		this.anyo = anyo;
	}

	   @Override
	    public int compareTo(Vehiculo otro) {
	        return Integer.compare(this.anyo, otro.anyo);
	    }




	public abstract String describir();



	@Override
	public int hashCode() {
		return Objects.hash(anyo, marca);
	}



	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getAnyo() {
		return anyo;
	}



	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return anyo == other.anyo && Objects.equals(marca, other.marca);
	}

	
}