package Principal;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		
		//Combinar los digitos de los números, es lo que busca el programa

		
		long numero1 = 0, numero2 = 0;
		long resultado = 0;
		long digito1, digito2;
		long factor = 1; 

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce dos números: ");
		
	numero1 = sc.nextLong();
	numero2 = sc.nextLong();
	System.out.println();
		
		
		//para hacerlo con cadenas
		String c1, c2,r = null;
		
		c1 = numero1 +"";
		c2 = numero2 + "";
		
		
		
		
		for (int  i=1; i<=3; i++) {
		
		
		digito1 = numero1 % 10; //saco el último digito del primer número ej.123
		numero1 = numero1/10; //preparo el número para que la próxima vez solo trabaje con los dos primeros digitos del número 12
		
		
		digito2 = numero2 % 10; //saco el último digito del segundo número ej.456
		numero2 = numero2 /10; //preparo el número para que la próxima vez solo trabaje con los dos primeros digitos del número 45
		
		resultado = digito1 *factor + resultado; //guardamos el último dígito del número introducido, haciendo el resto de 10 teniendo en cuenta que es 123, entonces quedaría el último numero de resto y el 12 de cociente
		factor = factor*10; //incremento el factor para que se sumen los digitos para invertirlos ultimo digito num2 6, ultimo digito num1 3 num2* 10 60 y 60+ 3 63.
		resultado = digito2*factor+resultado; //guardamos el siguiente dígito del número en el resultado
		factor = factor*10;
		
	
		
		}
		
		//otra forma de hacerlo es a través de un while hasta que el numero sea 0, osea el cociente sea 0 y se haya acabado de recorrer el número
		
		while (numero1 != 0) {
			
			numero1 = sc.nextLong();
			numero2 = sc.nextLong();
			
			digito1 = numero1 % 10; //saco el último digito del primer número ej.123
			numero1 = numero1/10; //preparo el número para que la próxima vez solo trabaje con los dos primeros digitos del número 12
			
			
			digito2 = numero2 % 10; //saco el último digito del segundo número ej.456
			numero2 = numero2 /10; //preparo el número para que la próxima vez solo trabaje con los dos primeros digitos del número 45
			
			resultado = digito1 *factor + resultado; //guardamos el último dígito del número introducido, haciendo el resto de 10 teniendo en cuenta que es 123, entonces quedaría el último numero de resto y el 12 de cociente
			factor = factor*10; //incremento el factor para que se sumen los digitos para invertirlos ultimo digito num2 6, ultimo digito num1 3 num2* 10 60 y 60+ 3 63.
			resultado = digito2*factor+resultado; //guardamos el siguiente dígito del número en el resultado
			factor = factor*10;
			
		}
		
		
		
		for (int pos=0; pos<c1.length(); pos++) {
			
			digito1= c1.charAt(pos);
			digito2 = c2.charAt(pos);
			r = digito2+digito1+r;
			
			
		}
		
		
		System.out.println("El resultado es "+resultado);
		sc.close();
	
	}

}
