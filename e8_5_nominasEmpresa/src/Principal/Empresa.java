package Principal;

import java.util.Arrays;
import java.util.Scanner;

public class Empresa {

	
	
	private Trabajador[] empresa;
	private int nTrabajadores;
	private String cif;
	private String nombre;
	
	
	public Empresa(int nMax) 
	{
		empresa=new Trabajador[nMax];
		this.nTrabajadores=0;
		this.cif = cif;
		this.nombre = nombre;
	}
	
	
	
	public boolean alta(Trabajador t) 
	{
		int op = 0;
		boolean exito = false;

		if(nTrabajadores<empresa.length) 
		{
			empresa[nTrabajadores]=t;
			nTrabajadores++;
			exito=true;
		}
		return exito;
	}



	@Override
	public String toString() {
		return "Empresa [empresa=" + Arrays.toString(empresa) + ", nTrabajadores=" + nTrabajadores + ", cif=" + cif
				+ ", nombre=" + nombre + "]";
	}
	
	
	

}
