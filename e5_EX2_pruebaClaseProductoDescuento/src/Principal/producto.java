package Principal;

import java.util.Scanner;

public class producto {

	
	private String nombreProducto;
	private double precioUnitario;
	private int cantidadProducto;
	private boolean aplicaDescuento;
	private String descuento;
	
	
	public producto(String nombre, int cantidadProducto, double precioUnitario, boolean aplicaDescuento) {
		super();
		this.nombreProducto = nombre;
		this.precioUnitario= precioUnitario;
		this.cantidadProducto= cantidadProducto;
		this.aplicaDescuento= aplicaDescuento;
	}
	
	public producto (Scanner teclado) {
		System.out.println("Dame un nombre de producto");
		this.nombreProducto = teclado.nextLine();
		System.out.println("Dame un precio de producto");
		this.precioUnitario= teclado.nextDouble();
		System.out.println("Dame una cantidad de producto");
		this.cantidadProducto= teclado.nextInt();
		System.out.println("¿Tiene descuento (True/false)?");
		this.aplicaDescuento= teclado.nextBoolean();
		teclado.nextLine();
		toString();
	}
	
	public double calcularTotal() {
		double precioTotal;
		precioTotal = (aplicaDescuento==false) ? precioUnitario*cantidadProducto : ((precioUnitario*cantidadProducto)*0.9);
	
		return precioTotal;
	}
	

	
	@Override
	public String toString() {
		return "La compra del producto "+nombreProducto+ " de precio "+precioUnitario+ "€ y cantidad "+(int)cantidadProducto+", cuesta en total "+calcularTotal()+ " y es una "+evaluarCompra();
	}

	public String evaluarCompra() {
		String mensaje = (calcularTotal() > 500) ? "compra grande" : ((calcularTotal() >200 && calcularTotal() <= 500) ? "compra mediana": "compra pequeña");
		return mensaje;
	}
	

	
}
