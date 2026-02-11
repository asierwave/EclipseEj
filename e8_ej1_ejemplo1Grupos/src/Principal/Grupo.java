package Principal;

public class Grupo {
	
	private static int secuencia = 1;
	private int codigo;
	private String denominacion;

	
	private Alumno vector[]; //aquí guardamos un grupo de alumnos, es decir, a todos los alumnos, como objeto
	private int nAlumnosActual; //numero de alumnos del grupo, hay que guardarlo siempre porque no lo sabemos y nos da la primera posición libre
	
	
	
	public Grupo(String denominacion)
	{
		
		this.codigo = secuencia;
		secuencia++;
		this.denominacion = denominacion;
		this.vector = new Alumno[30];
		this.nAlumnosActual = 0;
		
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
		
		for (int i = 0; i<this.nAlumnosActual; i++)
		resultado += "\t"+vector[i]+"\n";
		return resultado;
}
	
	
	

	public void addAlumno(Alumno a) {
		
		
		if (this.nAlumnosActual < vector.length)
		{
			
			this.vector[this.nAlumnosActual] =a;
			this.nAlumnosActual ++;
			
		}
		
		
		
	}
}

