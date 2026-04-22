package Principal;

import java.util.Objects;

public class Herramienta implements Comparable  {

	private static int secuencia=1;
	private int codigo;
	private String tipo;
	private Float precioAlquiler;
	
	
	
	public Herramienta(String tipo, Float precioAlquiler) {
		super();
		this.codigo = secuencia++;
		this.tipo = tipo;
		this.precioAlquiler = precioAlquiler;
	}





	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Float getPrecioAlquiler() {
		return precioAlquiler;
	}



	public void setPrecioAlquiler(Float precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}


	@Override
	public String toString() {
		return "Herramienta " + codigo + ", de tipo " + tipo + " y precio por día de " + precioAlquiler+"€";
	}





	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Herramienta other = (Herramienta) obj;
		return codigo == other.codigo;
	}





	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.codigo, ((Herramienta) o).getCodigo());
	}
	
	
	
	
	
	
	
	
}
