package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		float facturacionTotal= 0 ;

		
		Factura f1, f2, f3; //Declaro tres variables de tipo objeto Factura

		f1 = new Factura ("5023D", 10, 1.5f);
		f2 = new Factura ("Alcohol",1, 12);
		f3 = new Factura ("Jabón", 20, 3);
		
		facturacionTotal = f1.getImporteTotal()+ f2.getImporteTotal()+ f3.getImporteTotal();
		
		int contadorFacturaMas600 = 0;
		
		System.out.println(f1);
		System.out.println("\n");
		System.out.println(f2);
		System.out.println("\n");
		System.out.println(f3);
		System.out.println("\n");

		
		
		
		//Hay que pasar a cero la facturacionTotal para que no sume lo anterior
		
		facturacionTotal = 0;
		Factura f;
		
		Scanner teclado = new Scanner (System.in);
		for (int i=0; i<3; i++) //Mientras haya menos de tres facturas se pide una nueva factura
		{
			f = new Factura (teclado);
			facturacionTotal = facturacionTotal + f.getImporteTotal();
			if (f.getImporteTotal() >600)
				contadorFacturaMas600++; //Una factura mas de mas de 600 euros si se cumple la condición
			
			if (f.getCodigoArticulo().equals("1")) System.out.println("Los litros del artículo 1 son "+f.getCantidadLitros());
			//Hay que usar getters porque son variables privadas en la clase Factura
		}
		
		
		
		System.out.println("\n");
		System.out.println("Hay "+contadorFacturaMas600+" facturas de mas de 600€");
		System.out.println("La facturación total asciende a "+facturacionTotal+ "€");
		teclado.close();
		
		
	}

}
