package Principal;

public class CA {

	private static int secuencia = 1;
	private int codigo;
	private String denominacion;

	
	private Provincia vector[]; //aquí guardamos un grupo de alumnos, es decir, a todos los alumnos, como objeto
	private int nProvinciasActual; //numero de alumnos del grupo, hay que guardarlo siempre porque no lo sabemos y nos da la primera posición libre
	
	
	
	public CA(String denominacion)
	{
		
		this.codigo = secuencia;
		secuencia++;
		this.denominacion = denominacion;
		this.vector = new Provincia[30];
		this.nProvinciasActual = 0;
		
	}
	
	
	public String getDenominacion() {
		// TODO Auto-generated method stub
		return this.denominacion;
	}
	
	
	public String toString() {
		String resultado = "";
		resultado += "Código: "+this.codigo;
		resultado += "Denominación: "+this.denominacion;
		resultado += "\n";
		
		for (int i = 0; i<this.nProvinciasActual; i++)
		resultado += "\t"+vector[i]+"\n";
		return resultado;
}
	
	
	

	public void addProvincia(Provincia p) {
		
		
		if (this.nProvinciasActual < vector.length)
		{
			
			this.vector[this.nProvinciasActual] =p;
			this.nProvinciasActual ++;
			
		}
		
		
		
	}
}
