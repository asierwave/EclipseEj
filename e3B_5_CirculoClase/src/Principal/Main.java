package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r;
		
		//Creamos el teclado
		Scanner teclado = new Scanner (System.in);
		
		
		//Pedimos al usuario que introduzca un radio
		System.out.println("Introduzca el radio: ");
		r = teclado.nextDouble();
		
		
		//Creamos el objeto c1 con la clase Circulo
		Circulo c1 = new Circulo(r);
		
		
		//Imprimimos c1 tal y con el formato del constructor Circulo
		System.out.println(c1);
		
		//Imprimimos resultados de metodos área y perimetro del círculo
		
		System.out.println ("El área vale "+ c1.areaCirculo());
		System.out.printf ("El perímetro de c1 vale %.3f ", c1.perimetroCirculo());
		

	}

}
