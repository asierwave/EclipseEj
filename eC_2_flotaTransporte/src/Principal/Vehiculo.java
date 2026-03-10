package Principal;

import java.time.LocalDate;

public abstract class Vehiculo implements Cloneable, Comparable<Vehiculo> {
	private String codigo;
	private String modelo;
	private Conductor c;
	@Override
	
	
	public int compareTo(Vehiculo v) {
		int resultado;
		resultado=this.getFechaFabricacion().compareTo(v.getFechaFabricacion());
		
		if (resultado == 0) {
			resultado = this.getModelo().compareTo(v.getModelo());
		}
			
		return resultado;
				
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	    Vehiculo clon = (Vehiculo) super.clone();
	    clon.setC(new Conductor(this.c.getNombre())); // nuevo conductor, nuevo id

		return clon;
	}




	public boolean equals(Object obj) {
		
		
		if (obj == null) return false; //para evitar que no pete el método porque si en null el objeto comparacion peta
		
		Vehiculo otro = (Vehiculo)obj;
		
		if (this.getClass()!=otro.getClass())return false;
		
		if (this.getModelo().equals(otro.getModelo())) return true;
		
		return false;
	
	}




	private LocalDate fechaFabricacion;
	
	
	public Vehiculo(String codigo, String modelo, Conductor c, LocalDate fechaFabricacion) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.fechaFabricacion = fechaFabricacion;
		this.c = c;
	}


	public String getCodigo() {
		return codigo;
	}


	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}


	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Conductor getC() {
		return c;
	}


	public void setC(Conductor c) {
		this.c = c;
	}
	
	
	
	
	public abstract String toString();

	
	
	
	
	

}
