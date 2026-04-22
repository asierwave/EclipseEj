package Joaquin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Map<String,Double> almacen = new HashMap<>();
		Map<String,Integer> carrito = new HashMap<>();
		String producto;
		int cantidad;
		double precioUnidad,precioTotal,precioFinal = 0;
		
		almacen.put("Avena",2.21);
		almacen.put("Garbanzos",2.39);
		almacen.put("Tomate",1.59);
		almacen.put("Jengibre",3.13);
		almacen.put("Quinoa",4.50);
		almacen.put("Guisantes",1.60);
		
		System.out.println("Introduzca producto a comprar (FIN)");
		producto = sc.nextLine();
		while (!"FIN".equals(producto.toUpperCase()))
		{
			if (almacen.get(producto)!=null) // ¿Existe el producto en el almacen?
			{
				System.out.println("Introduzca cantidad a comprar");
				cantidad = Integer.parseInt(sc.nextLine());
				carrito.put(producto,carrito.getOrDefault(producto,0)+cantidad);
			}
			else
			{
				System.out.println("Ese producto no existe");
				System.out.println(almacen);
			}
			System.out.println("Introduzca producto a comprar (FIN)");
			producto = sc.nextLine();
		}
		
		System.out.println("Carrito de la compra");
		System.out.println("====================");
		
		for (Map.Entry<String, Integer> item : carrito.entrySet())
		{
			producto = item.getKey();
			cantidad = item.getValue();
			precioUnidad = almacen.get(producto);
			precioTotal = precioUnidad * cantidad;
			precioFinal += precioTotal;
			
			System.out.print(producto+" "+cantidad+" ");
			System.out.print(precioUnidad+" euros/ud. ");
			System.out.println(precioTotal+" euros.");
		}
		System.out.println("Total a pagar: "+precioFinal);
		sc.close();
	}
}
