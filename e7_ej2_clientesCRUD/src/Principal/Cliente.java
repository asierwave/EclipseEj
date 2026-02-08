package Principal;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {

	
	
	
	private LocalDate fechaAlta;


	public Cliente (Scanner sc)
	{
		
		int dia, mes, anyo;
		String fecha;
		String tokens[];
		
		
		
		this.codigo=secuencia++;
		System.out.println("Nombre: ");
		this.nombre = sc.nextLine();
		System.out.println("Tipo (EMPRESA ó PARTICULAR)");
		this.tipo = Tipo.valueOf(sc.nextLine().toUpperCase());
		System.out.println("Fecha(dd mm aaaa");
		fecha= sc.nextLine();
		tokens = fecha.split("[ /-]+"); //split es una expresión regular para dividir una cadena según el elemento de división que se indique, 
		//en este caso el / porque es una fecha
		
		
		do 
		{
		
		if (tokens.length==3) {
		dia = Integer.parseInt(tokens[0]);
		mes = Integer.parseInt(tokens[1]);
		anyo = Integer.parseInt(tokens[2]);
		this.fechaAlta = LocalDate.of(anyo, mes, dia);
		}
		else
			System.out.println("Fecha incorrecta");
		}while (tokens.length!=3);
		
		
		System.out.println("Introduzca facturación");
		this.facturacion = Float.parseFloat(sc.nextLine()); //Para evitar tener que poner sc.nextLine(); para borrar buffer
		
	}
	
	
	public String getNombre() {
		
	}
	
	
	
	
	
	
}
