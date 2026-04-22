package Michael;

import java.util.Objects;

public class Bicicleta implements Comparable <Bicicleta>{
	
	private static int secuencia=0;
	private int codigo;
	private String tipo;
	private String color;
	private float precio;
	
	
	public Bicicleta( String tipo, String color, float precio) {
		super();
		this.codigo = secuencia++;
		this.tipo = tipo;
		this.color = color;
		this.precio = precio;
	}


	public int getCodigo() {
		return codigo;
	}



	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Bicicleta [codigo=" + codigo + ", tipo=" + tipo + ", color=" + color + ", precio=" + precio + "]";
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
		Bicicleta other = (Bicicleta) obj;
		return codigo == other.codigo;
	}


	@Override
	public int compareTo(Bicicleta o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.codigo, o.codigo);
	}
	
	
	
	

}
