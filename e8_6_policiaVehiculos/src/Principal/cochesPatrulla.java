package Principal;

public class cochesPatrulla {
	private coche cochesVector[];
	private final int nMaxCochesRegistrados = 3; //por los tres turnos
	private int nCochesRegistrados;
	
	public cochesPatrulla ()
	{
		this.cochesVector = new coche[this.nMaxCochesRegistrados];
		
	}
	
	public boolean alta(coche c) {
		boolean exito = false;
		
		if (nCochesRegistrados < cochesVector.length)
		{
			exito = true;
			cochesVector[this.nCochesRegistrados]=c;
			this.nCochesRegistrados++;
			
		}
		return exito;
			
	}
	

	
	public String toString() {
		String resultado = "";
		for (int i= 0; i<nCochesRegistrados; i++)
			resultado += cochesVector[i]+"\n";
		return resultado;
	}
	
	
	
	
}
