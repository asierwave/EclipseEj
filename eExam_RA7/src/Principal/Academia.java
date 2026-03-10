package Principal;

import java.time.LocalDate;
import java.util.Arrays;

public class Academia {

	private String cif;
	private String denominacion;
	private Instrumento[] vector;
	private int nInstrumentos;
	
	
	public Academia(String cif, String denominacion) {
		super();
		this.cif = cif;
		this.denominacion = denominacion;
		this.vector = new Instrumento[20]; // Máximo 20 instrumentos
		this.nInstrumentos = 0;
	}

	
	
	public boolean alta (Instrumento ins) {
		
		boolean exito =false;
		
		if (nInstrumentos < vector.length) {
			vector[nInstrumentos] = ins;
			nInstrumentos++;
			exito = true;
		}
		
		return exito;
	}
	
	
	
	public String imprimirCoste() {
	
		String resultado = "\nCOSTE DE MANTENIMIENTO";
		
		
		for (int i=0; i<nInstrumentos; i++) {
			

			if(vector[i].getClass().toString().equals("class Principal.Tambor"))
				resultado+="\n"+ vector[i].getNombre()+ " - "+(float)vector[i].calcularCosteMantenimiento(); //El float es para formatear el double a un solo decimal
			
			if(vector[i].getClass().toString().equals("class Principal.Guitarra"))
				resultado+="\n"+ vector[i].getNombre()+ " - "+(float)vector[i].calcularCosteMantenimiento();  			
			if(vector[i].getClass().toString().equals("class Principal.Piano"))
				resultado+= "\n"+vector[i].getNombre()+ " - "+(float)vector[i].calcularCosteMantenimiento();

		}
		
		return resultado;
	
	}
	
	
	
	
	public String imprimirRevision() {
		
		String aRevisar="\nPENDIENTES DE REVISIÓN";
		boolean seRevisa=false;

		for (int i=0; i<nInstrumentos; i++) {
			
			int añoActual = LocalDate.now().getYear();
			int añoAdquisicion = vector[i].getFechaAdquisicion().getYear();
			
			
			//Calculamos según la clase
			if (vector[i].getClass().toString().equals("class Principal.Piano") && añoActual > añoAdquisicion+3) {
				aRevisar+= "\n"+vector[i].toString();
				seRevisa=true;
			}
				
			if (vector[i].getClass().toString().equals("class Principal.Guitarra") && añoActual > añoAdquisicion+5) {
				aRevisar+= "\n"+ vector[i].toString();
				seRevisa=true;
			} 
			
			if (vector[i].getClass().toString().equals("class Principal.Tambor") && añoActual > añoAdquisicion+4) {
				aRevisar+= "\n"+ vector[i].toString();
				seRevisa=true;
			}
		
		}
		
		if (!seRevisa) {	
			aRevisar+="************************************ \n NO HAY INSTRUMENTOS PENDIENTES DE REVISIÓN";
		}
		
		return aRevisar;
		
	}
	
	
	
	
	

	@Override
	public String toString() {
		String resultado = "Academia " + denominacion + ", CIF: " + cif+ "\n";
		
		if (nInstrumentos == 0)
			resultado += "No hay instrumentos registrados";
		else {
		
		for (int i=0; i<nInstrumentos; i++) 
			resultado+= "\n"+vector[i].toString();
		
		}
		
		return resultado;
	}


	
	

	
	
	
}
