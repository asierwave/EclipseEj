package Principal;

import java.util.ArrayList;

public class Repositorio {


	private ArrayList<Empleado> lista;
	
	public Repositorio() {
		super();
		this.lista = new ArrayList<>();
	}
	
	
	public boolean alta(Empleado e) {
			
		return lista.add(e); //devuelve un boolean ya el método .add, quitamos el boolean exito

	}
	
	
	
	public boolean baja(String nSegSocial) {
		
		boolean exito = false;
		
		for (Empleado e : lista) {
			if (e.getnSegSocial().contentEquals(nSegSocial)) {
			lista.remove(e);
			exito = true;
			}
		}
		
		return exito;
	}


	@Override
	public String toString() {
		String resultado = "LISTADO DE EMPLEADOS\n";
		resultado +="==============\n";
		for (Empleado e:lista)
			resultado += e+"n";
		
		return resultado;
		
	}
	
	
	
	
	
	
	
}
