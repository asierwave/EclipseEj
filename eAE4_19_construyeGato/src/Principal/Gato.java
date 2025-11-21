package Principal;

import java.util.Scanner;

public class Gato
{

private String nombre;
private int edad;
private int horas;
private float total;


public Gato(String nombre, int edad, int horas) {

	super();
	this.nombre = nombre;
	this.edad = edad;
	this.horas = horas;
	this.total = -1; //Todavía no tiene facturación
	
}

public Gato (Scanner teclado )
{
	System.out.println("Introduzca nombre: ");
	this.nombre = teclado.nextLine();
	System.out.println("Introduzca edad: ");
	this.edad = teclado.nextInt();
	System.out.println("Introduzca horas: ");
	this.horas = teclado.nextInt();
	teclado.nextLine();
	this.total = -1;//Todavía no tiene facturación
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


public void calcularFactura (double costeHora){
	float descuento;
	descuento = (this.edad <5)? 0.1f: (this.edad <20)? 0.05f:0f;
	this.total = (float)(this.horas * costeHora);
	this.total = this.total*(1-descuento);

}



@Override
public String toString() {
	String resultado = "";
	resultado += "Nombre "+this.nombre+ "\n";
	resultado += "Edad "+this.edad +"\n";
	resultado += (this.total ==-1) ? "Factura abierta":String.format("%.2f euros",this.total);
	return resultado;
}


}