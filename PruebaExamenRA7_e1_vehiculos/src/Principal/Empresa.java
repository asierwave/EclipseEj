package Principal;

import java.time.LocalDate;

public class Empresa {
	
	private String cif;
	private String denominacion;
	private Vehiculo coleccionVehiculo[];
	private int nVActual;
	
	
	public Empresa(String cif,String denominacion) {
		super();
		this.cif = cif;
		this.denominacion = denominacion;
		this.coleccionVehiculo = new Vehiculo[20];
		this.nVActual = 0;
	}
	
	
	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public boolean alta(Vehiculo a) {
		boolean exito = false;
		if(coleccionVehiculo.length> nVActual) {
			coleccionVehiculo[nVActual++] = a;
			exito = true;
		}
		return exito;
	}
	
	public String imprimirCoste() {
		String respuesta = "";
		for(int i = 0;i<nVActual;i++)
			respuesta += coleccionVehiculo[i].getModelo()+" - "+coleccionVehiculo[i].calcularCosteMantenimiento()+"\n";
		return respuesta;
			
	}
	public String imprimirITV() {
		String respuesta = "";
		for(int i = 0;i<nVActual;i++) {
			if(coleccionVehiculo[i].getClass().equals(Camion.class)) 
				if(LocalDate.now().getYear() - coleccionVehiculo[i].getFechaMatricula().getYear()  > 3)
					respuesta += coleccionVehiculo[i]+"\n";
			if(coleccionVehiculo[i].getClass().equals(Furgoneta.class))
				if(LocalDate.now().getYear() - coleccionVehiculo[i].getFechaMatricula().getYear()  > 5)
					respuesta += coleccionVehiculo[i]+"\n";
			if(coleccionVehiculo[i].getClass().equals(Motocicleta.class))
				if(LocalDate.now().getYear() - coleccionVehiculo[i].getFechaMatricula().getYear()  > 6)
					respuesta += coleccionVehiculo[i]+"\n";
		}
		respuesta += (respuesta.equals(""))?" NO HAY VEHICULOS DE ITV":"";
		return respuesta;
	}
	
	
	public String toString() {
		String respuesta="";
		respuesta += "CIF de la empresa: "+this.cif+" Denominacion: "+this.denominacion+"\n";
		for(int i = 0;i<nVActual;i++)
			respuesta += coleccionVehiculo[i]+"\n";
		return respuesta;
	}
	
	

}
