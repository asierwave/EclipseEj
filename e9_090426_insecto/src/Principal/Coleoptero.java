package Principal;

public class Coleoptero extends Insecto {

	private String color;

	public Coleoptero(String nombre, String especie, String color) {
		super(nombre, especie);
		this.color = color;
	}
	
	
	
	public String toString() 
	{
		String resultado = "";
		resultado+= super.toString()+" "+this.color;
		
		return resultado;
	}
	
}
