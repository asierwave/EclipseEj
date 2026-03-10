package Principal;

public class Interior extends Camarote 
{
	private boolean hayAseo;

	public Interior(int numero, String cubierta, boolean hayAseo) 
	{
		super(numero, cubierta);
		this.hayAseo = hayAseo;
	}

	public boolean isHayAseo() {
		return hayAseo;
	}

	public void setHayAseo(boolean hayAseo) {
		this.hayAseo = hayAseo;
	}
	
	public int calcularPrecio (int dias)
	{
		int precio;
		precio = 200 * dias;
		precio += (hayAseo)?precio*0.15:0;
		return precio;
	}
	
	@Override
	public String toString()
	{
		String resultado ="";
		resultado += super.toString()+" ";
		resultado += "Aseo: "+((this.hayAseo)?"Sí":"No");
		return resultado;
	}
}
