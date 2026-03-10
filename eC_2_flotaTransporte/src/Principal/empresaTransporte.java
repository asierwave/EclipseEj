package Principal;

public class empresaTransporte {

	private Vehiculo[] flota; //inicializamos
	int nVehiculos = 0;
	
	
	
	public empresaTransporte(int nMaxVehiculos) {
		this.flota = new Vehiculo[nMaxVehiculos];
		this.nVehiculos = nVehiculos;
	}
	
	
	
	public boolean añadirVehiculo (Vehiculo v) {
		
	 boolean exito = false;
	 
	 if (nVehiculos < flota.length) {
		 flota[nVehiculos]= v;
		 nVehiculos++;
		 exito = true;
	 }
	 
	 return exito;
		
		
	}
	
	
	
	@Override
	public String toString() {
	
		String resultado = "Flota estelar\n";
				
		for (int i=0; i<nVehiculos; i++) {
		resultado+= flota[i].toString();
		}

		return resultado; 
	}

	
	
	
	
	
}
