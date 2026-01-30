package Principal;

import java.util.Scanner;

public class repositorioConductores 
{
	private Conductor conductores[];
	private int nConductores;
	
	public repositorioConductores (int nMaxConductores)
	{
		conductores = new Conductor[nMaxConductores];
		nConductores = 0;
	}
	
	public boolean alta (Conductor c)
	{
		boolean exito = false;
		if (nConductores < conductores.length)
		{
			conductores[nConductores] = c;
			nConductores++;
			exito = true;
		}
		return exito;
	}
	
	public boolean alta (Scanner sc)
	{
		boolean exito=false;
		if (nConductores < conductores.length)
		{
			exito = alta(new Conductor(sc));
		}
		return exito;
	}
	
	public boolean baja(String nombre)
	{
		boolean exito=false;
		for (int i=0;i<nConductores;i++)
			if (nombre.equals(conductores[i].getNombre()))
			{
				for (int j=i;j<nConductores-1;j++)
					conductores[j] = conductores[j+1];
				nConductores--;
				exito = true;
				break; // i--;
			}
		return exito;
	}

	public boolean baja(Scanner sc)
	{
		boolean exito;
		String nombre;
		System.out.println("Introduzca el nombre del conductor a borrar");
		nombre = sc.nextLine();
		exito = baja(nombre);		
		return exito;
	}
	
	public Conductor buscarXnombre(String nombre)
	{
		Conductor c=null;
		for (int i=0;i<nConductores;i++)
			if (nombre.equals(conductores[i].getNombre()))
			{
				c = conductores[i];
				break;
			}
		return c;
	}
	
	public Conductor buscarXnombre(Scanner sc)
	{
		String nombre;
		Conductor c;
		System.out.println("Introduzca nombre del conductor a buscar:");
		nombre = sc.nextLine();
		c = buscarXnombre(nombre);
		return c;
	}
	
	public int getTotalKm()
	{
		int totalKm=0;
		for (int i=0;i<nConductores;i++)
			totalKm = totalKm + conductores[i].getKm();
		return totalKm;
	}
	
	public String toString()
	{
		String resultado="";
		resultado += "LISTADO\n";
		resultado += "=======\n";
		for (int i=0;i<nConductores;i++)
			resultado += conductores[i]+"\n"; 
		return resultado;
	}
}
