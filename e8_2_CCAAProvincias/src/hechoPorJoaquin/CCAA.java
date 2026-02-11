package hechoPorJoaquin;
// Esta clase hereda de la EntidadTerritorial
// Por lo tanto, además de sus atributos y métodos
// hereda los atributos y métodos de la EntidadTerritorial
// Por lo tanto una CCAA "ES UNA" EntidadTerritorial 
public class CCAA extends EntidadTerritorial
{
	private String capital;
	
	public CCAA (String nombre,String capital)
	{
		super(nombre); // Llama al constructor de la clase base
		this.capital = capital;
	}
	
	public String toString()
	{
		String resultado="";
		resultado += "Código: "+this.getCodigo(); // Uso de métodos heredados
		resultado += " Nombre: "+this.getNombre();
		resultado += " Capital: "+this.capital;
		return resultado;
	}
}
