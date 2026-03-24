package Principal;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <Persona> conjunto = new HashSet <>();
		//En un conjunto no tiene que haber valores repetidos, ni orden, en un array sí
		// Si tu no defines el hashcode con parámetros específicos, se compara por la posición a la que apuntan, son dos objetos diferentes cada uno con una posición por lo que son diferentes
		
		conjunto.add(new Persona ("Pepe", 34));
		conjunto.add(new Persona ("Ana", 28));
		conjunto.add(new Persona ("Isabel", 19));
		conjunto.add(new Persona ("Ana", 28));
		
		// Si no hubiese un hash en Persona que usase nombre y edad para generar la igualdad UN EQUALS, aparecerían las dos Ana repe, como no, solo sale una.

		System.out.println(conjunto);
	}

}
