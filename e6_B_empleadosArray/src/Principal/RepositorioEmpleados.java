package Principal;

import java.util.Scanner;
// Repositorio de empleados basado en vector
public class RepositorioEmpleados 
{
	private Empleado empleados[]; // Vector de empleados 
	private int nEmpleados; // Número actual de empleados
	
	// Constructor del repositorio
	// Recibe la capacidad total del repositorio.
	public RepositorioEmpleados(int numero)
	{
		this.empleados = new Empleado[numero];
		this.nEmpleados = 0;
	}

	// Alta de empleados
	public boolean alta (Scanner sc)
	{
		boolean exito = false;
		if (nEmpleados<empleados.length)
		{
			exito = alta(new Empleado(sc));
		}
		return exito;
	}
	
	public boolean alta (Empleado empleado)
	{
		boolean exito=false;
		if (nEmpleados<empleados.length)
		{
			empleados[nEmpleados] = empleado;
			nEmpleados++;
			exito = true;
		}
		return exito;
	}
	
	// Listado de empleados
	public void listado()
	{
		if (nEmpleados == 0)
			System.out.println("No hay empleados");
		else
		{
			System.out.println("LISTADO DE EMPLEADOS");
			System.out.println("====================");
			for (int i=0;i<nEmpleados;i++)
			{
				System.out.println(empleados[i]);
			}
		}

	}
	
	//Baja de empleados
	public boolean baja (Scanner sc)
	{
		boolean exito;
		String dni;
		System.out.println("Introduzca el dni a dar de baja");
		dni = sc.nextLine().toUpperCase();
		exito = baja(dni);
		return exito;
	}
	
	public boolean baja (String dni)
	{
		boolean exito = false;
		for (int i=0;i<nEmpleados;i++)
			if (dni.equals(empleados[i].getDni()))
			{
				for (int j=i;j<nEmpleados-1;j++)
					empleados[j] = empleados[j+1];
				nEmpleados--;
				exito = true;
				break; // i--;
			}
		return exito;
	}
	
	// Consulta de empleados por DNI
	public boolean consultarXdni(Scanner sc)
	{
		boolean exito;
		String dni;
		System.out.println("Inotrduzca el dni");
		dni = sc.nextLine();
		exito = consultaXdni(dni);
		return exito;
	}
	
	public boolean consultaXdni(String dni)
	{
		boolean exito = false;
		for (int i=0;i<nEmpleados;i++)
			if (dni.equals(empleados[i].getDni()))
			{
				System.out.println(empleados[i]);
				exito = true;
				// break; Si sólo quiero buscar el primero
			}
		return exito;
	}
	
	// Modificación de empleados por DNI
	public boolean modificaXdni(String dni,Scanner sc)
	{
		boolean exito = false;
		String nuevoNombre;
		float nuevoSalario;
		for (int i=0;i<nEmpleados;i++)
			if(dni.equals(empleados[i].getDni()))
			{
				exito = true;
				System.out.println(empleados[i]);
				empleados[i].actualizaDatos(sc);
			}
		return exito;
	}
	
	public boolean modificaXdni (Scanner sc)
	{
		boolean exito;
		String dni;
		System.out.println("Introduzca el dni:");
		dni = sc.nextLine();
		exito = modificaXdni (dni,sc);
		return exito;
	}
}