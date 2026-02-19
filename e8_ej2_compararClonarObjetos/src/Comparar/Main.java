package Comparar;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona ("123", "Asier", "Toral");
		Persona p2 = new Persona ("123", "Asier", "Toral");

		if (p1.equals(p2))
			System.out.println("Iguales");
		else
			System.out.println("Distintos");
	}

}
