package Principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		asignacionFuncionarios asignacion1 = new asignacionFuncionarios();
		cochesPatrulla vectorCoches1 = new cochesPatrulla();
		coche c=null;
		
		vectorCoches1.alta(new coche("1ED"));
		vectorCoches1.alta(new coche("2DE"));
		vectorCoches1.alta(new coche("3EE"));
		
		
		
		Scanner sc = new Scanner (System.in);
		LocalTime horas; 
	
		
		LocalTime inicioTurno1 = LocalTime.of(00, 00);
		LocalTime finTurno1 = LocalTime.of(7, 59);

		LocalTime inicioTurno2 = LocalTime.of(8, 00);
		LocalTime finTurno2 = LocalTime.of(15, 59);
		
		LocalTime inicioTurno3 = LocalTime.of(16, 00);
		LocalTime finTurno3 = LocalTime.of(23, 59);

		
		
		
		do
		{
			int hora;
			int minuto;
			int turnoId;
			System.out.println("Dame la hora actual:");
			horas = LocalTime.of(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
			
			if (horas.isAfter(inicioTurno1) && finTurno1.isBefore(finTurno1)) { //00
				asignacion1.alta(new funcionario("1323dwe"));
				asignacion1.alta(new funcionario("13sd3sd"));
				
			}
			
			if (horas.isAfter(inicioTurno2) && finTurno2.isBefore(finTurno2)) { //8
				asignacion1.alta(new funcionario("2AAASDD"));
				asignacion1.alta(new funcionario("23DSDDD"));
				turnoId=2;
			}
			
				
			if (horas.isAfter(inicioTurno3) && finTurno3.isBefore(finTurno3)) { //16
				asignacion1.alta(new funcionario("3DFASDD"));
				asignacion1.alta(new funcionario("3D&&&SD"));
				turnoId=3;
			}
			
			if (vectorCoches1!=null)
			System.out.println("El turno es de " +asignacion1+ "con el coche "+ vectorCoches1);
			else
			System.out.println("No hay grupo de asingación asignado a este turno");

		} while (horas == null);
		
		
		
		
	}

}
