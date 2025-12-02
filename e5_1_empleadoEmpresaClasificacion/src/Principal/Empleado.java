package Principal;

import java.util.Scanner;

public class Empleado {
	private String nombreCompleto;
	private int permanencia; //privado para evitar que el usuario la lie al introducir datos que produzcan incoherencia 
	private double salario;
	
	private String clasificacion; //atributo calculado, es decir, calculado a partir del resto de los datos



//Constructor sin parámetros
public Empleado () 
{
	this.nombreCompleto="Sin nombre";
	this.permanencia=0;
	this.salario=0;
	}


//Constructor con parámetros en un orden determinado
public Empleado (String nombreCompelto, int permanencia, double salario) 
{
	this.nombreCompleto = nombreCompleto;
	this.permanencia = permanencia;
	this.salario = salario;
	
	this.clasificacion = this.devolverClasificascion();
	
}


//Un constructor que recibe un scanenr

public Empleado (Scanner sc)
{
	System.out.println("Introduzca el nombre completo");
	this.nombreCompleto = sc.nextLine();
	System.out.println("Introduzca año de permanencia: ");
	this.permanencia= sc.nextInt();
	System.out.println("Introduzca el salario: ");
	this.salario= sc.nextDouble();
	
	this.clasificacion = this.devolverClasificascion();
	sc.nextLine();
}



//Método para que me diga la clasificación y los métodos de impresión que dependan de cada plataforma en la que imprima: desktop, movil, app web...
public String devolverClasificascion()
{
	
	String clasificacion = null;
	if (this.permanencia <= 3)
		System.out.println("Principiante");
	
	else
		if (this.permanencia<18)
			clasificacion = "Intermedio";
	
		else
			System.out.println("Sènior");
	
	
	return clasificacion;
}


public void setPermanencia(int n)
{
	this.permanencia = n;
	this.clasificacion = this.devolverClasificascion();
	
}


public void aumentarSalario(double porcentaje)
{
	this.salario += this.salario * porcentaje;
}


public String toString()
{
	String resultado = "";
	resultado  += "Nombre: "+ this.nombreCompleto+"\n";
	resultado+= "Permanencia" + this.permanencia + "\n";
	
	return resultado;
	
	
}





}
