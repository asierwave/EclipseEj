package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int hora, minuto, segundo, sigHora, sigMinuto, sigSegundo;
		
		System.out.println("Dame una hora, un minuto y un segundo: ");
		hora = teclado.nextInt();
		minuto =teclado.nextInt();
		segundo = teclado.nextInt();
		
		
		sigSegundo = segundo+1;
		sigMinuto = minuto+1;
		sigHora = hora+1;
		boolean cambioDia = false; //me indica que ha cambiado de día
		
		
	
	if (hora >= 0 && minuto >=0 && segundo >= 0 && hora <25 && minuto < 61 && segundo < 61 ) {
		if (segundo >=0 && segundo< 59) System.out.printf("%02d:%02d:%02d", hora, minuto,sigSegundo);
		else if (segundo >= 59) {
				if (minuto>= 59) {
					if (hora>22)
						{
						System.out.println("00"+":"+"00"+":"+"00");
						cambioDia = true; //esto es un flag que significa que levanta una bandera, un booleano que pasa a TRUE para indicar algo
						
						if (cambioDia == true) System.out.println(" del siguiente día (+1)");

						}
					else System.out.printf("%02d:00:00",sigHora);
				} 
				else System.out.printf("%02d:%02d:00",hora, sigMinuto);
				}
					
		else System.out.println("Datos introducidos incorrectos");
		
	
	} else System.out.println("Datos introducidos incorrectos");
	}
}
	



	
		

