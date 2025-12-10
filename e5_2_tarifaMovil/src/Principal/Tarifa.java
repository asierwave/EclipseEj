package Principal;
// Elefante (coste a 0,30€ minuto), Tigre (0,18€ minuto) y Gato (0,07€ minuto).
public enum Tarifa 
{
	ELEFANTE (0.30),
	TIGRE (0.18),
	GATO (0.07),
	PULGA (0.001);
	
	private double costeMinuto;
	
	private Tarifa (double costeMinuto)
	{
		this.costeMinuto = costeMinuto;
	}
	
	public double getCosteMinuto()
	{
		return this.costeMinuto;
	}
}
