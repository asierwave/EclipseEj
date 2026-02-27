package entregado;

import java.util.Arrays;
import java.util.Scanner;

public class RepositorioPaseos {
	
	Paseo repositorio[];
	int nPaseos=0;

	public RepositorioPaseos(int nMaxPaseos) {
		repositorio = new Paseo[nMaxPaseos];
		this.nPaseos = nPaseos;
		
	}
	
	
	// dar de alta
	
	public boolean alta(Paseo p) {
		boolean exito = false;
		

		
		if (nPaseos < repositorio.length) {
				repositorio[nPaseos] = p ;
				nPaseos++;
				exito = true;
		
		}
		return exito;
		
	}
	
	// dar de alta por scanner
	
	
	public boolean alta(Scanner sc) {
		boolean exito = false;
		Paseo p=null;
		
		if (nPaseos < repositorio.length) 
			alta(new Paseo(sc));
		
		if (alta(p)) {
			exito = true;
		}
		
		return exito;


		
	}
	
	
	
	
	
	// baja de un paseo por id
	
	public boolean baja(int id) {
		
		boolean exito = false;
		
		for (int i=0; i<nPaseos; i++) {
			
			if (id==(repositorio[i].getId())) {
			
			
			for (int j=i; j<nPaseos-1; j++) {
				repositorio[j] = repositorio[j+1];
				
			}
			
			exito = true;
			nPaseos--;
		}
			
			
		}
		
		return exito;
		
	}
	
	
	
	public boolean baja (Scanner sc) {
		boolean exito = false;
		
		
		int idAux;
		
		System.out.println("Dame un id de paseo para localizar el que quieres eliminar: ");
		idAux = Integer.parseInt(sc.nextLine());
		
	
		if (baja(idAux)) {
			exito=true;
		}
		
		return exito;
		
		
	}
	
	
	
	public boolean consulta(Scanner sc) {
		boolean exito = false;
		System.out.println("Dame el nombre del perro para poder buscar el paseo: ");
		String nombrePerroAux = sc.nextLine();
	
		for (int i=0; i<nPaseos; i++) {

		if (nombrePerroAux.equals(repositorio[i].getNombrePerro())) {
			System.out.println(repositorio[i]);
			exito = true;
		}
				
		}
		
		return exito;
		
	}
	
	
	
	
	
	
	


	@Override
	public String toString() {
		String resultado= "               LISTADO DE PASEOS REGISTRADOS                   ";
		
		if (nPaseos != 0) {

		for (int i= 0; i<nPaseos; i++)
			resultado += "\n"+repositorio[i];
			
		} else {
			resultado+= "************* No hay ningún paseo registrado ********************";
		}
		
		return resultado;
	}
	
	
	
	
}
