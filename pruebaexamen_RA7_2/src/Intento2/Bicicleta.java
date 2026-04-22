package Intento2;

import java.util.Objects;

public class Bicicleta implements Comparable {
	private static int secuencia=1;
	private int codigo;
	private String tipo;
	private String color;
	private float precioPorHora;
	
	
	public Bicicleta(String tipo, String color, float precioPorHora) {
		super();
		this.codigo = secuencia++;
		this.tipo = tipo;
		this.color = color;
		this.precioPorHora = precioPorHora;
	}


	public static int getSecuencia() {
		return secuencia;
	}


	public static void setSecuencia(int secuencia) {
		Bicicleta.secuencia = secuencia;
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrecioPorHora() {
		return precioPorHora;
	}


	public void setPrecioPorHora(float precioPorHora) {
		this.precioPorHora = precioPorHora;
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
	public String toString() {
		return "Bicicleta [codigo=" + codigo + ", tipo=" + tipo + ", color=" + color + ", precioPorHora="
				+ precioPorHora + "]";
	}





	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getCodigo(), ((Bicicleta) o).getCodigo());
	}
	
	
	
	
	
	
	
	
}
