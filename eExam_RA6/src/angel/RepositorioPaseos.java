package angel;

import java.util.Scanner;

public class RepositorioPaseos 
{
	
	private Paseo vector[];
	private int nPaseosActuales;
	
	
	public RepositorioPaseos(int nMax) 
	{
		vector=new Paseo[nMax];
		this.nPaseosActuales=0;
	}
	
	public boolean alta(Paseo p) 
	{
		boolean exito=false;
		if(nPaseosActuales<vector.length) 
		{
			vector[nPaseosActuales]=p;
			nPaseosActuales++;
			exito=true;
		}
		return exito;
	}
	public boolean alta (Scanner sc) 
	{
		boolean exito=false;
		if(nPaseosActuales<vector.length)
			exito=alta(new Paseo(sc));
		return exito;
	}
	
	public boolean baja(int id) 
	{
		boolean exito=false;
		for(int i=0;i<nPaseosActuales;i++)
			if(vector[i].getId()==id) 
			{
				for(int j=i;j<nPaseosActuales-1;j++)
					vector[j]=vector[j+1];
				exito=true;
				nPaseosActuales--;
				break;
			}
		return exito;
							
	}
	
	public Paseo buscarXnombre(String nombre) 
	{
		Paseo p=null;
		for(int i=0;i<nPaseosActuales;i++)
			if(vector[i].getNombrePerro().equals(nombre)) 
			{
				p=vector[i];
				break;
			}
		return p;
	}
	
	
	public String toString()
	{
		String resultado="";
		if(nPaseosActuales==0)
			resultado+="no existen paseos";
		else
			for(int i=0;i<nPaseosActuales;i++)
				resultado+=vector[i]+"\n";
		return resultado;
	}

	
}
