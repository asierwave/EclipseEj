package Principal;

import java.util.Objects;

public class Insecto implements Comparable<Insecto> {

	private static int secuencia = 1;
	private int codigo;
	private String nombre;
	private String especie;
	
	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getEspecie() {
		return especie;
	}




	public void setEspecie(String especie) {
		this.especie = especie;
	}




	public int getCodigo() {
		return codigo;
	}




	public Insecto(String nombre, String especie) {
		super();
		this.codigo = secuencia+1;
		this.nombre = nombre;
		this.especie = especie;
	}




	@Override
	public String toString() {
		String resultado = "";
		resultado += this.codigo + " "+ this.nombre + " "+ this.especie;
		return resultado;
	}




	@Override
	public int hashCode() {
		return Objects.hash(especie, nombre);
	}


//Dos insectos con el mismo nombre y la misma especie serán iguales según este equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Insecto other = (Insecto) obj;
		return Objects.equals(especie, other.especie) && Objects.equals(nombre, other.nombre);
	}




@Override
public int compareTo(Insecto o) { //Nuestro insecto es int y el insecto con el que se compara es o
	
	if (this.especie.equals(o.especie))
			return this.nombre.compareTo(o.nombre);
	else
		return this.especie.compareTo(o.especie);
	
	
		
}
	
	
	
	
	
	
	
}
