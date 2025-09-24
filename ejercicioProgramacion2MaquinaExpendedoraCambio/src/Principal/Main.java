package Principal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		float precioProducto, cantidadIntroducida, cantidadDevolverTotal;
		float cantidadDevolver;
		int b20, b10, b5;
		int m2, m1;
		int mc50, mc20, mc10, mc5, mc2, mc1;
		
		b20=b10=b5=m2=m1=mc50=mc20=mc10=mc5=mc2=mc1=0; //Inicializar las variables a cero de golpe
		
		System.out.println("Dame el precio del producto: ");
		precioProducto = teclado.nextFloat();
		System.out.println("Introduce la cantidad que vas a entregar para pagar:");
		cantidadIntroducida = teclado.nextFloat();
		
		
		cantidadDevolver= cantidadIntroducida - precioProducto; 		
		//Aquí se desglosa la cantidad. Como hemos dicho hay que multiplicar por 100 para evitar el problema de los céntimos mas adelante 50 en vez de 0,50
		
		
		cantidadDevolverTotal = cantidadDevolver;
		
		
		
		cantidadDevolver = cantidadDevolver * 100; //Se multiplica la cantidad a devolver por 100
		b20= (int)cantidadDevolver / 2000; //Haz esta división pero ignora que cantidad Devolver es float, quiero la división en entero. El (int) afecta a la división.
		cantidadDevolver= cantidadDevolver % 2000; //Se halla el resto de la división anterior que es lo que nos interesa para las divisiones sucesivas
		
		
		b10= (int)cantidadDevolver / 1000; //Valor 1000 es billetes de 10 euros *100.Haz esta división pero ignora que cantidad Devolver es float, quiero la división en entero. El (int) afecta a la división.
		cantidadDevolver= cantidadDevolver % 1000; 
	
		b5= (int)cantidadDevolver / 500; //Valor 500 es billetes de 5 euros *100.Haz esta división pero ignora que cantidad Devolver es float, quiero la división en entero. El (int) afecta a la división.
		cantidadDevolver= cantidadDevolver % 500; 
		
		m2= (int)cantidadDevolver / 200;
		cantidadDevolver= cantidadDevolver % 200; 
		
		m1= (int)cantidadDevolver / 100; 
		cantidadDevolver= cantidadDevolver % 100; 
		
		mc50= (int)cantidadDevolver / 50; 
		cantidadDevolver= cantidadDevolver % 50; 
		
		mc20= (int)cantidadDevolver / 20; 
		cantidadDevolver= cantidadDevolver % 20; 
		
		mc10= (int)cantidadDevolver / 10; 
		cantidadDevolver= cantidadDevolver % 10; 
		
		mc5= (int)cantidadDevolver / 5; 
		cantidadDevolver= cantidadDevolver % 5; 
		
		
		System.out.println("Este es el total a devolver: "+cantidadDevolverTotal+"€, que se divide en:");

		
		System.out.println("Total billetes a devolver de 20€:"+b20);
		System.out.println("Total billetes a devolver de 10€:"+b10);
		System.out.println("Total billetes a devolver de 5€:"+b5);
		System.out.println("Total monedas a devolver de 2€:"+m2);
		System.out.println("Total monedas a devolver de 1€:"+m1);
		System.out.println("Total monedas a devolver de 50 céntimos:"+mc50);
		System.out.println("Total monedas a devolver de 20 céntimos:"+mc20);
		System.out.println("Total monedas a devolver de 10 céntimos:"+mc10);
		System.out.println("Total monedas a devolver de 5 céntimos:"+mc5);
		System.out.println("Total monedas a devolver de 2 céntimos:"+mc2);
		System.out.println("Total monedas a devolver de 1 céntimos:"+mc1);
		

	}
}

