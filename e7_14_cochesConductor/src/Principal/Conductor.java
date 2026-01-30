package Principal;

import java.util.Scanner;

public class Conductor {
	
	String nombre;
	int km;
	
	
	public Conductor (String nombre) {
		this.nombre = nombre;
		this.km = 0;
	}
	
	
	public Conductor (Scanner sc) {
		System.out.println("Introduzca nombre del conductor: ");
		nombre = sc.nextLine();
		this.km = 0;
	}
	
	
	
	public void addKm (int cantidadKm) {
		this.km += cantidadKm;
	}
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getKm() {
		return km;
	}



	public void setKm(int km) {
		this.km = km;
	}



	public String toString() {
		String resultado = "";
		resultado += "Nomnre: "+nombre;
		resultado += " Km: "+km;
		return resultado;
		}
	
	
	
	
	

}
