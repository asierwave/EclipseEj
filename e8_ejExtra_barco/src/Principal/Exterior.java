package Principal;

public class Exterior extends Camarote 
{
	private boolean hayTerraza;
	private String vista;
	
	public Exterior(int numero, String cubierta, boolean hayTerraza, String vista) 
	{
		super(numero, cubierta);
		this.hayTerraza = hayTerraza;
		this.vista = vista;
	}

	public boolean isHayTerraza() {
		return hayTerraza;
	}

	public void setHayTerraza(boolean hayTerraza) {
		this.hayTerraza = hayTerraza;
	}

	public String getVista() {
		return vista;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}
	
	public int calcularPrecio (int dias)
	{
		int precio;
		precio = 350 * dias;
		precio += (hayTerraza)?precio*0.25:0;
		return precio;
	}
	
	@Override
	public String toString()
	{
		String resultado ="";
		resultado += "N."+getNumero();
		resultado += " Cubierta:"+this.getCubierta();
		resultado += " Terraza:"+(hayTerraza?"Sí":"No");
		resultado += " Vistas:"+this.vista;
		return resultado;
	}
}
