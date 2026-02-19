package Clonar;

public class Mascota 
{
	private String apodo;
	
	public Mascota(String apodo)
	{
		this.apodo = apodo;
	}
	
	public void setApodo(String apodo)
	{
		this.apodo = apodo;
	}

	
	@Override
	protected Mascota clone()
	{
		Mascota m= new Mascota (this.apodo);
		return m;
	}

	@Override
	public String toString() {
		return "Mascota [apodo=" + apodo + "]";
	}
}
