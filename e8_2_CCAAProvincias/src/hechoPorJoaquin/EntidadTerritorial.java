package hechoPorJoaquin;
// Constituye la clase base de una relación de herencia
public class EntidadTerritorial 
{
	private static int secuencia = 1;
	private int codigo;
	private String nombre;
	
	// Constructor
	public EntidadTerritorial (String nombre)
	{
		this.codigo = secuencia++;
		this.nombre = nombre;
	}
	// Getters y setters
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	// Método toString
	public String toString()
	{
		String resultado ="";
		resultado += "(*)Código: "+this.codigo;
		resultado += " Nombre: "+this.nombre;
		return resultado;
	}
	
}
