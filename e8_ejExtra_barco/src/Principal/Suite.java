package Principal;

public class Suite extends Camarote
{
	private int nCamas;

	public Suite(int numero, String cubierta, int nCamas) 
	{
		super(numero, cubierta);
		this.nCamas = nCamas;
	}

	public int getnCamas() {
		return nCamas;
	}

	public void setnCamas(int nCamas) {
		this.nCamas = nCamas;
	}
	



	@Override
	public String toString() 
	{
		return "Suite [nCamas=" + nCamas + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int calcularPrecio (int dias)
	{
		int precio;
		precio = 400 * dias;
		precio += nCamas * 0.3;
		return precio;
	}
}
