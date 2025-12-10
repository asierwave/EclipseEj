package Principal;

public class Movil 
{
	private String numero;
	private Tarifa tarifa;
	private double consumo;
	
	public Movil (String numero,Tarifa tarifa)
	{
		this.numero = numero;
		this.tarifa = tarifa;
		this.consumo = 0;
	}
	
	public void llamar (int duracionSegundos)
	{
		this.consumo += duracionSegundos / 60.0;
	}
	
	public void reiniciarFactura()
	{
		this.consumo = 0;
	}
	
	public String toString()
	{
		String resultado="";
		resultado += "Número de móvil "+this.numero+"\n";
		resultado += "Tarifa "+this.tarifa+"\n";
		resultado += "Consumo "+String.format("%.2f \n",this.consumo);
		resultado += "Coste total: "+(this.consumo*this.tarifa.getCosteMinuto());
		return resultado;
	}
	
	
}
