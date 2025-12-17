package Principal;

public class Asientos 
{
	private boolean ventana;
	private boolean sentidoMarcha;
	private int fila;
	private char posicion;
	
	public Asientos (boolean ventana,boolean sentidoMarcha)
	{
		this.ventana = ventana;
		this.sentidoMarcha = sentidoMarcha;
		calcularPosicion();
	}
	
	public Asientos (boolean ventana,boolean sentidoMarcha,int fila)
	{
		this.ventana = ventana;
		this.sentidoMarcha = sentidoMarcha;
		this.fila = fila;
		calcularPosicion();
	}
	
	private void calcularPosicion()
	{
		if (sentidoMarcha)
			if (ventana)
				posicion = 'A';
			else
				posicion = 'B';
		else
			if (ventana)
				posicion = 'C';
			else
				posicion = 'D';
	}
	
	public void setFila(int fila)
	{
		this.fila = fila;
	}
	
	public String toString()
	{
		return "Asiento Fila "+fila+"      Posicion "+posicion;
	}
}
