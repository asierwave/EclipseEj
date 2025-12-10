package Principal;

public enum Zona {

	
	//El enumerado puede ser básico, sin atributos
	
	
	PRINCIPAL (1000),
	VENTA (200),
	VIP (25),
	PREMIUM (2),
	PISTA (1245);
	
	
	
	private int entradasDisponibles;

	
	//Constructor privado para darle el valor al enumerado
	private Zona (int entradasDisponibles) {
		this.entradasDisponibles= entradasDisponibles;
	}
	
	public int getEntradasDisponibles() {
		return this.entradasDisponibles;
	}
	
	public boolean comprar (int n) 
	{
		boolean exito = false;
		
		if (n <= this.entradasDisponibles) 
		{
			this.entradasDisponibles -= n;
			exito= true;
		}
		
		return exito;
		
		
	}
	
	
	
}
