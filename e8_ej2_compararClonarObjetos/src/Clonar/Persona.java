package Clonar;

public class Persona 
{
	private String nombre;
	private Mascota mascota;
	
	public Persona (String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setMascota(Mascota m)
	{
		this.mascota = m;
	}
	
	@Override
	protected Persona clone()  
	{
		Persona nueva = new Persona(this.nombre);
		nueva.setMascota(this.mascota.clone());
		return nueva;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", mascota=" + mascota + "]";
	}
}
