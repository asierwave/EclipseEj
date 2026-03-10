package Principal;

public class flotaVehiculos {

	private Vehiculo[] flota = new Vehiculo[3];
	int nVehiculos = 0;
	
	
	
	public boolean añadir(Vehiculo v) {
		boolean exito = false;
		
		
		if (nVehiculos< flota.length) {
		
		flota[nVehiculos]= v; 
		nVehiculos++;
		exito = true;
		}		
		
		return exito;
		
		
		
	}
	
	
	public boolean buscarPorMarca(String marca) {
		boolean exito = false;
		
		for (int i=0; i<nVehiculos; i++) {
		
		if (flota[i].getMarca().equalsIgnoreCase(marca)){
			exito = true;
			System.out.println(flota[i].describir());
			break;
		}
		}
		
		return exito;
		
	}
	
	
	public String listar() {
		
		String resultado ="Flota de Vehiculos\n";
		
		for (int i=0; i<nVehiculos; i++) {
			resultado += flota[i].describir()+"\n";
		}
		
		return resultado;
		
	}
	
	
}
