package Principal;

import java.util.Scanner;

public class Empleado 
{
	private String nombreCompleto;
	private int permanencia; //privado para evitar que el usuario la lie al introducir datos que produzcan incoherencia 
	private float salario;
	private String clasificacion; //atributo calculado, es decir, calculado a partir del resto de los datos

	//Un constructor que recibe un scanenr

public Empleado(Scanner sc)
{
	System.out.println("Nombre: ");
	this.nombreCompleto=sc.nextLine();
	System.out.println("Permanencia: ");
	this.permanencia = sc.nextInt();
	System.out.println("Salario: ");
	this.salario = sc.nextFloat();
	sc.nextLine();
	this.clasificacion = calcularClasificacion();
}


//Constructor sin parámetros
public Empleado () 
{
	this.nombreCompleto="Sin nombre";
	this.permanencia=0;
	this.salario= 1000;
	this.clasificacion= calcularClasificacion();
}


//Constructor con parámetros en un orden determinado
public Empleado (String nombreCompelto, int permanencia, float salario) 
{
	this.nombreCompleto = nombreCompleto;
	this.permanencia = permanencia;
	this.salario = salario;
	this.clasificacion = this.calcularClasificacion();
	
}


public void setPermanencia(int permanencia)
{
	this.permanencia = permanencia;
	this.clasificacion = calcularClasificacion();
	
}

public void aumentarSalario(double porcentaje)
{
	this.salario += this.salario * porcentaje /100.0f;
}


public String getNombreCompleto()
{
	return this.nombreCompleto;
}


//Método para que me diga la clasificación y los métodos de impresión que dependan de cada plataforma en la que imprima: desktop, movil, app web...
public String calcularClasificacion()
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




public String toString()
{
	String resultado = "";
	resultado  += "Nombre del Empleado: "+ this.nombreCompleto+"\n";
	resultado += "Permanencia: " + this.permanencia + "\n";
	resultado += "Salario: " + String.format("%.2f\n", this.salario);
	resultado += "Clasificacion: "+this.clasificacion;
	return resultado;
	
	
}


}
