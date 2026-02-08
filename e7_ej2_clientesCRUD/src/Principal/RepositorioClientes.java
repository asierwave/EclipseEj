package Principal;

public class RepositorioClientes {
	
	private Cliente vector [];
	private Cliente vector2 [];
	
	
	private int nClientesActual1;
	private int nClientesActual2;
	
	public RepositorioClientes (int nMaxClientes) {
		
		vector = new Cliente[nMaxClientes]; //Reservas espacio para el primer vector
		vector2 = new Cliente [nMaxClientes]; //Reservas espacio para el segundo vector
		nClientesActual1 = 0;
	}
	
	
	public String toString()
	{
		String resultado = "";
		
		if (this.nClientesActual1 == 0)
		{
			resultado += "No hay clientes en la empresa";
		} else {
			for (int i=0; i< nClientesActual1; i++) 
				resultado += vector[i]+"\n\n";
		}
				return resultado;
		
	}

}
