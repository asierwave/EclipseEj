package Principal;

import Principal.Modelo.Trabajador;

public class Empresa {

	private String cif;
	private String nombre;
	private Trabajador trabajadores[];
	private int nTrabajadoresActual;
	
	public Empresa (String cif, String nombre, int nMaxTrabajadores)
	{
		this.cif = cif;
		this.nombre = nombre;
		this.trabajadores = new Trabajador[nMaxTrabajadores];
	}
	
	public boolean alta(Trabajador t) {
		boolean exito = false;
		
		if (nTrabajadoresActual < trabajadores.length)
		{
			exito = true;
			trabajadores[this.nTrabajadoresActual]=t;
			this.nTrabajadoresActual++;
			
		}
		return exito;
			
	}
	
	
	public String toString() {
		String resultado = this.cif+" "+this.nombre+"\n";
		for (int i= 0; i<nTrabajadoresActual; i++)
			resultado += trabajadores[i]+"\n";
		return resultado;
	}
	
	
	
	
}
