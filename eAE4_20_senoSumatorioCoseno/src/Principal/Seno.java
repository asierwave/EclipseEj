package Principal;

public class Seno {
	
	private double angulo;
	private int numero;
	

	public Seno () {
		this.angulo = 0;
		this.numero = 0;
	}
	
	
	public long factorial(int n) {
		
		//cuando vamos a multiplicar en un bucle inicializamos a 1, cuando sumamos, a 0
		int f=1; //tiene que ser 1 para que no se multiplique por 0 siempre y por tanto de 0
		
		for (int i=1; i<=n; i++) 
			f=f*i;
		
			return f;
	}
	
	public double calcularSeno(double angulo, int nTerminos) 
	{
		
		double seno = 0;
		

		for (int i=0; i<nTerminos; i++) 
			seno = seno + (Math.pow(-1, i) * Math.pow(angulo, 2*i+1))/ factorial(2*i +1);
		
		return seno;
		
		
	}
	
	
	
	public double calcularCoseno(double angulo, int nTerminos) 
	{
		
		double coseno = 0;
		

		for (int i=0; i<nTerminos; i++) 
			coseno = coseno + (Math.pow(-1, i) * Math.pow(this.angulo, 2*i+1))/ factorial(2*i +1);
		
		return coseno;
		
		
	}

}
