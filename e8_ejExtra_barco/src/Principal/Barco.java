package Principal;

public class Barco 
{
	private static int secuencia = 1;
	private int codigo;
	private String nombre;
	private Camarote vector[];
	private int nCamarotesActual;
	
	
	public Barco(String nombre,int nMaximoCamarotes) 
	{
		super();
		this.codigo = secuencia++;
		this.nombre = nombre;
		vector = new Camarote[nMaximoCamarotes];
		nCamarotesActual = 0;
	}
	
	public boolean alta(Camarote c)
	{
		boolean exito = false;
		if (this.nCamarotesActual<vector.length)
		{
			vector[this.nCamarotesActual] = c;
			this.nCamarotesActual++;
			exito = true;
		}
		return false;
	}
	
	
	public String toString()
	{
		String resultado="";
		resultado += this.codigo+" "+this.nombre+"\n";
		for (int i=0;i<this.nCamarotesActual;i++)
			resultado += vector[i]+" "+vector[i].calcularPrecio(7)+"\n";
		return resultado;
	}
	
	
	
	
}
