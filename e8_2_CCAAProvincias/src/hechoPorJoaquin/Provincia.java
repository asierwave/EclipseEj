package hechoPorJoaquin;
//Esta clase hereda de la EntidadTerritorial
//Por lo tanto, además de sus atributos y métodos
//hereda los atributos y métodos de la EntidadTerritorial
//Por lo tanto una Provincia "ES UNA" EntidadTerritorial 
public class Provincia extends EntidadTerritorial
{
	
	private int poblacion;
	//private int codigoCCAA; // Modelo relacional (Foreing key)
	private CCAA comunidadAutonoma; // Modelo OO (referencia al objeto completo)
	
	public Provincia (String nombre,int poblacion)
	{
		super(nombre); // Llama al constructor de la clase base
		this.poblacion = poblacion;
	}
	
	public void setComunidadAutonoma (CCAA ca)
	{
		this.comunidadAutonoma = ca;
	}
	
	public String toString()
	{
		String resultado="";
		resultado += super.toString(); // Llama al método de la clase base
		resultado += " Población: "+this.poblacion;
		if (comunidadAutonoma!=null)
			resultado += " CCAA:"+comunidadAutonoma.getNombre();
		return resultado;
	}
}
