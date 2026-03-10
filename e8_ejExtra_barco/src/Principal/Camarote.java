package Principal;

public abstract class Camarote 
{
	private int numero;
	private String cubierta;
	
	public Camarote(int numero, String cubierta) 
	{
		super();
		this.numero = numero;
		this.cubierta = cubierta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCubierta() {
		return cubierta;
	}

	public void setCubierta(String cubierta) {
		this.cubierta = cubierta;
	}
	
	public abstract int calcularPrecio (int dias);

	public String toString()
	{
		String resultado = "";
		resultado += this.numero+" "+this.cubierta;
		return resultado;
	}
}
