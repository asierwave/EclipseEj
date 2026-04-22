package Principal;

import java.util.Comparator;
import java.util.Objects;

public class Bicicleta implements Comparable<Bicicleta> {

	static int secuencia=1;
	int codigo;
	String tipo;
	String color;
	float alquilerHora;
	
	
	
	public Bicicleta(String tipo, String color, float alquilerHora) {
		this.codigo = secuencia++;
		this.tipo = tipo;
		this.color = color;
		this.alquilerHora = alquilerHora;
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



	public float getAlquilerHora() {
		return alquilerHora;
	}



	public void setAlquilerHora(float alquilerHora) {
		this.alquilerHora = alquilerHora;
	}











	@Override
	public int hashCode() {
		return Objects.hash(alquilerHora, codigo, color, tipo);
	}



	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null) return false;
	    if (getClass() != obj.getClass()) return false;

	    Bicicleta other = (Bicicleta) obj;
	    return this.codigo == other.codigo;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		bicicleta other = (bicicleta) obj;
//		return Float.floatToIntBits(alquilerHora) == Float.floatToIntBits(other.alquilerHora) && codigo == other.codigo
//				&& Objects.equals(color, other.color) && Objects.equals(tipo, other.tipo);
//	}



	@Override
	public String toString() {
		return "bicicleta " + codigo + ", de tipo " + tipo + ", color " + color + ", y alquiler por hora de " + alquilerHora
				+ "€";
	}


	// Le damos orden natural según el codigo de las bicicletas

	@Override
	public int compareTo(Bicicleta o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.codigo, codigo);
	}
	
	

	
	
	
}
