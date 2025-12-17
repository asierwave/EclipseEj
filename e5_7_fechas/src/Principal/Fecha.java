package Principal;

import java.time.LocalDate;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	private boolean bisiesto;
	
	
	public Fecha () {
		
	}
	
	
	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	public boolean esBisiesto () {
		
		bisiesto = false;
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano %400 == 0) 
			bisiesto = true;
		
		
		
		return bisiesto;
		
	}
	
	
	public static LocalDate tiempoTranscurrido (LocalDate fecha1, LocalDate fecha2) {
	int mesAux, diaAux, anoAux;
	
	mesAux = fecha2.getMonthValue();
	diaAux = fecha2.getDayOfMonth();
	anoAux = fecha2.getYear();
	
	diaAux = anoAux*12*30 + mesAux*30 + diaAux;
	
	LocalDate transcurso = fecha1.minusDays(diaAux); 
	return transcurso;
	
	}
	
	
	

}
