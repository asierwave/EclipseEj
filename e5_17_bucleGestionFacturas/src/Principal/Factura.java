package Principal;

import java.util.Scanner;

public class Factura {

	//Dentro de una clase no se imprime nada, tiene que ser en el main
	
	//Atributos
	private String codigoArticulo;
	private int cantidadLitros;
	private float precioLitro;
	private float importeTotal;
	
	
	//Constructores
	public Factura(String codigoArticulo, int cantidadLitros, float precioLitro) {
		super();
		this.codigoArticulo = codigoArticulo;
		this.cantidadLitros = cantidadLitros;
		this.precioLitro = precioLitro;
		
		calcularImporte();
	}
	
	public Factura (Scanner teclado) {
		System.out.println("Introduzca código del artículo");
		this.codigoArticulo = teclado.nextLine();
		System.out.println("Introduzca la cantidad de litros");
		this.cantidadLitros = teclado.nextInt();
		System.out.println("Introduzca el precio por litro");
		this.precioLitro = teclado.nextFloat();
		teclado.nextLine(); // Siempre después de números si se introducen dos tipos, después
		
		calcularImporte();
	}
	
	public void calcularImporte() {
		this.importeTotal = this.cantidadLitros * this.precioLitro;
		
	}
	
	// No hace falta llamarla para que imprima, con que imprimas el objeto Factura vale
	public String toString(){
		String mensaje = "COD: "+this.codigoArticulo+"\n";
		mensaje +="Cantidad"+this.cantidadLitros+"\n";
		mensaje += "Precio Litro:"+this.precioLitro+"\n";
		mensaje += "El importe total es "+importeTotal;
		return mensaje;
	}

	public float getImporteTotal() {
		return importeTotal;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}
	
	

	public int getCantidadLitros() {
		return cantidadLitros;
	}

	public void setImporteTotal(float importeTotal) {
		this.importeTotal = importeTotal;
	}
	
}
